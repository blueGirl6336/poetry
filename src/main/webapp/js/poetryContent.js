new Vue({
    el: '#vue_moudle',
    data: {
        userId: 0,
        userName: '',
        poetryId:1,
        leftOutlineList: [
            {
                name: '正文',
                aHref: '#originalText',
            },
            {
                name: '注释',
                aHref: '#detail',
            },
            {
                name: '译文',
                aHref: '#translation',
            },
            {
                name: '赏析',
                aHref: '#appreciation',
            },
            {
                name: '作者',
                aHref: '#author',
            },
            {
                name: '评论',
                aHref: '#comment_moudle_container',
            },
        ],
        rightOutlineList: [
            {
                name: '收藏',
                iconSrc: 'glyphicon glyphicon-heart-empty',
            },
            {
                name: '下载',
                iconSrc: 'glyphicon glyphicon-save',
            }
        ],
        notLike: true,
        poetryTitle: '',
        poetryAuthorDynasty: '',
        poetryAuthor: '',
        poetryContent: '',
        poetryAnalysisList: [
            {
                moudleId: 'detail',
                moudleName: '注释',
                moudleContent: '',
            },
            {
                moudleId: 'translation',
                moudleName: '译文',
            },
            {
                moudleId: 'appreciation',
                moudleName: '赏析',
                moudleContent: '',

            },
            {
                moudleId: 'author',
                moudleName: '作者',
                moudleContent: '',
            }
        ],
        commentShow: false,
        commentList: [],
        commentContent: '',
        replyContent: '',
    },
    mounted: function () {
        this.$nextTick(function () {
            var that = this;
            console.log("document.cookie: " + document.cookie);
            var arrCookie = document.cookie.replace(/[ ]/g,"").split(";");
            for(var i = 0;i < arrCookie.length; i++){
                console.log(arrCookie[i]);   
                var arr = arrCookie[i].split("="); 
                if(arr[0] == "userName"){
                    this.userName = arr[1];
                }
                if(arr[0] == "userId"){
                    this.userId = arr[1];
                }
            }
            this.poetryId = document.URL.split("?")[1].split("=")[1];
            $.ajax({
                url:"../poetry/queryPoetryContentAndCommentsById",
                data:{
                    id: this.poetryId,
                    userId: this.userId
                },
                type:"get",
                dataType:"json",
                success:function(data)
                {
                    console.log("queryPoetryContentAndCommentsById success");
                    that.poetryTitle = data.data.poetry.mingcheng;
                    that.poetryAuthorDynasty = data.data.poetry.chaodai;
                    that.poetryAuthor = data.data.poetry.zuozhe;
                    that.poetryContent = data.data.poetry.yuanwen;
                    if(data.data.zhujie != "null"){
                        that.poetryAnalysisList[0].moudleContent = data.data.zhujie;
                    }else{
                        that.poetryAnalysisList[0].moudleContent = "暂无";
                    }
                    if(data.data.yiwen != "null"){
                        that.poetryAnalysisList[1].moudleContent = data.data.yiwen;
                    }else{
                        that.poetryAnalysisList[1].moudleContent = "暂无";
                    }
                    if(data.data.shangxi != "null"){
                        that.poetryAnalysisList[2].moudleContent = data.data.shangxi;
                    }else{
                        that.poetryAnalysisList[2].moudleContent = "暂无";
                    }
                    if(data.data.zuozhe != "null"){
                        that.poetryAnalysisList[3].moudleContent = data.data.zuozhe;
                    }else{
                        that.poetryAnalysisList[3].moudleContent = "暂无";
                    }
                    that.notLike = data.data.notLike;
                    if(data.data.comment != "null"){
                        console.log("data.data.comment != null");
                        var commentList = data.data.comment;
                        for(var i = 0; i < commentList.length; i++){
                            commentList[i].replyNum = commentList[i].replyBeanList.length;
                            commentList[i].notLike = true;
                            commentList[i].addReplyShow = false;
                            if(commentList[i].replyBeanList.length == 0){
                                commentList[i].replyShow = false;
                            }else{
                                commentList[i].replyShow = true;
                            }
                            for(var j = 0; j < commentList[i].replyBeanList.length; j++){
                                commentList[i].replyBeanList[j].notLike = true;
                            }
                        }
                        that.commentList = commentList;
                        console.log("now commentList[0].replyBeanList[0].notLike:  " + that.commentList[0].replyBeanList[0].notLike);
                        that.commentShow = true;
                    }else{
                        console.log("data.data.comment == null");
                        that.commentShow = false;
                    }
                }
            }); 
        })
    },
    methods: {
        insertComment: function(){
            var commentDateTime = this.$options.methods.getNowTime();
            var commentContent = this.commentContent.replace(/<br>/g, "\n");
            $.ajax({
              url:"../comment/insertComment",
              data:{
                poetryId: this.poetryId,
                commentUId: this.userId,
                commentContent: commentContent,
                commentDateTime: commentDateTime,
                commentLikeNum: 0
              },
                type:"get",
                dataType:"json",
                success:function(data)
                {
                    alert(data.data);
                    console.log("insertComment success");
                    location.reload();
                }
            });
        },
        clickLikeIcon: function(index, commentId){
            var that = this;
            $.ajax({
              url:"../comment/addCommentLikeNum",
              data:{
                commentId: commentId,
              },
                type:"get",
                dataType:"json",
                success:function(data)
                {
                    console.log("addCommentLikeNum success");
                    that.commentList[index].notLike = false;
                    that.commentList[index].commentLikeNum ++;
                }
            });
        },
        clickReplyIcon: function(index){
            this.commentList[index].replyShow = true;
            for(var i = 0; i < this.commentList.length; i++){
                this.commentList[i].addReplyShow = false;
            }
            this.commentList[index].addReplyShow = true;
        },
        insertReply: function(toCommentId, toUId){
            var replyDateTime = this.$options.methods.getNowTime();
            var that = this;
            var replyContent = this.replyContent.replace(/<br>/g, "\n");
            console.log("replyContent: " + replyContent);
            $.ajax({
              url:"../reply/insertReply",
              data:{
                  toCommentId: toCommentId,
                  fromUId: that.userId,
                  toUId: toUId,
                  replyContent: replyContent,
                  replyDateTime: replyDateTime,
                  replyLikeNum: 0
              },
                type:"get",
                dataType:"json",
                success:function(data)
                {
                    alert(data.data);
                    console.log("insertReply success");
                    location.reload();
                }
            });
        },
        clickReplyLikeIcon: function(commentIndex, replyIndex, replyId){
            var that = this;
            $.ajax({
              url:"../reply/addReplyLikeNum",
              data:{
                replyId: replyId,
              },
                type:"get",
                dataType:"json",
                success:function(data)
                {
                    console.log("addReplyLikeNum success");
                    that.commentList[commentIndex].replyBeanList[replyIndex].notLike = false;
                    that.commentList[commentIndex].replyBeanList[replyIndex].replyLikeNum ++;
                }
            });
        },
        downloadPoetry: function(){
            var that = this;
            $.ajax({
              url:"../download/insertDownload",
              data:{
                downloadUId: this.userId,
                downloadPoetryId: this.poetryId
              },
                type:"get",
                dataType:"json",
                success:function(data)
                {
                    console.log("insertDownload success");
                    if(data.success == true){
                        var txtPoetry = that.poetryContent.replace(/<br>/g, "\n");
                        var txtZhushi = that.poetryAnalysisList[0].moudleContent.replace(/<br>/g, "\n");
                        var txtYiwen = that.poetryAnalysisList[1].moudleContent.replace(/<br>/g, "\n");
                        var txtShangxi = that.poetryAnalysisList[2].moudleContent.replace(/<br>/g, "\n");
                        var txtZuozhe = that.poetryAnalysisList[3].moudleContent.replace(/<br>/g, "\n");
                        var txtContent = '正文' + "\r" + '\n' + txtPoetry + '\r' + '注释' + "\r" + '\n' + txtZhushi + '\r' + '\n' + '译文' + '\r' + '\n' +
                                         txtYiwen + "\r" + '\n'  + '赏析' + "\r"  + '\n' + txtShangxi + '\r' + '作者' + "\r" + '\n' + txtZuozhe + '\r';
                        that.$options.methods.download(that.poetryTitle, txtContent);
                    }else{
                        alert(data.data);
                    }
                }
            });
        },
        collectPoetry: function(){
            var that = this;
            $.ajax({
              url:"../collect/insertCollect",
              data:{
                collectUId: this.userId,
                collectPoetryId: this.poetryId
              },
                type:"get",
                dataType:"json",
                success:function(data)
                {
                    console.log("insertCollect success");
                    that.notLike = false;
                }
            });
        },
        download: function (filename, text){ 
            var element = document.createElement('a'); 
            element.setAttribute('href', 'data:text/plain;charset=utf-8,' + encodeURIComponent(text)); 
            element.setAttribute('download', filename); 
            element.style.display = 'none'; 
            document.body.appendChild(element); 
            element.click(); 
            document.body.removeChild(element); 
        },
        getNowTime: function(){
            var myDate = new Date();
            var year = myDate.getFullYear(); 
            var month = myDate.getMonth() + 1;
            if (month >= 1 && month <= 9) {
                month = "0" + month;
            }
            var day = myDate.getDate();
            if (day >= 1 && day <= 9) {
                day = "0" + day;
            }
            var hour = myDate.getHours();
            if (hour >= 0 && hour <= 9) {
                hour = "0" + hour;
            }
            var minute = myDate.getMinutes();
            if (minute >= 0 && minute <= 9) {
                minute = "0" + minute;
            }
            var second = myDate.getSeconds();
            if (second >= 0 && second <= 9) {
                second = "0" + second;
            }
            var commentDateTime = year + '-' + month + '-' + day + ' ' + hour + ':' + minute + ':' + second;
            console.log("commentDateTime" + commentDateTime);
            return commentDateTime;
        }
    }
})

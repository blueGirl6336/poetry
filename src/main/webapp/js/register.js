



// $(document).ready(function(){
//   console.log("register.js");

//     $.ajax({
//         url:"../user/register",
//         //traditional:true,
//         data:{
//             userName: "test1",
//             password: "test1"
//         },
//         type:"get",
//         dataType:"json",
//         success:function(data)
//         {
//             console.log(data.success);
//         }
//     });
// });

new Vue({
    el: '#app',
    data: {
        userName: '',
        password: '',
        passwordRefirm: ''
    },
    methods: {
        register: function(){
            if(this.password != this.passwordRefirm){
                alert("两次输入密码不一样，请重新输入密码");
                window.location.reload();
            }else{
                $.ajax({
                    url:"../user/register",
                    data:{
                        userName: this.userName,
                        password: this.password
                    },
                    type:"get",
                    dataType:"json",
                    success:function(data)
                    {
                        if(data.data == '注册成功'){
                            alert("注册成功");
                            window.location.href = "../login.html";
                        }else{
                            alert("注册失败，请重新注册");
                        }
                    }
                });
            }
        }
    }
})
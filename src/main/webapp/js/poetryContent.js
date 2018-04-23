new Vue({
    el: '#vue_moudle',
    data: {
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
        poetryTitle: '沁园春·雪',
        poetryAuthorDynasty: '现代',
        poetryAuthor: '毛泽东',
        poetryContent: '北国风光，千里冰封，万里雪飘。<br/>' +
                       '望长城内外，惟余莽莽；大河上下，顿失滔滔。<br/>' +
                       '山舞银蛇，原驰蜡象，欲与天公试比高。<br/>' +
                       '须晴日，看红装素裹，分外妖娆。<br/>' +
                       '江山如此多娇，引无数英雄竞折腰。<br/>' +
                       '惜秦皇汉武，略输文采；唐宗宋祖，稍逊风骚。<br/>' +
                       '一代天骄，成吉思汗，只识弯弓射大雕。<br/>' +
                       '俱往矣，数风流人物，还看今朝。',
        poetryAnalysisList: [
            {
                moudleId: 'detail',
                moudleName: '注释',
                moudleContent: '北国：该词源于中国古代的分裂时期，如宋称辽、金为北国，东晋称十六国等为北国，南北朝时代南方的各朝代称在北方与之对抗的各朝代为北国等。毛泽东诗中的“北国”使人在不觉中产生出一种我国疆土广大的民族自豪感。<br/>' +
                               '雪：这首词作于红一方面军一九三六年二月由陕北准备东渡黄河进入山西省西部的时候。作者在一九四五年十月七日给柳亚子信中说，这首词作于“初到陕北看见大雪时”。<br/>' +
                               '惟：只。<br/>' +
                               '馀：剩下。此字一作“余”，但目前刊出的书法作品中写作“馀”，以此为准。<br/>' +
                               '莽莽：无边无际。<br/>' +
                               '大河上下：大河，指黄河。大河上下，犹言整条黄河。<br/>' +
                               '顿失滔滔：（黄河）立刻失去了波涛滚滚的气势。描写黄河水结冰的景象。<br/>' +
                               '山舞银蛇，原驰蜡象：群山好像（一条条）银蛇在舞动。高原（上的丘陵）好像（许多）白象在奔跑。“原”指高原，即秦晋高原。蜡象，白色的象。<br/>' +
                               '天公：指天，即命运。<br/>' +
                               '须：等到；需要。<br/>' +
                               '红装素裹：形容雪后天晴，红日和白雪交相辉映的壮丽景色。红装，原指妇女的艳装，这里指红日为大地披上了红装。素裹，原指妇女的淡装，这里指皑皑白雪覆盖着大地。<br/>' +
                               '分外妖娆：格外婀娜多姿。<br/>' +
                               '竞折腰：折腰，倾倒，躬着腰侍候。这里是说争着为江山奔走操劳。<br/>' +
                               '秦皇：秦始皇嬴政（前259~前210），秦朝的创业皇帝。<br/>' +
                               '汉武：汉武帝刘彻（前156~前87），汉朝功业最盛的皇帝。<br/>' +
                               '略输文采：文采本指辞藻、才华。“略输文采”，是说秦皇汉武，武功甚盛，对比之下，文治方面的成就略有逊色。<br/>' +
                               '唐宗：唐太宗李世民（599~649），唐朝的建立统一大业的皇帝。<br/>' +
                               '宋祖：宋太祖赵匡胤（927~976），宋朝的创业皇帝。<br/>' +
                               '稍逊风骚：意近“略输文采”。风骚，本指《诗经》里的《国风》和《楚辞》里的《离骚》，后来泛指文章辞藻。<br/>' +
                               '一代天骄：指可以称雄一世的英雄人物，泛指非常著名，有才能的人物。天骄，“天之骄子”的省略语。意思是上天所骄纵宠爱的人，成吉思汗即是。汉时匈奴自称。后来也泛称强盛的少数名族或其首领。<br/>' +
                               '成吉思汗（hán）：元太祖铁木真（1162~1227）在1206年统一蒙古后的尊称，意为“强者之汗”（汗是可汗的省称，即王）。后蒙古于1271年改国号为元，成吉思汗被尊为建立元朝的始祖。' +
                               '成吉思汗除占领中国黄河以北地区外，还曾向西远征，占领中亚和南俄，建立了庞大的蒙古帝国。<br/>' +
                               '只识弯弓射大雕：雕，一种属于鹰类的大型猛禽，善飞难射，古代因用“射雕手”比喻高强的射手。“只识弯弓射大雕”，是说只以武功见长。<br/>' +
                               '俱往矣：都已经过去了。 俱，都。<br/>' +
                               '数风流人物：称得上能建功立业的英雄人物。数，数得着、称得上的意思。',
            },
            {
                moudleId: 'translation',
                moudleName: '译文',
                moudleContent: '&ensp;&ensp;北方的风光，千万里冰封冻，千万里雪花飘。望长城内外，只剩下无边无际白茫茫一片；宽广的黄河上下，顿时失去了滔滔水势。' +
                               '山岭好像银白色的蟒蛇在飞舞，高原上的丘陵好像许多白象在奔跑，它们都想试一试与老天爷比比高。' +
                               '要等到晴天的时候，看红艳艳的阳光和白皑皑的冰雪交相辉映，分外美好。<br/><br/>' +
                               '&ensp;&ensp;江山如此媚娇，引得无数英雄竞相倾倒。只可惜秦始皇、汉武帝，略差文学才华；唐太宗、宋太祖，稍逊文治功劳。' +
                               '称雄一世的人物成吉思汗，只知道拉弓射大雕。这些人物全都过去了，数一数能建功立业的英雄人物，还要看今天的人们。',
            },
            {
                moudleId: 'appreciation',
                moudleName: '赏析',
                moudleContent: '&ensp;&ensp;毛泽东诗词是中国革命的史诗，是中华诗词海洋中的一朵奇葩。《沁园春·雪》更被南社盟主柳亚子盛赞为千古绝唱。' +
                               '这首词一直是众人的最爱，每次读来都仿佛又回到了那个战火纷飞的年代，又看到了那个指点江山的伟人，不由地沉醉于那种豪放的风格、磅礴的气势、深远的意境、广阔的胸怀。<br/><br/>' +
                               '&ensp;&ensp;然而，从发表之日起，这首词就遭到了诸多恶意的攻击，引发了旷日持久的争论。' +
                               '有人说它有帝王思想、君主气象；有人说它夸大自吹、离题万里；有人说它比喻不当、缺乏转折；有人说它词意稀疏、平淡无奇；甚至有人说它是模仿之作、旁人代笔……断章取义且流于表面，竟视金玉如砖石。<br/><br/>' +
                               '&ensp;&ensp;艺术追求含蕴，词中别有洞天。 这首词因雪而得、以雪冠名，却并非为雪所作，而是在借雪言志。' +
                               '它隐藏了太多的秘密，包纳着无尽的玄机。其中的每一句都意有所指，是诗人所思所想的真实流露，是诗人对许多重大问题给出的回答。其情感之真挚、寓意之深远、哲理之精辟，令人拍案叫绝。<br/><br/>' +
                               '&ensp;&ensp;<span class="black">认清局势</span><br/>' +
                               '&ensp;&ensp;“北国风光，千里冰封，万里雪飘，望长城内外，惟余莽莽，大河上下，顿失滔滔。”<br/>' +
                               '&ensp;&ensp;好一个周天寒彻，好一场漫天大雪，好一番人间苦难！天地间被风雪改变了容颜，只见长城内外苍茫一片，了无生机，连滔滔黄河也被雪冻冰封，不再奔流。' +
                               '神州的北国仿佛进入了一种死寂状态。让人联想起了柳宗元写雪的名句“千山鸟飞绝，万径人踪灭”。<br/>' +
                               '&ensp;&ensp;1936年2月，毛泽东率“中国人民红军抗日先锋军”渡过黄河，准备转往绥远对日作战。在陕西清涧县袁家沟筹划渡河时，突然飘起鹅毛大雪，他登高远望，面对苍茫大地，胸中豪情激荡，写下了这首词。' +
                               '其所在地，北距长城约150公里，东距黄河约25公里。可见，词中描写的不全是实景，而更多地是诗人脑海中的景象。<br/><br/>' +
                               '&ensp;&ensp;长城是中华民族的象征。它屹立在中华大地的辽阔北疆，它代表着中华儿女的顽强不屈，它作为中原的万里防线曾无数次阻挡了外族的入侵。在雄伟的长城内外，正是一片战火硝烟。' +
                               '日本人威胁华北，炮口直指平津要地；殷汝耕投敌卖国，组织“冀东自治政府”；蒋介石不顾大义，鼓吹攘外必先安内。<br/><br/>' +
                               '&ensp;&ensp;黄河是中华民族的母亲河。它奔腾咆哮着滚滚向前，它无私哺育着华夏文明，它与历史之河一同流淌见证着悠悠五千年荣辱兴衰。在浩荡的黄河之畔，又是一场生死搏杀。' +
                               '国民党集结了东北军、西北军、中央军，几十万军队围攻解放区。而中央红军刚刚到达陕北，人马只剩八千，立足未稳，粮弹奇缺。<br/><br/>' +
                               '&ensp;&ensp;站在群山之巅，顶着刺骨寒风，面对漫天飞雪，你会有怎样的心态呢？作为红军统帅，冒着内战炮火，迎对列强欺凌，你会做怎样的回答呢？' +
                               '广阔富饶的中华大地会冰封吗？浩瀚深长的中华历史之河会断流吗？从诗句中可以看到，毛泽东面临着怎样艰难的困局，拥有着怎样惊人的洞察，又进行着怎样深刻的思考！',

            },
            {
                moudleId: 'author',
                moudleName: '作者',
                moudleContent: '&ensp;&ensp;毛泽东，伟大的马克思主义者，无产阶级革命家、战略家和理论家，中国共产党、中国人民解放军和中华人民共和国的主要缔造者和领导人。' +
                               '湖南湘潭人。1893年12月26日生于一个农民家庭。辛亥革命爆发后在起义的新军中当了半年兵。1914～1918年，在湖南第一师范学校求学。毕业前夕和蔡和森等组织革命团体新民学会。五四运动前后接触和接受马克思主义，1920年，在湖南创建共产主义组织。' +
                               '&ensp;&ensp;1921年7月，出席中国共产党建党的第一次全国代表大会，后任中共湘区委员会书记，领导长沙、安源等地工人运动。1923年，出席中共第三次全国代表大会，被选为中央执行委员，参加中央领导工作。' +
                               '1924年国共合作后，在国民党第一、第二次全国代表大会上都当选为候补中央执行委员，曾在广州任国民党中央宣传部代理部长，主编《政治周报》，主办第六届农民运动讲习所。1926年11月，任中共中央农民运动委员会书记。<br/><br/>' +
                               '&ensp;&ensp;1925年冬至1927年春，先后发表《中国社会各阶级的分析》、《湖南农民运动考察报告》等著作，指出农民问题在中国革命中的重要地位和无产阶级领导农民斗争的极端重要性，批评了陈独秀的右倾思想。' +
                               '国共合作全面破裂后，在1927年8月中共中央紧急会议上，他提出“政权是由枪杆子中取得的”，即以革命武装夺取政权的思想，并被选为中央政治局候补委员。会后，到湖南、江西边界领导秋收起义。' +
                               '接着率起义部队上井冈山，发动土地革命，创立第一个农村革命根据地。1928年，同朱德领导的起义部队会师，成立工农革命军（不久改称红军）第四军，他任党代表、前敌委员会书记，朱德任军长。' +
                               '以他为主要代表的中国共产党人，从中国的实际出发，在国民党政权统治比较薄弱的农村发展武装斗争，开创了以农村包围城市、最后夺取城市和全国政权的道路。' +
                               '他在《中国的红色政权为什么能够存在？》、《星星之火，可以燎原》等著作中对这个问题从理论上作了阐述。<br/><br/>' +
                               '&ensp;&ensp;1930年5月，写《反对本本主义》，提出“没有调查，没有发言权”的著名论断。同年8月，红军第一方面军成立，任总政治委员。1931年，中华苏维埃共和国临时政府在江西瑞金成立，被选为主席。' +
                               '1933年，被补选为中共中央政治局委员。从1930年底起，同朱德领导红一方面军战胜了国民党军队的多次“围剿”。以王明为代表的“左”倾路线领导集团进入中央革命根据地以后，将毛泽东排斥于党和红军的领导之外，他们执行不同的战略和政策，导致第五次反“围剿”战争失败。' +
                               '1934年10月，参加红一方面军长征。长征途中，1935年1月中共中央政治局在贵州召开扩大会议（即遵义会议），确立了以毛泽东为代表的新的中央领导。10月，中共中央和红一方面军到达陕北，结束长征。' +
                               '12月，作《论反对日本帝国主义的策略》的报告，阐明了抗日民族统一战线政策。1936年10月，红四方面军和红二方面军经过长征到达甘肃境内，先后同红一方面军会师。' +
                               '同年12月，同周恩来等促使西安事变和平解决，这成为由内战到第二次国共合作、共同抗日的时局转换的枢纽。1936年12月，写《中国革命战争的战略问题》。1937年夏，写《实践论》和《矛盾论》。',

            }
        ],
        commentList: [
            {
                imgSrc: '../img/user_img1.jpeg',
                author: '不动声色',
                content: '当年毛主席正借此诗聊表壮志，他或许就已经意识到了，他已经站在了古往今来中国人的巅峰' + 
                         '可以以同等高度的视角来品评秦皇汉武唐宗宋祖，这是一种多么广阔和伟大的情怀',
                time: '2018-04-06 21:11',
                likeNum: 4,
                replyNum: 0,
            },
            {
                imgSrc: '../img/user_img2.jpg',
                author: '至三人禾',
                content: '祖国风光，宏伟壮丽，望山河大地，红旗飘摇，世界各国，各领风骚，' + 
                         '待几时，独占枝头，一比高低，祖国如此多娇',
                time: '2018-04-23 19:40',
                likeNum: 4,
                replyNum: 0,
            },
            {
                imgSrc: '../img/user_img3.jpg',
                author: '君卿',
                content: '气势磅礴，豪情万丈',
                time: '2018-04-17 10:37',
                likeNum: 4,
                replyNum: 0,
            },
            {
                imgSrc: '../img/user_img4.jpeg',
                author: '晓风残月',
                content: '寥寥几笔，描绘出看似普通却意义重大的雪景，完全表达了一种想统一全国的雄心壮志！',
                time: '2018-04-11 12:05',
                likeNum: 4,
                replyNum: 0,
            },
        ],
    }
})

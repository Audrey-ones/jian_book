app.controller('MessageController',function ($scope,$http,$rootScope) {
    /*alert($rootScope.user.user_id);*/
    $http({
        method:'GET',
        url:'http://localhost:8080/message/'+$rootScope.user.user_id
    }).success(function (data) {
        console.log(data);
        $scope.tab=data;
    })
   /* $scope.now=0;
    $scope.tabs=[
        {
            name:'评论',
            icon:'glyphicon glyphicon-comment',
            content:[
                {
                    'name':'藤沐',
                    'head':'user1.jpg',
                    'title':'随心而行',
                    'comment_time':new Date().toDateString(),
                    'content':'在这个春暖花开的时节，吾辈推荐几本自己喜欢的关于旅行主题的书与大家分享'
                }, {
                    'name':'小时光里的鱼',
                    'head':'user1.jpg',
                    'title':'随心而行',
                    'comment_time':new Date().toDateString(),
                    'content':'说不定在下一个路口，咱们就能一起带上这些书单与过去的自己告别，向未来，一个人私奔。———滕沐'
                }
            ]
        }, {
            name:'简信',
            icon:'glyphicon glyphicon-envelope',
            message:[
                {
                    'name':'简叔',
                    'head':'user1.jpg',
                    'comment_time':new Date().toDateString(),
                    'content':'Hello！ 我是简书CEO，大家都叫我简叔 :) 欢迎你的到来，成为万千简友中的一员。'
                }, {
                    'name':'简叔',
                    'head':'user1.jpg',
                    'comment_time':new Date().toDateString(),
                    'content':'这里是一个有故事有想法的社区，期待你的分享哦~ 有任何使用问题可以随时来找我，每条必回。'
                }
            ]
        }, {
            name:'关注',
            icon:'glyphicon glyphicon-export',
            attention:[
                {
                    'name':'简叔',
                    'head':'user1.jpg',
                },{
                    'name':'小时光里的鱼',
                    'head':'creatUser1.png',
                }
            ]
        }, {
            name:'喜欢',
            icon:'glyphicon glyphicon-heart-empty',
            like:[
                {
                    'name':'夏小月',
                    'head':'1.jpg',
                },{
                    'name':'静待花开的声音',
                    'head':'5.jpg',
                }
            ]
        }
    ];
    $scope.show=function(row){
        $scope.now=row;
    }*/
});
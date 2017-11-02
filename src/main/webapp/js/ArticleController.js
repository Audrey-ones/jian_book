app.controller('ArticleController',function ($scope,$routeParams,$http,$rootScope) {
    $scope.id = $routeParams.id;
    $http({
        method:'GET',
        url:'http://localhost:8080/articleDetails/'+$routeParams.id
    }).success(function (data) {
        console.log(data);
        $scope.article=data;
    })

    //喜欢文章
    $scope.likeArticle=function () {
        if (!$rootScope.token){
            swal({
                title:'请先登录',
                type:'error',
                timer:1000,
                showConfirmButton:false
            });
            window.setTimeout("location.href='http://localhost:8080/sign_in.html'",1100);
        }

        var user_id=$rootScope.user.user_id;
        var article_id=$routeParams.id;
        $http({
            url:'http://localhost:8080/likes',
            method:'POST',
            data:{
                'user_id':user_id,
                'article_id':article_id
            }

        }).success(function () {
            swal({
                title:'你已经喜欢了这篇文章',
                type:'success',
                timer:1000,
                showConfirmButton:false
            });
            setTimeout("window.location.reload()",1050);
        })
    }

    //发表评论
    $scope.insertComment=function (content) {
        console.log(content);
        if (!$rootScope.token){
            swal({
                title:'请先登录',
                type:'error',
                timer:1000,
                showConfirmButton:false
            });
            window.setTimeout("location.href='http://localhost:8080/sign_in.html'",1100);
        }

        var comment={
            'article_id':null,
            'user_id':null,
            'content':null,
            'comment_time':null
        }
        comment.article_id=$routeParams.id;
        comment.user_id=$rootScope.user.user_id;
        comment.content=content;
        comment.comment_time=new Date();
        $http({
            url:'http://localhost:8080/comment',
            method:'POST',
            data:{
                'article_id':comment.article_id,
                'user_id':comment.user_id,
                'content':comment.content,
                'comment_time':comment.comment_time
            }

        }).success(function () {
            swal({
                title:'发表成功',
                type:'success',
                timer:1000,
                showConfirmButton:false
            });
            setTimeout("window.location.reload()",1050);
        })
    }

    /*if ($routeParams.id == 1){
        var article={
            'id':'1',
            'author':'小时光里的鱼',
            'head':'author1.jpeg',
            'title':'做自由职业者是种怎样的体验？',
            'content':'在做这个决定之前，我完全不清楚未来的生活会怎样，也没做任何详细规划，但我有种预感，这可能是我做过的有史以来最正确的决定，我甚至愿意用我今后的几十年来为这个决定买单。至于我为什么离职，很简单，我十分不喜欢上班的那种朝九晚五的生活，一想到明天要上班打卡，甚至以后的几十年都是如此，我就头皮发麻，脑袋一空，就剩下一副混吃等死的躯壳了。',
            'img':'article_head1.jpeg',
            'write_time':new Date().toLocaleTimeString(),
            'words_count':'4544',
            'read_count':'34555',
            'comment_count':'123',
            'like_count':'12343',
            'comments':[
                {
                    'name':'藤沐',
                    'head':'user1.jpg',
                    'comment_time':new Date().toDateString(),
                    'content':'在这个春暖花开的时节，吾辈推荐几本自己喜欢的关于旅行主题的书与大家分享，说不定在下一个路口，咱们就能一起带上这些书单与过去的自己告别，向未来，一个人私奔。———滕沐',
                },
                {
                    'name':'藤沐',
                    'head':'user1.jpg',
                    'comment_time':new Date().toDateString(),
                    'content':'在这个春暖花开的时节，吾辈推荐几本自己喜欢的关于旅行主题的书与大家分享，说不定在下一个路口，咱们就能一起带上这些书单与过去的自己告别，向未来，一个人私奔。———滕沐',
                }, {
                    'name':'藤沐',
                    'head':'user1.jpg',
                    'comment_time':new Date().toDateString(),
                    'content':'在这个春暖花开的时节，吾辈推荐几本自己喜欢的关于旅行主题的书与大家分享，说不定在下一个路口，咱们就能一起带上这些书单与过去的自己告别，向未来，一个人私奔。———滕沐',
                }, {
                    'name':'藤沐',
                    'head':'user1.jpg',
                    'comment_time':new Date().toDateString(),
                    'content':'在这个春暖花开的时节，吾辈推荐几本自己喜欢的关于旅行主题的书与大家分享，说不定在下一个路口，咱们就能一起带上这些书单与过去的自己告别，向未来，一个人私奔。———滕沐',
                }, {
                    'name':'藤沐',
                    'head':'user1.jpg',
                    'comment_time':new Date().toDateString(),
                    'content':'在这个春暖花开的时节，吾辈推荐几本自己喜欢的关于旅行主题的书与大家分享，说不定在下一个路口，咱们就能一起带上这些书单与过去的自己告别，向未来，一个人私奔。———滕沐',
                }, {
                    'name':'藤沐',
                    'head':'user1.jpg',
                    'comment_time':new Date().toDateString(),
                    'content':'在这个春暖花开的时节，吾辈推荐几本自己喜欢的关于旅行主题的书与大家分享，说不定在下一个路口，咱们就能一起带上这些书单与过去的自己告别，向未来，一个人私奔。———滕沐',
                }
            ]
        }

        $scope.article=article;
    }*/
});
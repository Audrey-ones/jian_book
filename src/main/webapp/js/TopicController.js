app.controller('TopicController',function ($scope,$routeParams,$http,$rootScope) {
    $scope.id = $routeParams.id;
    $http({
        url:"http://localhost:8080/topicView/"+$routeParams.id,
        method:"GET"
    }).success(function (data) {
        console.log(data);
        $scope.topic=data;
    })

    //关注专题
    $scope.followTopic=function (topicFollow) {
        if (!$rootScope.token){
            swal({
                title:'请先登录',
                type:'error',
                timer:1000,
                showConfirmButton:false
            });
            window.setTimeout("location.href='http://localhost:8080/sign_in.html'",1100);
        }

        var topic_id=document.getElementById("topic_id").value;
        var user_id=document.getElementById("user_id").value;
        var topicFollow={
            "topic_id":null,
            "user_id":null
        };
        topicFollow.topic_id=topic_id;
        topicFollow.user_id=user_id;
        $http({
            url:'http://localhost:8080/topicFollow',
            method:'POST',
            data:{
                "topic_id":topicFollow.topic_id,
                "user_id":topicFollow.user_id
            }
        }).success(function () {
            swal({
                title:'关注成功',
                type:'success',
                timer:1000,
                showConfirmButton:false
            });
            setTimeout("window.location.reload()",1050);
        })
    }
});
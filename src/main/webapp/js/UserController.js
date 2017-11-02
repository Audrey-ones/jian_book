app.controller('UserController',function ($scope,$routeParams,$http,$rootScope) {
    $scope.id = $routeParams.id;
    $http({
        method:'GET',
        url:'http://localhost:8080/userDetails/'+$routeParams.id
    }).success(function (data) {
        console.log(data);
        $scope.user=data;
    })

    //关注作者
    $scope.followAuthor=function (authorFollow) {
        if (!$rootScope.token){
            swal({
                title:'请先登录',
                type:'error',
                timer:1000,
                showConfirmButton:false
            });
            window.setTimeout("location.href='http://localhost:8080/sign_in.html'",1100);
        }

        var author_id=document.getElementById("user_id").value;
        var my_id=$rootScope.user.user_id;
        authorFollow={
            "author_id":null,
            "my_id":null
        };
        authorFollow.author_id=author_id;
        authorFollow.my_id=my_id;
        $http({
            url:'http://localhost:8080/followAuthor',
            method:'POST',
            data:{
                "id_from":authorFollow.my_id,
                "id_to":authorFollow.author_id
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
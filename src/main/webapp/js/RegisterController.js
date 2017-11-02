/**
 * Created by ASUS on 2017/5/9.
 */
app.controller('RegisterController',function ($scope,$rootScope,$http) {
    $scope.signUp=function (nickname,account,password) {
        console.log(nickname,account,password);
        $http({
            url:'http://localhost:8080/users',
            method:'POST',
            data:{
                "nickname":nickname,
                "account":account,
                "password":password,
                "head":"img/user/user.jpg",
                "description":"你还没有写简介，快来留下点痕迹吧...",
                "write_count":0,
                "fans_count":0
            }
        }).success(function () {
            swal({
                title:"注册成功",
                type:"success",
                showConfirmButton:false
            });
            setTimeout("location.href='http://localhost:8080/sign_in.html'",1020);
        });

    }
})

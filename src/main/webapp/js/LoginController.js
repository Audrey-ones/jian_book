/**
 * Created by ASUS on 2017/5/8.
 */
app.controller('LoginController',function ($rootScope,$scope,$http) {
    $rootScope.signIn=function (user) {
        $http({
            url:'http://localhost:8080/signIn',
            method:'POST',
            data:{
                "account":user.account,
                "password":user.password
            }
        }).success(function (data) {

            if(angular.isObject(data)){
                swal({
                    title:"登录成功",
                    type:"success",
                    timer:1000,
                    showConfirmButton:false
                });
                setCookie("user",data.user);//用户基本信息计入cookie
                setCookie("token",data.token);//令牌token计入cookie
                /*setCookie("myFollows",data.myFollows);*/
                window.setTimeout("location.href='http://localhost:8080'",1200);
                console.log(token)
            }else{
                swal("我的天呐！","账号密码错误！","error");
                /*swal({
                    title:"登录失败",
                    type:"error",
                    showConfirmButton:true
                });*/
            }
        })


    }
    /*$scope.signIn=function () {
        console.log(1234);
        swal({
            title:"登录成功",
            type:"success",
            showConfirmButton:false
        });
    }*/
});

//写Cookie
function setCookie(name,value) {
    var exp=new Date();
    exp.setTime(exp.getTime()+2*24*60*60*1000);//有效时间
    document.cookie=name+"="+JSON.stringify(value);
}

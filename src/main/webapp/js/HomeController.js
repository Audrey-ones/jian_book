app.controller('HomeController',function ($scope,$http,$rootScope) {
    if (getCookie('user')){
        $rootScope.user=JSON.parse(getCookie('user'));
    }
    if (getCookie('token')){
        $rootScope.token=JSON.parse(getCookie('token'));
    }

    $http({
        method:'GET',
        url:'http://localhost:8080/hotArticles'
    }).success(function (data) {
        $scope.articles=data;
    });

    $http({
        method:'GET',
        url:'http://localhost:8080/hotAuthors'
    }).success(function (data) {
        $scope.users=data;
    });

    $http({
        method:'GET',
        url:'http://localhost:8080/hotTopics'
    }).success(function (data) {
        $scope.topics=data;
    });

});

//读取cookies
function getCookie(name) {
   /* var arr,reg=new RegExp("(^| )" + name + "=([^;]*)(;|$)");*/
    var arr,reg=new RegExp("(^| )" + name + "=([^;]*)(;|$)");
    if (arr=document.cookie.match(reg)){
        return arr[2];
    }else {
        return null;
    }
}

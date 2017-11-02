var app = angular.module('MyApp', ['ngRoute'])
app.run(function ($rootScope) {
    //  $rootScope是全局作用域
    $rootScope.numLimit=105;
});
app.config(['$routeProvider', function ($routeProvider) {
    $routeProvider
        .when('/home', {
            templateUrl: 'home.html',
            controller: 'HomeController'
        })
        .when('/message', {
            templateUrl: 'message.html',
            controller: 'MessageController'
        })
        .when('/personal', {
            templateUrl: 'personal.html',
            controller: 'personalController'
        })
        .when('/allTopic', {
            templateUrl: 'allTopic.html',
            controller: 'allTopicController'
        })
        .when('/allUser', {
            templateUrl: 'allUser.html',
            controller: 'allUserController'
        })
        .when('/topic/:id', {
            templateUrl: 'topic.html',
            controller: 'TopicController'
        })
        .when('/article/:id', {
            templateUrl: 'article.html',
            controller: 'ArticleController'
        })
        .when('/write', {
            templateUrl: 'write.html',
            controller: ''
        })
        .when('/user/:id', {
            templateUrl: 'user.html',
            controller: 'UserController'
        })
        .otherwise({
            redirectTo: '/home',
            controller: 'homeController'
        });
}]);






app.controller('allTopicController',function ($scope,$http) {
    $http({
        method:'GET',
        url:'http://localhost:8080/allTopics'
    }).success(function (data) {
        $scope.allTopics=data;
    });

   /* var allTopics=[
        {
            'id':'1',
            'head':'1.jpeg',
            'classify':'上班这点事儿',
            'introduce':'本专题仅收录求职、简历、换工作、职业规划、招聘、职场干货、上班感悟、管...',
            'articleCount':21965,
            'people':'404.4K'
        },
        {
            'id':'2',
            'head':'2.jpg',
            'classify':'程序员',
            'introduce':'如果你是程序员，或者有一颗喜欢写程序的心，喜欢分享技术干货、项目经验、...',
            'articleCount':21965,
            'people':'404.4K'
        },
        {
            'id':'3',
            'head':'3.jpg',
            'classify':'@产品',
            'introduce':'产品爱好者聚集地 这里有一群梦想改变世界的疯子 收录产品、运营...',
            'articleCount':21965,
            'people':'404.4K'
        },
        {
            'id':'4',
            'head':'4.jpg',
            'classify':'生活家',
            'introduce':'每一个细节的改变，都有可能是梦与爱的开始。 本文仅收录生活时尚类...',
            'articleCount':21965,
            'people':'404.4K'
        },
        {
            'id':'5',
            'head':'5.jpg',
            'classify':'万物生灵',
            'introduce':'原专题：“动物之灵”，全新改版升级 收录有关动物、植物的故事，感...',
            'articleCount':21965,
            'people':'404.4K'
        },
        {
            'id':'6',
            'head':'6.jpg',
            'classify':'教育',
            'introduce':'教育是启蒙，教育即生活，教育为未来生活之准备。 专题有3大版块：...',
            'articleCount':21965,
            'people':'404.4K'
        },
        {
            'id':'7',
            'head':'7.jpg',
            'classify':'设计',
            'introduce':'把创意变为现实 设计专题投稿须知： 1.与设计相关的文章（包括...',
            'articleCount':21965,
            'people':'404.4K'
        },
        {
            'id':'8',
            'head':'8.jpg',
            'classify':'短篇小说',
            'introduce':'借一斑略知全豹 ，以一目尽传精神。 投稿须知： 1.本专题收录...',
            'articleCount':21965,
            'people':'404.4K'
        },
        {
            'id':'9',
            'head':'9.jpg',
            'classify':'漫画·手绘',
            'introduce':'手绘、漫画爱好者分享交流学习的地方 (≧∇≦)ﾉ ，无论高手还是菜鸟都...',
            'articleCount':21965,
            'people':'404.4K'
        },
        {
            'id':'10',
            'head':'10.jpg',
            'classify':'旅行·在路上',
            'introduce':'借一双眼睛看世界，分享你的旅程。 投稿须知： 1.本专题仅收录...',
            'articleCount':21965,
            'people':'404.4K'
        }
    ];

    $scope.allTopics=allTopics;*/
});
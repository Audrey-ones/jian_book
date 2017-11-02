package cn.ludan.jianshu.web;

import cn.ludan.jianshu.model.ArticleView;
import cn.ludan.jianshu.model.Topic;
import cn.ludan.jianshu.model.User;
import cn.ludan.jianshu.service.ArticleService;
import cn.ludan.jianshu.service.TopicService;
import cn.ludan.jianshu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by ASUS on 2017/4/27.
 */
@RestController
public class HomeController {
    @Autowired
    private UserService userService;
    @Autowired
    private TopicService topicService;
    @Autowired
    private ArticleService articleService;

    /**
     * 获取热门专题信息
     * @return
     */
    @RequestMapping(value = "hotTopics",method = RequestMethod.GET)
    public @ResponseBody List<Topic> getHotTopics(){
        List<Topic> hotTopics=topicService.getHotTopics();
        return hotTopics;
    }

    /**
     * 获取热门作者信息
     * @return
     */
    @RequestMapping(value = "hotAuthors",method = RequestMethod.GET)
    public @ResponseBody List<User> getHotUsers(){
        List<User> hotAuthors=userService.getHotUsers();
        return hotAuthors;
    }

    /**
     * 获取热门文章信息
     * @return
     */
    @RequestMapping(value = "hotArticles",method = RequestMethod.GET)
    public @ResponseBody List<ArticleView> getHotArticles(){
        List<ArticleView> hotArticles=articleService.getHotArticles();
        return hotArticles;
    }

}

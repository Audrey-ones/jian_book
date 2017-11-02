package cn.ludan.jianshu.web;

import cn.ludan.jianshu.model.ArticleDetails;
import cn.ludan.jianshu.model.Comment;
import cn.ludan.jianshu.model.Like;
import cn.ludan.jianshu.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by ASUS on 2017/4/29.
 */
@RestController
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = "articleDetails/{article_id}",method = RequestMethod.GET)
    public @ResponseBody
    ArticleDetails getArticleDetais(@PathVariable("article_id")
                                            int article_id){
        ArticleDetails articleDetails=articleService.getArticleDetails(article_id);
        return articleDetails;
    }

    @RequestMapping(value = "comment",method = RequestMethod.POST)
    public void insertComment(@RequestBody Comment comment){
        articleService.insertComment(comment);
    }

    @RequestMapping(value = "likes",method = RequestMethod.POST)
    public void likeArticle(@RequestBody Like like){
        articleService.likeArticle(like);
    }
}

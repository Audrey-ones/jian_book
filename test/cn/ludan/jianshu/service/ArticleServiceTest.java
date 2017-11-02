package cn.ludan.jianshu.service;

import cn.ludan.jianshu.model.ArticleDetails;
import cn.ludan.jianshu.model.ArticleView;
import cn.ludan.jianshu.model.Comment;
import cn.ludan.jianshu.model.Like;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by ASUS on 2017/4/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class ArticleServiceTest {

    @Autowired
    private ArticleService articleService;
    @Test
    public void getHotArticles() throws Exception {
        List<ArticleView> articleViews=articleService.getHotArticles();
        for (ArticleView a:articleViews
             ) {
            System.out.println(a);
        }
    }

    @Test
    public void getArticleDetails() throws Exception {
        ArticleDetails articleDetails=articleService.getArticleDetails(1);
        System.out.println(articleDetails);
    }

    @Test
    public void insertComment() throws Exception {
        Comment comment=new Comment(1,5,"哈哈哈，不错嘛",new Date());
        articleService.insertComment(comment);
    }

    @Test
    public void likeArticle() throws Exception {
        Like like=new Like(8,2);
        articleService.likeArticle(like);
    }

}
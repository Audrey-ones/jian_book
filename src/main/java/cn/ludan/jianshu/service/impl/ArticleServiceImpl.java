package cn.ludan.jianshu.service.impl;

import cn.ludan.jianshu.dao.ArticleDAO;
import cn.ludan.jianshu.dao.CommentDAO;
import cn.ludan.jianshu.dao.LikeDAO;
import cn.ludan.jianshu.model.*;
import cn.ludan.jianshu.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by ASUS on 2017/4/27.
 */
@Service
@Transactional
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleDAO articleDAO;
    @Autowired
    private CommentDAO commentDAO;
    @Autowired
    private LikeDAO likeDAO;

    @Override
    public List<ArticleView> getHotArticles() {
        List<ArticleView> articleViews=articleDAO.getHotArticles();
        return articleViews;
    }

    @Override
    public ArticleDetails getArticleDetails(int article_id) {
        ArticleDetails articleDetails=articleDAO.getArticleDetails(article_id);
        return articleDetails;
    }

    @Override
    public void insertComment(Comment comment) {
        commentDAO.insert(comment);
        //更新文章的评论数
        Example example=new Example(Article.class);
        example.createCriteria()
                .andEqualTo("article_id",comment.getArticle_id());
        Article article=articleDAO.selectByExample(example).get(0);
        article.setComment_count(article.getComment_count()+1);
        articleDAO.updateByExample(article,example);
    }

    @Override
    public void likeArticle(Like like) {
        likeDAO.insert(like);
        /*更新喜欢数*/
        Example example=new Example(Article.class);
        example.createCriteria()
                .andEqualTo("article_id",like.getArticle_id());
        Article article=articleDAO.selectByExample(example).get(0);
        article.setLike_count(article.getLike_count()+1);
        articleDAO.updateByExample(article,example);
    }
}

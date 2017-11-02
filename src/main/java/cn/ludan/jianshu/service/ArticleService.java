package cn.ludan.jianshu.service;

import cn.ludan.jianshu.model.ArticleDetails;
import cn.ludan.jianshu.model.ArticleView;
import cn.ludan.jianshu.model.Comment;
import cn.ludan.jianshu.model.Like;

import java.util.List;

/**
 * Created by ASUS on 2017/4/27.
 */
public interface ArticleService {
    List<ArticleView> getHotArticles();

    //查询文章详情
    ArticleDetails getArticleDetails(int article_id);

    //发表评论
    void insertComment(Comment comment);

    //喜欢文章
    void likeArticle(Like like);
}

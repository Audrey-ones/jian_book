package cn.ludan.jianshu.dao;

import cn.ludan.jianshu.model.Article;
import cn.ludan.jianshu.model.ArticleDetails;
import cn.ludan.jianshu.model.ArticleView;

import java.util.List;

/**
 * Created by ASUS on 2017/4/26.
 */
public interface ArticleDAO extends BaseDAO<Article> {
    /**
     * 获取热门文章
     * @return
     */
    List<ArticleView> getHotArticles();

    /**
     * 获取文章详情
     * @return
     */
    ArticleDetails getArticleDetails(int article_id);
}


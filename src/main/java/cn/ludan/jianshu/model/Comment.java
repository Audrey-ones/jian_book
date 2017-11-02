package cn.ludan.jianshu.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by ASUS on 2017/4/25.
 */
@Table(name = "t_comment")
public class Comment {
    private Integer comment_id;
    private Integer article_id;
    private Integer user_id;
    private String content;
    private Date comment_time;

    public Comment(Integer comment_id, Integer article_id,
                   Integer user_id, String content, Date comment_time) {
        this.comment_id = comment_id;
        this.article_id = article_id;
        this.user_id = user_id;
        this.content = content;
        this.comment_time = comment_time;
    }

    public Comment(Integer article_id, Integer user_id, String content, Date comment_time) {
        this.article_id = article_id;
        this.user_id = user_id;
        this.content = content;
        this.comment_time = comment_time;
    }


    public Comment() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getComment_id() {
        return comment_id;
    }

    public void setComment_id(Integer comment_id) {
        this.comment_id = comment_id;
    }

    @Column(name = "article_id")
    public Integer getArticle_id() {
        return article_id;
    }

    public void setArticle_id(Integer article_id) {
        this.article_id = article_id;
    }

    @Column(name = "user_id")
    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Column(name = "comment_time")
    public Date getComment_time() {
        return comment_time;
    }

    public void setComment_time(Date comment_time) {
        this.comment_time = comment_time;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "comment_id=" + comment_id +
                ", article_id=" + article_id +
                ", user_id=" + user_id +
                ", content='" + content + '\'' +
                ", comment_time=" + comment_time +
                '}';
    }
}

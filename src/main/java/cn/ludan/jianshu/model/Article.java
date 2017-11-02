package cn.ludan.jianshu.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by ASUS on 2017/4/25.
 */
@Table(name = "t_article")
public class Article {
    private Integer article_id;
    private Integer topic_id;
    private Integer user_id;
    private String title;
    private String content;
    private String thumbnail;
    private Integer word_count;
    private Integer read_count;
    private Integer comment_count;
    private Integer like_count;
    private Date write_time;

    public Article(Integer article_id, Integer topic_id, Integer user_id,
                   String title, String content, String thumbnail,
                   Integer word_count, Integer read_count,
                   Integer comment_count, Integer like_count, Date write_time) {
        this.article_id = article_id;
        this.topic_id = topic_id;
        this.user_id = user_id;
        this.title = title;
        this.content = content;
        this.thumbnail = thumbnail;
        this.word_count = word_count;
        this.read_count = read_count;
        this.comment_count = comment_count;
        this.like_count = like_count;
        this.write_time = write_time;
    }

    public Article() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getArticle_id() {
        return article_id;
    }

    public void setArticle_id(Integer article_id) {
        this.article_id = article_id;
    }

    @Column(name = "topic_id")
    public Integer getTopic_id() {
        return topic_id;
    }

    public void setTopic_id(Integer topic_id) {
        this.topic_id = topic_id;
    }

    @Column(name = "user_id")
    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Column(name = "thumbnail")
    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    @Column(name = "word_count")
    public Integer getWord_count() {
        return word_count;
    }

    public void setWord_count(Integer word_count) {
        this.word_count = word_count;
    }

    @Column(name = "read_count")
    public Integer getRead_count() {
        return read_count;
    }

    public void setRead_count(Integer read_count) {
        this.read_count = read_count;
    }

    @Column(name = "comment_count")
    public Integer getComment_count() {
        return comment_count;
    }

    public void setComment_count(Integer comment_count) {
        this.comment_count = comment_count;
    }

    @Column(name = "like_count")
    public Integer getLike_count() {
        return like_count;
    }

    public void setLike_count(Integer like_count) {
        this.like_count = like_count;
    }

    @Column(name = "write_time")
    public Date getWrite_time() {
        return write_time;
    }

    public void setWrite_time(Date write_time) {
        this.write_time = write_time;
    }

    @Override
    public String toString() {
        return "Article{" +
                "article_id=" + article_id +
                ", topic_id=" + topic_id +
                ", user_id=" + user_id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", word_count=" + word_count +
                ", read_count=" + read_count +
                ", comment_count=" + comment_count +
                ", like_count=" + like_count +
                ", write_time=" + write_time +
                '}';
    }
}

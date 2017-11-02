package cn.ludan.jianshu.model;

import java.util.Date;

/**
 * Created by ASUS on 2017/4/26.
 */
public class ArticleView {
    private Integer article_id;
    private String title;
    private String content;
    private String thumbnail;
    private Integer read_count;
    private Integer comment_count;
    private Integer like_count;
    private Date write_time;
    private Integer user_id;
    private String head;
    private String nickname;
    private Integer topic_id;
    private String topic_name;

    public Integer getArticle_id() {
        return article_id;
    }

    public void setArticle_id(Integer article_id) {
        this.article_id = article_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Integer getRead_count() {
        return read_count;
    }

    public void setRead_count(Integer read_count) {
        this.read_count = read_count;
    }

    public Integer getComment_count() {
        return comment_count;
    }

    public void setComment_count(Integer comment_count) {
        this.comment_count = comment_count;
    }

    public Integer getLike_count() {
        return like_count;
    }

    public void setLike_count(Integer like_count) {
        this.like_count = like_count;
    }

    public Date getWrite_time() {
        return write_time;
    }

    public void setWrite_time(Date write_time) {
        this.write_time = write_time;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nikename) {
        this.nickname = nikename;
    }

    public Integer getTopic_id() {
        return topic_id;
    }

    public void setTopic_id(Integer topic_id) {
        this.topic_id = topic_id;
    }

    public String getTopic_name() {
        return topic_name;
    }

    public void setTopic_name(String topic_name) {
        this.topic_name = topic_name;
    }

    @Override
    public String toString() {
        return "ArticleView{" +
                "article_id=" + article_id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", read_count=" + read_count +
                ", comment_count=" + comment_count +
                ", like_count=" + like_count +
                ", write_time=" + write_time +
                ", user_id=" + user_id +
                ", head='" + head + '\'' +
                ", nickname='" + nickname + '\'' +
                ", topic_id=" + topic_id +
                ", topic_name='" + topic_name + '\'' +
                '}';
    }
}

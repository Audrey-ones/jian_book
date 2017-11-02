package cn.ludan.jianshu.model;

import java.util.Date;
import java.util.List;

/**
 * Created by ASUS on 2017/4/29.
 */
public class ArticleDetails {
    /*文章详情*/
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
    /*作者详情*/
    private String nickname;
    private String head;
    private String description;
    private Integer write_count;
    private Integer fans_count;

    private List<CommentView> comments;

    public List<CommentView> getComments() {
        return comments;
    }

    public void setComments(List<CommentView> comments) {
        this.comments = comments;
    }

    public Integer getArticle_id() {
        return article_id;
    }

    public void setArticle_id(Integer article_id) {
        this.article_id = article_id;
    }

    public Integer getTopic_id() {
        return topic_id;
    }

    public void setTopic_id(Integer topic_id) {
        this.topic_id = topic_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
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

    public Integer getWord_count() {
        return word_count;
    }

    public void setWord_count(Integer word_count) {
        this.word_count = word_count;
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

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getWrite_count() {
        return write_count;
    }

    public void setWrite_count(Integer write_count) {
        this.write_count = write_count;
    }

    public Integer getFans_count() {
        return fans_count;
    }

    public void setFans_count(Integer fans_count) {
        this.fans_count = fans_count;
    }

    @Override
    public String toString() {
        return "ArticleDetails{" +
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
                ", nickname='" + nickname + '\'' +
                ", head='" + head + '\'' +
                ", description='" + description + '\'' +
                ", write_count=" + write_count +
                ", fans_count=" + fans_count +
                ", comments=" + comments +
                '}';
    }
}

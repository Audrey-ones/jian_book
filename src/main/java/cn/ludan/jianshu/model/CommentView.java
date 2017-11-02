package cn.ludan.jianshu.model;

import java.util.Date;

/**
 * Created by ASUS on 2017/4/29.
 */
public class CommentView {
    private Integer comment_id;
    private String content;
    private Date comment_time;
    private String user_id;
    private String nickname;
    private String head;
    private Integer article_id;
    private String title;

    public Integer getComment_id() {
        return comment_id;
    }

    public void setComment_id(Integer comment_id) {
        this.comment_id = comment_id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getComment_time() {
        return comment_time;
    }

    public void setComment_time(Date comment_time) {
        this.comment_time = comment_time;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
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

    @Override
    public String toString() {
        return "CommentView{" +
                "comment_id=" + comment_id +
                ", content='" + content + '\'' +
                ", comment_time=" + comment_time +
                ", user_id='" + user_id + '\'' +
                ", nickname='" + nickname + '\'' +
                ", head='" + head + '\'' +
                ", article_id=" + article_id +
                ", title='" + title + '\'' +
                '}';
    }
}

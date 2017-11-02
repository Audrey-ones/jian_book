package cn.ludan.jianshu.model;

import javax.persistence.*;

/**
 * Created by ASUS on 2017/4/25.
 * 专题的持久化类
 */

@Table(name = "t_topic")
public class Topic {
    private Integer topic_id;
    private Integer user_id;
    private String topic_name;
    private String logo;
    private String notice;
    private Integer article_count;
    private Integer follow_count;

    public Topic(Integer topic_id, Integer user_id, String topic_name,
                 String logo, String notice, Integer article_count,
                 Integer follow_count) {
        this.topic_id = topic_id;
        this.user_id = user_id;
        this.topic_name = topic_name;
        this.logo = logo;
        this.notice = notice;
        this.article_count = article_count;
        this.follow_count = follow_count;
    }

    public Topic() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    @Column(name = "topic_name")
    public String getTopic_name() {
        return topic_name;
    }

    public void setTopic_name(String topic_name) {
        this.topic_name = topic_name;
    }

    @Column(name = "logo")
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    @Column(name = "notice")
    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    @Column(name = "article_count")
    public Integer getArticle_count() {
        return article_count;
    }

    public void setArticle_count(Integer article_count) {
        this.article_count = article_count;
    }

    @Column(name = "follow_count")
    public Integer getFollow_count() {
        return follow_count;
    }

    public void setFollow_count(Integer follow_count) {
        this.follow_count = follow_count;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "topic_id=" + topic_id +
                ", user_id=" + user_id +
                ", topic_name='" + topic_name + '\'' +
                ", logo='" + logo + '\'' +
                ", notice='" + notice + '\'' +
                ", article_count=" + article_count +
                ", follow_count=" + follow_count +
                '}';
    }
}

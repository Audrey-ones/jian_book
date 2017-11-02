package cn.ludan.jianshu.model;

import javax.persistence.*;

/**
 * Created by ASUS on 2017/4/25.
 */

@Table(name = "t_topic_follow")
public class Topic_follow {
    private Integer follow_id;
    private Integer user_id;
    private Integer topic_id;

    public Topic_follow(Integer follow_id, Integer user_id, Integer topic_id) {
        this.follow_id = follow_id;
        this.user_id = user_id;
        this.topic_id = topic_id;
    }

    public Topic_follow(Integer user_id, Integer topic_id) {
        this.user_id = user_id;
        this.topic_id = topic_id;
    }

    public Topic_follow() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getFollow_id() {
        return follow_id;
    }

    public void setFollow_id(Integer follow_id) {
        this.follow_id = follow_id;
    }

    @Column(name = "user_id")
    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    @Column(name = "topic_id")
    public Integer getTopic_id() {
        return topic_id;
    }

    public void setTopic_id(Integer topic_id) {
        this.topic_id = topic_id;
    }

    @Override
    public String toString() {
        return "Topic_follow{" +
                "follow_id=" + follow_id +
                ", user_id=" + user_id +
                ", topic_id=" + topic_id +
                '}';
    }
}

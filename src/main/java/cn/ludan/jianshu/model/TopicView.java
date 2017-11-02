package cn.ludan.jianshu.model;

import java.util.List;

/**
 * Created by ASUS on 2017/4/26.
 */
public class TopicView {
    //专题基本信息
    private Integer topic_id;
    private String topic_name;
    private String logo;
    private String notice;
    private Integer article_count;
    private Integer follow_count;
    //专题创建者信息
    private String nickname;
    private String head;
    //专题关注人列表
    private List<User> followUsers;
    //专题文章信息
    private List<ArticleView> articles;

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

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public Integer getArticle_count() {
        return article_count;
    }

    public void setArticle_count(Integer article_count) {
        this.article_count = article_count;
    }

    public Integer getFollow_count() {
        return follow_count;
    }

    public void setFollow_count(Integer follow_count) {
        this.follow_count = follow_count;
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

    public List<User> getFollowUsers() {
        return followUsers;
    }

    public void setFollowUsers(List<User> followUsers) {
        this.followUsers = followUsers;
    }

    public List<ArticleView> getArticles() {
        return articles;
    }

    public void setArticles(List<ArticleView> articles) {
        this.articles = articles;
    }

    @Override
    public String toString() {
        return "TopicView{" +
                "topic_id=" + topic_id +
                ", topic_name='" + topic_name + '\'' +
                ", logo='" + logo + '\'' +
                ", notice='" + notice + '\'' +
                ", article_count=" + article_count +
                ", follow_count=" + follow_count +
                ", nickname='" + nickname + '\'' +
                ", head='" + head + '\'' +
                ", followUsers=" + followUsers +
                ", articles=" + articles +
                '}';
    }
}

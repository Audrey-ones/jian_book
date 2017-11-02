package cn.ludan.jianshu.model;

import java.util.List;

/**
 * Created by ASUS on 2017/4/29.
 */
public class UserView {
    private Integer user_id;
    private String nickname;
    private String head;
    private String description;
    private Integer write_count;
    private Integer fans_count;
    private List<Topic> createTopic;
    private List<Topic> followTopics;
    private List<User> followAuthors;
    private List<User> authorsFans;
    private List<ArticleView> articleViews;
    private List<User> articleLike;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
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

    public List<Topic> getCreateTopic() {
        return createTopic;
    }

    public void setCreateTopic(List<Topic> createTopic) {
        this.createTopic = createTopic;
    }

    public List<Topic> getFollowTopics() {
        return followTopics;
    }

    public void setFollowTopics(List<Topic> followTopics) {
        this.followTopics = followTopics;
    }

    public List<User> getFollowAuthors() {
        return followAuthors;
    }

    public void setFollowAuthors(List<User> followAuthors) {
        this.followAuthors = followAuthors;
    }

    public List<User> getAuthorsFans() {
        return authorsFans;
    }

    public void setAuthorsFans(List<User> authorsFans) {
        this.authorsFans = authorsFans;
    }

    public List<ArticleView> getArticleViews() {
        return articleViews;
    }

    public void setArticleViews(List<ArticleView> articleViews) {
        this.articleViews = articleViews;
    }

    public List<User> getArticleLike() {
        return articleLike;
    }

    public void setArticleLike(List<User> articleLike) {
        this.articleLike = articleLike;
    }

    @Override
    public String toString() {
        return "UserView{" +
                "user_id=" + user_id +
                ", nickname='" + nickname + '\'' +
                ", head='" + head + '\'' +
                ", description='" + description + '\'' +
                ", write_count=" + write_count +
                ", fans_count=" + fans_count +
                ", createTopic=" + createTopic +
                ", followTopics=" + followTopics +
                ", followAuthors=" + followAuthors +
                ", authorsFans=" + authorsFans +
                ", articleViews=" + articleViews +
                ", articleLike=" + articleLike +
                '}';
    }
}

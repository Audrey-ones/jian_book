package cn.ludan.jianshu.model;

import javax.persistence.*;

/**
 * Created by ASUS on 2017/4/9.
 */
@Table(name = "t_user")
public class User {
    private Integer user_id;
    private String account;
    private String password;
    private String nickname;
    private String head;
    private String description;
    private Integer write_count;
    private Integer fans_count;

    public User(String account, String password) {
        this.account = account;
        this.password = password;
    }

    public User(String account, String password, String nickname,
                String head, String description, Integer write_count,
                Integer fans_count) {
        this.account = account;
        this.password = password;
        this.nickname = nickname;
        this.head = head;
        this.description = description;
        this.write_count = write_count;
        this.fans_count = fans_count;
    }

    public User(Integer user_id, String account, String password,
                String nickname, String head, String description,
                Integer write_count, Integer fans_count) {
        this.user_id = user_id;
        this.account = account;
        this.password = password;
        this.nickname = nickname;
        this.head = head;
        this.description = description;
        this.write_count = write_count;
        this.fans_count = fans_count;
    }

    public User(Integer user_id, String nickname, String head, String description) {
        this.user_id = user_id;
        this.nickname = nickname;
        this.head = head;
        this.description = description;
    }

    public User() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    @Column(name = "account")
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "nickname")
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Column(name = "head")
    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Column(name = "write_count")
    public Integer getWrite_count() {
        return write_count;
    }

    public void setWrite_count(Integer write_count) {
        this.write_count = write_count;
    }

    @Column(name = "fans_count")
    public Integer getFans_count() {
        return fans_count;
    }

    public void setFans_count(Integer fans_count) {
        this.fans_count = fans_count;
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", nickname='" + nickname + '\'' +
                ", head='" + head + '\'' +
                ", description='" + description + '\'' +
                ", write_count=" + write_count +
                ", fans_count=" + fans_count +
                '}';
    }
}

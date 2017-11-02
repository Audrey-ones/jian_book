package cn.ludan.jianshu.model;

import javax.persistence.*;

/**
 * Created by ASUS on 2017/4/25.
 */
@Table(name = "t_token")
public class Token {
    private Integer id;
    private Integer user_id;
    private String token;

    public Token(Integer id, Integer user_id, String token) {
        this.id = id;
        this.user_id = user_id;
        this.token = token;
    }

    public Token() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "user_id")
    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    @Column(name = "token")
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "Token{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", token=" + token +
                '}';
    }
}

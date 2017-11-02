package cn.ludan.jianshu.model;

import java.util.Date;

/**
 * Created by ASUS on 2017/5/3.
 */
public class LetterView {
    private Integer letter_id;
    private Integer from_id;
    private String head;
    private String nickname;
    private String content;
    private Date letter_time;

    public Integer getLetter_id() {
        return letter_id;
    }

    public void setLetter_id(Integer letter_id) {
        this.letter_id = letter_id;
    }

    public Integer getFrom_id() {
        return from_id;
    }

    public void setFrom_id(Integer from_id) {
        this.from_id = from_id;
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

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getLetter_time() {
        return letter_time;
    }

    public void setLetter_time(Date letter_time) {
        this.letter_time = letter_time;
    }

    @Override
    public String toString() {
        return "LetterView{" +
                "letter_id=" + letter_id +
                ", from_id=" + from_id +
                ", head='" + head + '\'' +
                ", nickname='" + nickname + '\'' +
                ", content='" + content + '\'' +
                ", letter_time=" + letter_time +
                '}';
    }
}

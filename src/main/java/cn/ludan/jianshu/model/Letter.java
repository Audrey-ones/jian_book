package cn.ludan.jianshu.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by ASUS on 2017/4/25.
 */
@Table(name = "t_letter")
public class Letter {
    private Integer letter_id;
    private Integer from_id;
    private Integer to_id;
    private String content;
    private Date letter_time;

    public Letter(Integer letter_id, Integer from_id, Integer to_id,
                  String content, Date letter_time) {
        this.letter_id = letter_id;
        this.from_id = from_id;
        this.to_id = to_id;
        this.content = content;
        this.letter_time = letter_time;
    }

    public Letter() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getLetter_id() {
        return letter_id;
    }

    public void setLetter_id(Integer letter_id) {
        this.letter_id = letter_id;
    }

    @Column(name = "from_id")
    public Integer getFrom_id() {
        return from_id;
    }

    public void setFrom_id(Integer from_id) {
        this.from_id = from_id;
    }

    @Column(name = "to_id")
    public Integer getTo_id() {
        return to_id;
    }

    public void setTo_id(Integer to_id) {
        this.to_id = to_id;
    }

    @Column(name = "content")
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Column(name = "letter_time")
    public Date getLetter_time() {
        return letter_time;
    }

    public void setLetter_time(Date letter_time) {
        this.letter_time = letter_time;
    }

    @Override
    public String toString() {
        return "Letter{" +
                "letter_id=" + letter_id +
                ", from_id=" + from_id +
                ", to_id=" + to_id +
                ", content='" + content + '\'' +
                ", letter_time=" + letter_time +
                '}';
    }
}

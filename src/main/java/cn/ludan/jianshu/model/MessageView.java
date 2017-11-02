package cn.ludan.jianshu.model;

import java.util.List;

/**
 * Created by ASUS on 2017/5/2.
 */
public class MessageView {
    private Integer user_id;
    private List<LetterView> letters;
    private List<CommentView> comments;
    private List<User> authorFollows;
    private List<User> articleLike;

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public List<LetterView> getLetters() {
        return letters;
    }

    public void setLetters(List<LetterView> letters) {
        this.letters = letters;
    }

    public List<CommentView> getComments() {
        return comments;
    }

    public void setComments(List<CommentView> comments) {
        this.comments = comments;
    }

    public List<User> getAuthorFollows() {
        return authorFollows;
    }

    public void setAuthorFollows(List<User> authorFollows) {
        this.authorFollows = authorFollows;
    }

    public List<User> getArticleLike() {
        return articleLike;
    }

    public void setArticleLike(List<User> articleLike) {
        this.articleLike = articleLike;
    }

    @Override
    public String toString() {
        return "MessageView{" +
                "user_id=" + user_id +
                ", letters=" + letters +
                ", comments=" + comments +
                ", authorFollows=" + authorFollows +
                ", articleLike=" + articleLike +
                '}';
    }
}

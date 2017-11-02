package cn.ludan.jianshu.dao;

import cn.ludan.jianshu.model.AuthorFollow;
import cn.ludan.jianshu.model.MessageView;
import cn.ludan.jianshu.model.User;
import cn.ludan.jianshu.model.UserView;

import java.util.List;

/**
 * Created by ASUS on 2017/4/9.
 */
public interface UserDAO extends BaseDAO<User> {
    /**
     * 获取热门作者
     * @return List<User>的五个热门作者
     */
    List<User> getHotUsers();

    /**
     * 获取所有的作者详情
     * @return
     */
    List<User> getAllUses();

    /**
     * 获取一个作者详情
     * @return
     */
    UserView getUserDetails(int user_id);

    /**
     * 获取作者个人信息
     * @return
     */
    UserView getPersonalMsg(int user_id);

    /**
     * 获取个人消息
     * @param user_id
     * @return
     */
    MessageView getMessages(int user_id);

    /**
     * 用户登录
     * @param user
     * @return
     */
    User getUser(User user);


}

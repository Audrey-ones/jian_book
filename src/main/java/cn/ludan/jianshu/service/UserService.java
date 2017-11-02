package cn.ludan.jianshu.service;

import cn.ludan.jianshu.model.AuthorFollow;
import cn.ludan.jianshu.model.MessageView;
import cn.ludan.jianshu.model.User;
import cn.ludan.jianshu.model.UserView;

import java.util.List;
import java.util.Map;

/**
 * Created by ASUS on 2017/4/27.
 */
public interface UserService {
    /**
     * 查询热门作者
     * @return List<User>的五个热门作者
     */
    List<User> getHotUsers();

    /**
     * 查询所有作者
     * @return
     */
    List<User> getAllUsers();

    /**
     * 查询作者详情
     * @param user_id
     * @return
     */
    UserView getUserDetails(int user_id);

    /**
     * 查询个人中心
     * @param user_id
     * @return
     */
    UserView getPersonalMsg(int user_id);

    /**
     * 查询个人信息
     * @param user_id
     * @return
     */
    MessageView getMessages(int user_id);

    Map sigIn(User user);

    /**
     * 关注作者
     * @param authorFollow
     */
    void followAuthor(AuthorFollow authorFollow);

    /**
     * 修改用户资料
     * @param user
     */
    void updateUser(User user);

    //用户注册
    void insertUser(User user);

    //通过账号查找账户
    User getUserById(int user_id);

}

package cn.ludan.jianshu.service.impl;

import cn.ludan.jianshu.dao.AuthorFollowDAO;
import cn.ludan.jianshu.dao.UserDAO;
import cn.ludan.jianshu.model.*;
import cn.ludan.jianshu.service.UserService;
import cn.ludan.jianshu.util.TokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ASUS on 2017/4/27.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;
    @Autowired
    private AuthorFollowDAO authorFollowDAO;

    @Override
    public List<User> getHotUsers() {
        List<User> userList = userDAO.getHotUsers();
        return userList;
    }

    @Override
    public List<User> getAllUsers() {
        return userDAO.selectAll();
    }

    @Override
    public UserView getUserDetails(int user_id) {
        UserView userView=userDAO.getUserDetails(user_id);
        return userView;
    }

    @Override
    public UserView getPersonalMsg(int user_id) {
        UserView userView=userDAO.getPersonalMsg(user_id);
        return userView;
    }

    @Override
    public MessageView getMessages(int user_id) {
        MessageView messageView=userDAO.getMessages(user_id);
        return messageView;
    }

    @Override
    public Map sigIn(User user) {
        User u=userDAO.getUser(user);
        Token token=null;
        if (u!=null){
            token=new Token();
            token.setUser_id(user.getUser_id());
            token.setToken(TokenUtil.getToken());

        }else {
            return null;
        }
        Map map=new HashMap();
        map.put("user",u);//存入用户信息
        map.put("token",token);//存入令牌信息
        return map;

    }

    @Override
    public void followAuthor(AuthorFollow authorFollow) {
        authorFollowDAO.insert(authorFollow);
        //更新专题的关注数
        Example example=new Example(User.class);
        example.createCriteria()
                .andEqualTo("user_id",authorFollow.getId_to());
       User user=userDAO.selectByExample(example).get(0);
        user.setFans_count(user.getFans_count()+1);
        userDAO.updateByExample(user,example);
    }

    @Override
    public void updateUser(User user) {
        Example example=new Example(User.class);
        example.createCriteria()
                .andEqualTo("user_id",user.getUser_id());
        User user1=userDAO.selectByExample(example).get(0);
        user1.setNickname(user.getNickname());
        user1.setHead(user.getHead());
        user1.setDescription(user.getDescription());
        userDAO.updateByExample(user1,example);
    }

    @Override
    public void insertUser(User user) {
        userDAO.insert(user);
    }

    @Override
    public User getUserById(int user_id) {
        User user=null;
        Example example=new Example(User.class);
        example.createCriteria().andEqualTo("user_id",user_id);
        List<User> list=userDAO.selectByExample(example);
        if (list.size()!=0){
            user=list.get(0);
        }
        return user;
    }

}

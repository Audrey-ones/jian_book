package cn.ludan.jianshu.service;

import cn.ludan.jianshu.model.AuthorFollow;
import cn.ludan.jianshu.model.MessageView;
import cn.ludan.jianshu.model.User;
import cn.ludan.jianshu.model.UserView;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Map;

/**
 * Created by ASUS on 2017/4/27.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void getAllUsers() throws Exception {
        List<User> userList = userService.getAllUsers();
        for (User users:userList
             ) {
            System.out.println(users);
        }

    }

    @Test
    public void getHotUsers() throws Exception {
        List<User> userList = userService.getHotUsers();
        for (User users: userList
             ) {
            System.out.println(users);
        }
    }

    @Test
    public void getUserDetails() throws Exception {
        UserView userView=userService.getUserDetails(2);
        System.out.println(userView);

    }

    @Test
    public void getPersonalMsg() throws Exception {
        UserView userView=userService.getPersonalMsg(6);
        System.out.println(userView);
    }

    @Test
    public void getMessages() throws Exception {
        MessageView messageView=userService.getMessages(6);
        System.out.println(messageView);
    }

    @Test
    public void sigIn() throws Exception {
        User user= new User("jianshu","jianshu");
        Map map=userService.sigIn(user);
        System.out.println(map);
    }

    @Test
    public void followAuthor() throws Exception {
        AuthorFollow authorFollow=new AuthorFollow(2,7);
        userService.followAuthor(authorFollow);
    }

    @Test
    public void updateUser() throws Exception {
        User user=new User(9,"夏行之1","img/user/user04.jpg","行之，简书签约作者、《读者》专栏作者");
        userService.updateUser(user);
    }

    @Test
    public void insertUser() throws Exception {
        User user=new User("少年叶安","yean","yean","img/user/user07.jpg","用写作自我救赎，寻找有趣灵魂的修行者",1223,0);
        userService.insertUser(user);
    }

    @Test
    public void getUserByAccount() throws Exception {
        User user=userService.getUserById(2);
        System.out.println(user);
    }


}
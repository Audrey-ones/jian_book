package cn.ludan.jianshu.web;

import cn.ludan.jianshu.model.AuthorFollow;
import cn.ludan.jianshu.model.MessageView;
import cn.ludan.jianshu.model.User;
import cn.ludan.jianshu.model.UserView;
import cn.ludan.jianshu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Created by ASUS on 2017/4/28.
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "allUsers",method = RequestMethod.GET)
    public @ResponseBody
    List<User> getAllUsers(){
        List<User> userList=userService.getAllUsers();
        return userList;
    }

    @RequestMapping(value = "userDetails/{user_id}",method = RequestMethod.GET)
    public @ResponseBody
    UserView getUserDetails(@PathVariable("user_id") int user_id){
        UserView userView=userService.getUserDetails(user_id);
        return userView;
    }

    @RequestMapping(value = "person/{user_id}",method = RequestMethod.GET)
    public @ResponseBody
    UserView getPersonalMsg(@PathVariable("user_id") int user_id){
        UserView userView=userService.getPersonalMsg(user_id);
        return userView;
    }

    @RequestMapping(value = "message/{user_id}",method = RequestMethod.GET)
    public @ResponseBody
    MessageView getMessages(@PathVariable("user_id") int user_id){
        MessageView messageView=userService.getMessages(user_id);
        return messageView;
    }

    @RequestMapping(value = "signIn",method = RequestMethod.POST)
    public @ResponseBody
    Map sigIn(@RequestBody User user){
        Map map=userService.sigIn(user);
        return map;
    }

    @RequestMapping(value = "followAuthor",method = RequestMethod.POST)
    public void followAuthor(@RequestBody AuthorFollow authorFollow){
        userService.followAuthor(authorFollow);
    }

    //修改个人信息
    @RequestMapping(value = "user",method = RequestMethod.POST)
    public User updateUser(HttpServletRequest request,
                           @RequestParam(value = "file",required = false)
                                   MultipartFile file) throws SQLException, IOException {
        int user_id= Integer.parseInt(request.getParameter("user_id"));
        System.out.println(1);
        User user=userService.getUserById(user_id);
        if (file!=null){
            String originalFileName=file.getOriginalFilename();//原图片名
            String newFileName= UUID.randomUUID()
                    +originalFileName.substring(originalFileName.lastIndexOf("."));//新图片名
            String filePath=request.getSession().getServletContext().getRealPath("/")
                    + "/img/user/"+newFileName;
            file.transferTo(new File(filePath));//将客户端文件上传到服务器
            user.setHead("img/user/"+newFileName);
            System.out.println(filePath);
        }
        String nickName = request.getParameter("nickname");
        user.setNickname(nickName);
        String description = request.getParameter("description");
        user.setDescription(description);
        userService.updateUser(user);
        System.out.println(user);
        return user;
    }

    @RequestMapping(value = "users",method = RequestMethod.POST)
    public void insertUser(@RequestBody User user){
        userService.insertUser(user);
    }

}

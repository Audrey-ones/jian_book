package cn.ludan.jianshu.util;

import java.util.UUID;

/**
 * Created by ASUS on 2017/5/8.
 * 令牌生成工具类
 */
public class TokenUtil {
    public static String getToken(){
        return UUID.randomUUID().toString();
    }
}

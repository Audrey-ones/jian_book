package cn.ludan.jianshu.dao;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by ASUS on 2017/4/9.
 */
public interface BaseDAO<T> extends Mapper<T>,MySqlMapper<T> {
}

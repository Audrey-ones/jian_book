package cn.ludan.jianshu.dao;

import cn.ludan.jianshu.model.Topic;
import cn.ludan.jianshu.model.TopicView;

import java.util.List;

/**
 * Created by ASUS on 2017/4/26.
 */
public interface TopicDAO extends BaseDAO<Topic> {
    /**
     * 获取热门专题
     * @return
     */
    List<Topic> getHotTopics();

    /**
     * 根据专题id获取专题相关的详情
     * @param topic_id
     * @return
     */
    TopicView getTopicView(int topic_id);
}

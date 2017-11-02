package cn.ludan.jianshu.service;

import cn.ludan.jianshu.model.Topic;
import cn.ludan.jianshu.model.TopicView;
import cn.ludan.jianshu.model.Topic_follow;

import java.util.List;

/**
 * Created by ASUS on 2017/4/26.
 */
public interface TopicService {
    /**
     * 获取热门专题
     * @return List<Topic>的六个热门专题
     */
    List<Topic> getHotTopics();

    List<Topic> getAllTopics();

    /**
     * 获取专题详情
     * @param topic_id
     * @return
     */
    TopicView getTopicView(int topic_id);

    void followTopic(Topic_follow topic_follow);
}

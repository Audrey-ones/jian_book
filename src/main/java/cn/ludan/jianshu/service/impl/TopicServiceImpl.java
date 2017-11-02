package cn.ludan.jianshu.service.impl;

import cn.ludan.jianshu.dao.TopicDAO;
import cn.ludan.jianshu.dao.TopicFollowDAO;
import cn.ludan.jianshu.model.Topic;
import cn.ludan.jianshu.model.TopicView;
import cn.ludan.jianshu.model.Topic_follow;
import cn.ludan.jianshu.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * Created by ASUS on 2017/4/26.
 */
@Service
@Transactional
public class TopicServiceImpl implements TopicService {
    @Autowired
    private TopicDAO topicDAO;
    @Autowired
    private TopicFollowDAO topicFollowDAO;
    @Override
    public List<Topic> getHotTopics() {
        List<Topic> topicList = topicDAO.getHotTopics();
        return topicList;
    }

    @Override
    public List<Topic> getAllTopics() {
        return topicDAO.selectAll();
    }

    @Override
    public TopicView getTopicView(int topic_id) {
        return topicDAO.getTopicView(topic_id);
    }

    @Override
    public void followTopic(Topic_follow topic_follow) {
        topicFollowDAO.insert(topic_follow);//向专题关注表插入一条记录
        //更新专题的关注数
        Example example=new Example(Topic.class);
        example.createCriteria()
                .andEqualTo("topic_id",topic_follow.getTopic_id());
        Topic topic=topicDAO.selectByExample(example).get(0);
        topic.setFollow_count(topic.getFollow_count()+1);
        topicDAO.updateByExample(topic,example);
    }
}

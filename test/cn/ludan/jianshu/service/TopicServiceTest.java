package cn.ludan.jianshu.service;

import cn.ludan.jianshu.model.Topic;
import cn.ludan.jianshu.model.TopicView;
import cn.ludan.jianshu.model.Topic_follow;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by ASUS on 2017/4/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class TopicServiceTest {

    @Autowired
    private TopicService topicService;

    @Test
    public void getHotTopics() throws Exception {
        List<Topic> topicList = topicService.getHotTopics();
        for (Topic topics:topicList
                ) {
            System.out.println(topics);
        }
    }

    @Test
    public void getAllTopics() throws Exception {
        List<Topic> topicList = topicService.getAllTopics();
        for (Topic topics:topicList
                ) {
            System.out.println(topics);
        }
    }

    @Test
    public void getTopicView() throws Exception {
        TopicView topicView=topicService.getTopicView(2);
        System.out.println(topicView);
    }

    @Test
    public void followTopic() throws Exception {
        Topic_follow topic_follow=new Topic_follow(4,4);
        topicService.followTopic(topic_follow);
        System.out.println(topic_follow);
    }

}
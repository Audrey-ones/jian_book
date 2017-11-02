package cn.ludan.jianshu.web;

import cn.ludan.jianshu.model.Topic;
import cn.ludan.jianshu.model.TopicView;
import cn.ludan.jianshu.model.Topic_follow;
import cn.ludan.jianshu.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/**
 * Created by ASUS on 2017/4/27.
 */
@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;

    @RequestMapping(value = "allTopics",method = RequestMethod.GET)
    public @ResponseBody
    List<Topic> getAllTopics(){
        List<Topic> topicList=topicService.getAllTopics();
        return topicList;
    }

    @RequestMapping(value = "topicView/{topic_id}",method = RequestMethod.GET)
    public @ResponseBody TopicView getTopicView(@PathVariable("topic_id") int topic_id){
        TopicView topicView=topicService.getTopicView(topic_id);
        return topicView;
    }

    @RequestMapping(value = "topicFollow",method = RequestMethod.POST)
    public void followTopic(@RequestBody Topic_follow topic_follow){
        topicService.followTopic(topic_follow);
    }
}

package io.jb.topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.*;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
@Autowired
	private TopicService topicservice;
@RequestMapping("/topp")
public List<Topic> getTo(){
	return topicservice.getTo();
}
	@RequestMapping("/topp/{id}")
	public Topic getTos(@PathVariable String id){
		return topicservice.getTos(id);
	}
		@RequestMapping(method=RequestMethod.POST,value="/topp")
	public void addTop(@RequestBody Topic tope) {
		topicservice.addTop(tope);}
		
		@RequestMapping(method=RequestMethod.PUT,value="/topp/{id}")
		public void updateTopic(@RequestBody Topic tope,@PathVariable String id) {
			topicservice.updateTopic(id,tope);
		}
			@RequestMapping(method=RequestMethod.DELETE,value="/topp/{id}")
			public void deleteTopic(@PathVariable String id) {
				 topicservice.deleteTopic(id);
	}
	
}



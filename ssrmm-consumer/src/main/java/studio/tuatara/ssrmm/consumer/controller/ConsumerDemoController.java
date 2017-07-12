package studio.tuatara.ssrmm.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import studio.tuatara.ssrmm.consumer.service.IDemoService;

@RestController
public class ConsumerDemoController {
	
	@Autowired
	private IDemoService demoService;
	
	@RequestMapping("/demo")
	String demo(){
		return demoService.demo();
	}

	
	@RequestMapping("/wonderful")
	String wonderful(){
		return demoService.wonderful();
	}
}

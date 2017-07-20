/**
 * 
 */
package studio.tuatara.ssrmm.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import studio.tuatara.ssrmm.provider.service.IProviderDemoService;

/**
 * @author Rjan
 *
 */
@RestController
@RefreshScope
public class ProviderDemoController {
	
	@Value("${demo.name}")
	//测试config server的内容
	private String demoConfig;
	
	
	@Autowired
	private IProviderDemoService demoService;
	
	@RequestMapping("/demo")
	String demo(){
		return "hello world, from "+demoConfig;
	}
	
	@RequestMapping("/wonderful")
	String wonderful(){
		return "hello cloud"+demoService.queryUsers().toString();
	}

}

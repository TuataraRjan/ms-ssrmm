/**
 * 
 */
package studio.tuatara.ssrmm.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Rjan
 *
 */
@RestController
public class ProviderDemoController {
	
	@Value("${demo.name}")
	//测试config server的内容
	private String demoConfig;
	
	@RequestMapping("/demo")
	String demo(){
		return "hello world, from "+demoConfig;
	}
	
	@RequestMapping("/wonderful")
	String wonderful(){
		return "hello cloud";
	}

}

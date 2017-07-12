/**
 * 
 */
package studio.tuatara.ssrmm.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Rjan
 *
 */
@FeignClient(name="Provider",fallback=DemoServiceHystrix.class)
public interface IDemoService {

	@RequestMapping("/demo")
	String demo();
	
	@RequestMapping("/wonderful")
	String wonderful();
}

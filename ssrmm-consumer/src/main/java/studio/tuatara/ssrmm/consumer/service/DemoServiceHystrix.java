/**
 * 
 */
package studio.tuatara.ssrmm.consumer.service;

import org.springframework.stereotype.Component;

/**
 * @author Rjan
 *
 */
@Component
public class DemoServiceHystrix implements IDemoService {

	/* (non-Javadoc)
	 * @see studio.tuatara.ssrmm.consumer.service.IDemoService#demo()
	 */
	@Override
	public String demo() {
		
		return "failed";
	}

	@Override
	public String wonderful() {
		
		return "not wonderful";
	}

}

/**
 * 
 */
package studio.tuatara.ssrmm.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author Rjan
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
//下方两个注解都是dashboard所需，单独使用hystrix不需要，因为feign已经自带了断路器的内容
@EnableHystrix
@EnableHystrixDashboard
public class Consumer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Consumer.class, args);
	}

}

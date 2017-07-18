/**
 * 
 */
package stutio.tuatara.ssrmm.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Rjan
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class Gateway {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Gateway.class, args);

	}

}

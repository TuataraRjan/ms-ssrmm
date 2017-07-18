/**
 * 
 */
package stutio.tuatara.ssrmm.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Rjan
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class Gateway {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Gateway.class, args);

	}

}

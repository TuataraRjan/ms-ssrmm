/**
 * 
 */
package studio.tuatara.ssrmm.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Rjan
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class Provider {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Provider.class, args);

	}

}

/**
 * 
 */
package studio.tuatara.ssrmm.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Rjan
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(EurekaServer.class, args);
	}

}

/**
 * 
 */
package studio.tuatara.ssrmm.cserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Rjan
 *
 */
@SpringBootApplication
@EnableConfigServer
public class CServer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(CServer.class, args);

	}

}

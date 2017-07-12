/**
 * 
 */
package studio.tuatara.ssrmm.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author Rjan
 *
 */
@SpringBootApplication
@EnableTurbine
@EnableHystrixDashboard
public class Monitor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Monitor.class, args);

	}

}

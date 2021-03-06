package mk;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
@EnableDiscoveryClient
@EnableScheduling
@Configuration
public class AdminApp {
	public static void main(String[] args) {

		System.out.println("Version 02.02.2019");
		System.out.println("Environment variables");
		
//		UUID uniqueKey = UUID.randomUUID();
//		String span=UUID.randomUUID().toString();
		
//		String spanid= (UUID.randomUUID().toString()).replace("-","").substring(0, 16);
		
//	    System.out.println ("uniqueKey:"+ span);		


		Map<String, String> env = System.getenv();
		for (String envName : env.keySet()) {
			System.out.format("%s=%s%n", envName, env.get(envName));
		}

		SpringApplication.run(AdminApp.class, args);
	}

}

package me.dyatkokg.resumeconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ResumeConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResumeConfigApplication.class, args);
	}

}

package com.rednavis.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MaasAuthApplication {

  public static void main(String[] args) {
    SpringApplication.run(MaasAuthApplication.class, args);
  }

}

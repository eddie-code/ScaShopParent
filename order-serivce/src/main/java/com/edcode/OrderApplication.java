package com.edcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author eddie.lee
 * @date 2022-04-19 21:08
 * @description 订单
 */
@SpringBootApplication
//@EnableDiscoveryClient
public class OrderApplication {

  public static void main(String[] args) {
    SpringApplication.run(OrderApplication.class);
  }

  @Bean
//  @LoadBalanced
  public RestTemplate create() {
    return new RestTemplate();
  }

}

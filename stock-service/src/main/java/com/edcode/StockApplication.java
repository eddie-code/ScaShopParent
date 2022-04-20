package com.edcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author eddie.lee
 * @date 2022-04-19 21:46
 * @description 库存
 */
@SpringBootApplication
@EnableDiscoveryClient
public class StockApplication {

  public static void main(String[] args) {
    SpringApplication.run(StockApplication.class);
  }

}

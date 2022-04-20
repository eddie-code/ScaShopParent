package com.edcode.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author eddie.lee
 * @date 2022-04-19 21:07
 * @description
 */
@RestController
public class OrderController {

  @Autowired
  private RestTemplate restTemplate;

  @GetMapping("/order/create")
  public String createOrder(Integer productId, Integer userId) {
    // 库存
    String result = restTemplate.getForObject("http://stock-service/stock/reduce/" + productId, String.class);
    return result;
  }
}

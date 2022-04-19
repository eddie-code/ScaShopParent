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

  // 订单
  @GetMapping("/order/create")
  public String createOrder(Integer productId, Integer userId) {
    // 商品
    String productName = restTemplate.getForObject("http://localhost:8200/product/" + productId, String.class);
    // 用户
    String userName = restTemplate.getForObject("http://localhost:8100/user/" + userId, String.class);
    // 库存
    String result = restTemplate.getForObject("http://localhost:8400//stock/reduce/" + productId, String.class);
    // 购物车
    String cartResult = restTemplate.getForObject("http://localhost:8500/shopcart/remove?productId=" + productId+"&userId=" + userId, String.class);
    return "用户：" + userName + " 购买商品： " + productName+" " + result + " " + cartResult;
  }
}

package com.edcode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author eddie.lee
 * @date 2022-04-19 21:07
 * @description
 */
@RestController
public class ProductionController {

  @GetMapping("/product/{productId}")
  public String getProduct(@PathVariable Integer productId) {
    System.out.println("调用商品服务");
    return "Iphone 13";
  }

}

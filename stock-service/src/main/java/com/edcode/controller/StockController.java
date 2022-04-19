package com.edcode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author eddie.lee
 * @date 2022-04-19 21:46
 * @description
 */
@RestController
public class StockController {

  @GetMapping("/stock/reduce/{productId}")
  public String reduce(@PathVariable Integer productId) {
    return "减库存1个成功";
  }

}

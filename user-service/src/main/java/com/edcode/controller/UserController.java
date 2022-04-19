package com.edcode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author eddie.lee
 * @date 2022-04-19 21:33
 * @description
 */
@RestController
public class UserController {

  @GetMapping("/user/{userId}")
  public String getUserName(@PathVariable Integer userId) {
    return "孙悟空";
  }
}

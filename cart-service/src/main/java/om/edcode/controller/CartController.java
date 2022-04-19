package om.edcode.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author eddie.lee
 * @date 2022-04-19 21:58
 * @description
 */
@RestController
public class CartController {

  @GetMapping("/shopcart/remove")
  public String remove(Integer productId,Integer userId){
    return "移出购物车成功";
  }

}

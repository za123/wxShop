package com.q.consumer.controller;

import Com.q.entity.ResultEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by Administrator on 2020/2/18 0018
 */
@RestController
@RequestMapping(value = "/consumer")
public class UserController {

  //TODO 登录方法 - 获取购买记录 - 购物车

  @PostMapping(value = "/login")
  public ResultEntity login(String code) {

    return ResultEntity.success("messageId-1", null);
  }

  /**
   * 绑定手机号
   * @param phoneNumber 手机号
   * @return
   */
  @PostMapping(value = "wxToPhone")
  public ResultEntity wxToPhone(String phoneNumber) {
    return ResultEntity.success("message-1", null);
  }

  @PostMapping(value = "/logout")
  public ResultEntity logout(String token) {
    return ResultEntity.success("messageId-1", null);
  }
}

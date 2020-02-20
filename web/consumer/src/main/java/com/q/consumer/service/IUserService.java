package com.q.consumer.service;

/**
 * Create by Administrator on 2020/2/19 0019
 */
public interface IUserService {

  /**
   * 微信小程序端 获取登录code 转服务器 发送到微信服务器
   * 登录成功得到用户唯一标识 储存到Redis中
   * @param code
   * @return
   */
  Integer login(String code);

  boolean wxToPhone(String phoneNumber,String wxToken);
}

package com.q.consumer.service.impl;

import com.q.consumer.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * Create by Administrator on 2020/2/19 0019
 * 用户登录
 */
@Service
public class UserServiceImpl implements IUserService {

  @Override
  public Integer login(String code) {
    return null;
  }

  @Override
  public boolean wxToPhone(String phoneNumber, String wxToken) {
    return false;
  }
}

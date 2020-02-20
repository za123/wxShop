package com.q.utils;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * Create by Administrator on 2020/2/18 0018
 */
@Component
public class ApplicationContextUtils implements ApplicationContextAware {

  @Autowired
  private static ApplicationContext context;


  @Override
  public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    ApplicationContextUtils.context = applicationContext;
  }

  private static ApplicationContext getApplicationContext() {
    return context;
  }

  public static <T> T getBean(String beanName) {
    return (T) getApplicationContext().getBean(beanName);
  }
}

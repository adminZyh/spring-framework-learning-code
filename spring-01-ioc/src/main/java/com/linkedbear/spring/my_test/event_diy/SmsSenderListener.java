package com.linkedbear.spring.my_test.event_diy;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * 自定义监听器
 */
public class SmsSenderListener implements ApplicationListener<RegisterSuccessEvent> {

  @Override
  public void onApplicationEvent(RegisterSuccessEvent event) {
    System.out.println("监听到用户注册成功，发送短信");
  }
}

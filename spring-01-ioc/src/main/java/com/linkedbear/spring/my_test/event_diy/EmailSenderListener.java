package com.linkedbear.spring.my_test.event_diy;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class EmailSenderListener {
  @EventListener
  public void onRegisterSuccessEvent(RegisterSuccessEvent event) {
    System.out.println("监听到用户注册成功，发送邮件中");
  }
}

package com.linkedbear.spring.my_test.event_diy;

import org.springframework.context.ApplicationEvent;

/**
 * 自定义事件
 */
public class RegisterSuccessEvent extends ApplicationEvent {
  RegisterSuccessEvent(Object source) {
    super(source);
  }
}

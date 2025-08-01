package com.linkedbear.spring.my_test.event_diy;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

@Service
public class RegisterService implements ApplicationEventPublisherAware {

  ApplicationEventPublisher publisher;

  public void register(String username) {
    System.out.println(username + "注册成功");
    publisher.publishEvent(new RegisterSuccessEvent(username));
  }

  @Override
  public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
    this.publisher = applicationEventPublisher;
  }
}

package com.linkedbear.spring.my_test.event_diy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class RegisterApplication {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
        "com.linkedbear.spring.my_test.event_diy");
    RegisterService registerService = applicationContext.getBean(RegisterService.class);
    registerService.register("王二麻子");
  }
}

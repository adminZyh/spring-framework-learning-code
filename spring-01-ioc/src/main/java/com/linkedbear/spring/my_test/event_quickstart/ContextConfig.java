package com.linkedbear.spring.my_test.event_quickstart;

import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class ContextConfig {

  @EventListener
  public void onContextClosed(ContextClosedEvent event) {
    System.out.println("ContextClosedApplicationListener监听到ContextClosedEvent事件！");
  }
}

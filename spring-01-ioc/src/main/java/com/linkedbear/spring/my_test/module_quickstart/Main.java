package com.linkedbear.spring.my_test.module_quickstart;

import com.linkedbear.spring.my_test.module_quickstart.config.TavernConfig;
import java.util.Map;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {
    AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
        "com.linkedbear.spring.my_test.module_quickstart.config");
    Boss boss = applicationContext.getBean(Boss.class);
    Map<String, Bartender> barters = applicationContext.getBeansOfType(Bartender.class);
    System.out.println(boss);
    barters.values().forEach(System.out::println);
    Map<String, Bar> bars = applicationContext.getBeansOfType(Bar.class);
    bars.values().forEach(System.out::println);
    Map<String, Waiter> waiters = applicationContext.getBeansOfType(Waiter.class);
    waiters.values().forEach(System.out::println);
  }
}

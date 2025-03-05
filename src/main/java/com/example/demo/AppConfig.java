package com.example.demo;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example")
public class AppConfig {

  @Bean
  @ConditionalOnMissingBean
  // someService型のBeanが存在しない時にのみ、SomeService Beanが登録される
  public SomeService someService() {
    return new SomeService();
  }
}

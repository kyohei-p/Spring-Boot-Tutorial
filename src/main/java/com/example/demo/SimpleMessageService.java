package com.example.demo;

import org.springframework.stereotype.Service;

@Service
public class SimpleMessageService implements MessageService {
  @Override
  public String getMessage() {
    return "Spring Message!";
  }
}

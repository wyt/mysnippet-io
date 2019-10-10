package io.mysnippet.samples.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

/** 事件发布 */
@Component
public class FoobarPub {

  @Autowired private ApplicationContext applicationContext;

  public void publish(String msg) {
    applicationContext.publishEvent(new FoobarEvent(this, msg));
  }
}

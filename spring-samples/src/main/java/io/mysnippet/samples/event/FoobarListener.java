package io.mysnippet.samples.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class FoobarListener implements ApplicationListener<FoobarEvent> {

  @Override
  public void onApplicationEvent(FoobarEvent event) {
    String msg = event.getMsg();
    System.out.println(String.format("监听到事件, 消息为: %s", msg));
  }
}

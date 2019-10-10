package io.mysnippet.samples.event;

import org.springframework.context.ApplicationEvent;

public class FoobarEvent extends ApplicationEvent {

  private String msg;

  /**
   * Create a new ApplicationEvent.
   *
   * @param source the object on which the event initially occurred (never {@code null})
   */
  public FoobarEvent(Object source, String msg) {
    super(source);
    this.msg = msg;
  }

  public String getMsg() {
    return msg;
  }

  public void setMsg(String msg) {
    this.msg = msg;
  }
}

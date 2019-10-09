package io.mysnippet.server.controller;

import io.mysnippet.server.domain.AppUser;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppUserController {

  /**
   * 当前用户信息
   *
   * @return
   */
  @PostMapping(value = "/mine")
  public AppUser mine() {
    AppUser user = new AppUser();
    user.setId(1);
    user.setNickname("Angus");
    user.setUsername("wangyt");
    user.setPassword("000000");
    user.setEmail("sdwyt@foxmail.com");
    user.setMobile("18710019882");
    System.out.println("user: " + user);
    return user;
  }
}

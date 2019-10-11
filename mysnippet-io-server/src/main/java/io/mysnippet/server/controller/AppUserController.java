package io.mysnippet.server.controller;

import io.mysnippet.server.domain.AppUser;
import io.mysnippet.server.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppUserController {

  @Autowired private AppUserService appUserService;

  /**
   * 当前用户信息
   *
   * @return
   */
  @PostMapping(value = "/mine")
  public AppUser mine() {
    AppUser appUser = appUserService.getAppUserInfo(1L);
    return appUser;
  }
}

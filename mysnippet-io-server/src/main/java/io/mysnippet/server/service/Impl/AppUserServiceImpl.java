package io.mysnippet.server.service.Impl;

import io.mysnippet.server.domain.AppUser;
import io.mysnippet.server.service.AppUserService;
import org.springframework.stereotype.Service;

@Service
public class AppUserServiceImpl implements AppUserService {

  @Override
  public AppUser getAppUserInfo(long id) {
    AppUser user = new AppUser();
    user.setId(id);
    user.setNickname("Angus");
    user.setUsername("wangyt");
    user.setPassword("000000");
    user.setEmail("sdwyt@foxmail.com");
    user.setMobile("18710019882");
    return user;
  }
}

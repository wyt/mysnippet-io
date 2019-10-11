package io.mysnippet.server.service;

import io.mysnippet.server.domain.AppUser;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppUserServiceTest {

  @Autowired AppUserService appUserService;

  @Test
  public void getAppUserInfo() {
    AppUser appUser = appUserService.getAppUserInfo(2L);
    Assertions.assertThat(appUser.getId()).isEqualTo(2L);
  }
}

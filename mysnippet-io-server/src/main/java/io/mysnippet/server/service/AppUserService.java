package io.mysnippet.server.service;

import io.mysnippet.server.domain.AppUser;

public interface AppUserService {

    AppUser getAppUserInfo(long id);
}

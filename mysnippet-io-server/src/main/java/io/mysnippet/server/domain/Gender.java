package io.mysnippet.server.domain;

import lombok.Getter;

/**
 * 性别枚举
 *
 * @author wangyongtao
 * @date 2019-8-5
 */
@Getter
public enum Gender {
  Male("男"),
  Female("女");

  Gender(String value) {
    this.value = value;
  }

  private String value;
}

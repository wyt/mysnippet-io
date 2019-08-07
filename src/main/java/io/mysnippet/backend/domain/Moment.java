package io.mysnippet.backend.domain;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * 时刻领域模型
 *
 * @author wangyongtao
 * @date 2019-8-5
 */
@Setter
@Getter
public class Moment {

  //  DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-dd HH:mm:ss.SSS");

  /** 创建时间 */
  private LocalDateTime created;

  /** 更新时间 */
  private LocalDateTime updated;

  public Moment() {
    LocalDateTime localDateTime = LocalDateTime.now();
    this.created = localDateTime;
    this.updated = localDateTime;
  }
}

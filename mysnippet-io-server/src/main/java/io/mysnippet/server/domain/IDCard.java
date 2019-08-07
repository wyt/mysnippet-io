package io.mysnippet.server.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * 身份证领域模型
 *
 * @author wangyongtao
 * @date 2019-8-5
 */
@Setter
@Getter
public class IDCard extends Moment implements Serializable {

  private static final long serialVersionUID = -740932057246121632L;

  /** ID */
  private int id;

  /** 姓名 */
  private String name;

  /** 性别 */
  private Gender gender;

  /** 出生日期 */
  private Date birthDate;

  /** 住址 */
  private String residentialAddress;

  /** 公民身份证号 */
  private String idCardNum;

  /** 签发机关 */
  private String issuingAuthority;

  /** 有效期限,开始日期 */
  private Date expireDateStart;

  /** 有效期限,截止日期 */
  private Date expireDateEnd;
}

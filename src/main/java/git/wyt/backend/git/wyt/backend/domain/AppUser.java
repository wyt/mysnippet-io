package git.wyt.backend.git.wyt.backend.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 应用用户领域模型
 *
 * @author wangyongtao
 * @date 2019-8-5
 */
@Setter
@Getter
public class AppUser extends Moment implements Serializable {

  private static final long serialVersionUID = -8580722592397126361L;

  /** ID */
  private int id;

  /** 昵称 */
  private String nickname;

  /** 用户名 */
  private String username;

  /** 密码 */
  private String password;

  /** 电子邮箱 */
  private String email;

  /** 手机号 */
  private int mobile;
}

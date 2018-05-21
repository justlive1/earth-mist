package vip.justlive.mist.api.model;

import java.io.Serializable;
import lombok.Data;

/**
 * 用户
 *
 * @author wubo
 */
@Data
public class User implements Serializable {

  private static final long serialVersionUID = 1L;

  private String id;
  /**
   * 用户名
   */
  private String name;

  /**
   * 密码
   */
  private String password;

  /**
   * 是否启用
   */
  private Integer enabled;

}

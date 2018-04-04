package justlive.earth.breeze.mist.api.principal;

import java.io.Serializable;

/**
 * 通过的认证（包括服务和用户）
 */
public interface Principal extends Serializable {

  /**
   * 获取唯一标识
   *
   * @return
   */
  String getId();
}

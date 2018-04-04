package justlive.earth.breeze.mist.valid.ticket;

import java.io.Serializable;

/**
 * ticket接口
 *
 * @author wubo
 */
public interface Ticket extends Serializable {

  /**
   * 获取唯一标示
   */
  String getId();

  /**
   * 是否失效
   */
  boolean isExpired();

  /**
   * 前缀
   *
   * @return
   */
  String getPrefix();
}

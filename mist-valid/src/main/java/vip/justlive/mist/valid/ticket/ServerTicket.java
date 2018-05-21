package vip.justlive.mist.valid.ticket;

import vip.justlive.mist.api.principal.Service;

/**
 * 服务ticket，全局票据
 *
 * @author wubo
 */
public interface ServerTicket extends Ticket {

  /**
   * 获取使用ticket的服务
   *
   * @return
   */
  Service getService();

}

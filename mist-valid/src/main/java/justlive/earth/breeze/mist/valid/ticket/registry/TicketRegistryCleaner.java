package justlive.earth.breeze.mist.valid.ticket.registry;

import justlive.earth.breeze.mist.valid.ticket.Ticket;

/**
 * ticket清除接口
 *
 * @author wubo
 */
public interface TicketRegistryCleaner {

  /**
   * 清除过期ticket
   */
  void clean();

  /**
   * 清除一个已过期的ticket
   *
   * @param ticket
   * @return
   */
  long cleanTicket(Ticket ticket);

}

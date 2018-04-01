package justlive.earth.breeze.mist.valid.ticket.registry;

import java.util.Collection;
import justlive.earth.breeze.mist.valid.ticket.Ticket;

/**
 * 注册ticket接口
 *
 * @author wubo
 */
public interface TicketRegistry {

  /**
   * 向registry添加ticket
   *
   * @param ticket
   */
  void addTicket(Ticket ticket);

  /**
   * 根据ticketId获取ticket
   *
   * @param ticketId
   * @return
   */
  Ticket getTicket(String ticketId);

  /**
   * 根据ticketId获取ticket
   *
   * @param ticketId
   * @param clazz
   * @param <T>
   * @return
   */
  <T extends Ticket> T getTicket(String ticketId, Class<T> clazz);

  /**
   * 获取所有ticket
   *
   * @return
   */
  Collection<Ticket> getTickets();

  /**
   * 删除ticket
   *
   * @param ticketId
   * @return
   */
  long deleteTicket(String ticketId);

  /**
   * 删除所有
   *
   * @return
   */
  long deleteAll();


}

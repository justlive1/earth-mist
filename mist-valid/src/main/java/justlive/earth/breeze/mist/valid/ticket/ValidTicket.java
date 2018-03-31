package justlive.earth.breeze.mist.valid.ticket;

/**
 * 用于验证的临时ticket
 *
 * @author wubo
 */
public interface ValidTicket extends Ticket {

  /**
   * 设置超时时间
   */
  void setTimeout(long timeout);

}

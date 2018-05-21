package vip.justlive.mist.valid.ticket;

/**
 * ticketId生成接口
 *
 * @author wubo
 */
public interface TicketIdGenerator {

  /**
   * 生成id
   *
   * @return
   */
  String create();

  /**
   * 生成带后缀的id
   *
   * @param suffix
   * @return
   */
  String create(String suffix);

}

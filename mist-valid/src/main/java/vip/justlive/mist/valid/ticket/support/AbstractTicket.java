package vip.justlive.mist.valid.ticket.support;

import java.time.ZonedDateTime;
import lombok.Getter;
import lombok.Setter;
import vip.justlive.mist.valid.ticket.Ticket;
import vip.justlive.mist.valid.ticket.TicketState;

/**
 * ticket抽象类
 *
 * @author wubo
 */
@Setter
public abstract class AbstractTicket implements Ticket, TicketState {

  private static final long serialVersionUID = 1L;

  /**
   * id
   */
  protected String id;

  /**
   * 最后使用时间
   */
  @Getter
  protected ZonedDateTime lastUsedTime;

  /**
   * 是否过期，用于手动设置
   */
  protected boolean expired;

  /**
   * 创建时间
   */
  @Getter
  protected ZonedDateTime createdTime;

  public AbstractTicket(String id) {
    this.id = id;
    this.createdTime = this.lastUsedTime = ZonedDateTime.now();
  }

  @Override
  public String getId() {
    return this.id;
  }

  @Override
  public boolean isExpired() {
    return expired || lastUsedTime.isBefore(ZonedDateTime.now());
  }

  @Override
  public void update() {
    this.lastUsedTime = ZonedDateTime.now();
  }

  @Override
  public String toString() {
    return this.getId();
  }

}

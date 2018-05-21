package vip.justlive.mist.valid.ticket.support;

import java.util.UUID;
import vip.justlive.mist.valid.ticket.TicketIdGenerator;

/**
 * 默认id生成器实现，uuid实现
 */
public class DefaultTicketIdGenerator implements TicketIdGenerator {

  public static final String DEFAULT_SUFFIX = "dtig";

  @Override
  public String create() {
    return this.create(DEFAULT_SUFFIX);
  }

  @Override
  public String create(String suffix) {
    return UUID.randomUUID().toString().replace("-", "").concat("-").concat(suffix);
  }
}

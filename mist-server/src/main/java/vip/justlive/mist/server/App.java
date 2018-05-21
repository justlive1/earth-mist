package vip.justlive.mist.server;

import io.vertx.core.Vertx;
import lombok.extern.slf4j.Slf4j;
import vip.justlive.mist.server.verticle.WebVerticle;

/**
 * 程序入口
 *
 * @author wubo
 */
@Slf4j
public class App {

  public static void main(String[] args) {

    Vertx.vertx().deployVerticle(WebVerticle.class.getName(), res -> {
      if (res.succeeded()) {
        log.info("Deployment id is: {}", res.result());
      } else {
        log.info("Deployment failed!");
      }
    });

  }
}

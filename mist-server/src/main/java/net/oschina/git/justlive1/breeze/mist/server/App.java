package net.oschina.git.justlive1.breeze.mist.server;

import io.vertx.core.Vertx;
import lombok.extern.slf4j.Slf4j;
import net.oschina.git.justlive1.breeze.mist.server.demo.DemoVerticle;

/**
 * 程序入口
 *
 * @author wubo
 */
@Slf4j
public class App {

  public static void main(String[] args) {

    Vertx.vertx().deployVerticle(DemoVerticle.class.getName(), res -> {
      if (res.succeeded()) {
        log.info("Deployment id is: {}", res.result());
      } else {
        log.info("Deployment failed!");
      }
    });

  }
}

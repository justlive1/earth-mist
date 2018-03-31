package justlive.earth.breeze.mist.server;

import io.vertx.core.Vertx;
import justlive.earth.breeze.mist.server.demo.DemoVerticle;
import lombok.extern.slf4j.Slf4j;

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

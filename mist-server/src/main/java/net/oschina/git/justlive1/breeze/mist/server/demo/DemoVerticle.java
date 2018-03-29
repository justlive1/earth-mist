package net.oschina.git.justlive1.breeze.mist.server.demo;

import io.vertx.core.AbstractVerticle;

/**
 * Created by wubo on 2018/2/28.
 */
public class DemoVerticle extends AbstractVerticle {

  @Override
  public void start() {
    vertx.createHttpServer().requestHandler(
        req -> req.response().putHeader("content-type", "text/plain").end("Hello World!"))
        .listen(8080);

  }

}
package vip.justlive.mist.server.verticle;

import com.google.common.collect.ImmutableSet;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.http.HttpMethod;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.BodyHandler;
import io.vertx.ext.web.handler.CookieHandler;
import io.vertx.ext.web.handler.CorsHandler;
import java.util.Set;
import justlive.earth.breeze.snow.common.base.constant.BaseConstants;
import justlive.earth.breeze.snow.common.web.vertx.support.RouteRegisterFactory;

/**
 * Web
 *
 * @author wuob
 */
public class WebVerticle extends AbstractVerticle {

  @Override
  public void start() {

    Router router = Router.router(vertx);

    Set<HttpMethod> methods = ImmutableSet.<HttpMethod>builder().add(HttpMethod.GET)
        .add(HttpMethod.POST).add(HttpMethod.OPTIONS).add(HttpMethod.PUT).add(HttpMethod.DELETE)
        .add(HttpMethod.HEAD).build();

    // 添加跨域的方法
    router.route().handler(CorsHandler.create(BaseConstants.ANY).allowedMethods(methods));
    router.route().handler(CookieHandler.create());
    router.route().handler(BodyHandler.create());

    RouteRegisterFactory routeRegisterFactory = new RouteRegisterFactory(router);
    routeRegisterFactory.execute();

    vertx.createHttpServer().requestHandler(router::accept).listen(8080);

  }

}
package vip.justlive.mist.server.controller;

import io.vertx.core.http.HttpMethod;
import justlive.earth.breeze.snow.common.web.vertx.annotation.VertxRoute;
import justlive.earth.breeze.snow.common.web.vertx.annotation.VertxRouteMapping;

/**
 * 访问路由，默认使用form访问
 *
 * @author wubo
 */
@VertxRoute
public class AccessController {

  /**
   * 跳转登录页面
   *
   * @return
   */
  @VertxRouteMapping(method = HttpMethod.GET, value = "/login")
  public String login() {
    // TODO render html
    return "login";
  }

  /**
   * 退出登录
   *
   * @return
   */
  @VertxRouteMapping(method = HttpMethod.GET, value = "/logout")
  public String logout() {
    // TODO render html
    return "logout";
  }

}

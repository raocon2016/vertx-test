package io.vertx.blog.first;

import io.vertx.core.Vertx;

/**
 * Created by Naver on 2016-07-01.
 */
public class TestLauncher {

    public static void main(String[] args) {
        Vertx.vertx().deployVerticle("io.vertx.blog.first.TCPServerVerticle");
//        Vertx.vertx().deployVerticle("io.vertx.blog.first.HelloVerticle");
//        Vertx.vertx().deployVerticle("io.vertx.blog.first.MyFirstVerticle");
    }
}

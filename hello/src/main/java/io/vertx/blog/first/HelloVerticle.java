package io.vertx.blog.first;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

/**
 * Created by Naver on 2016-07-01.
 */
public class HelloVerticle extends AbstractVerticle {
    private Logger logger = LoggerFactory.getLogger(HelloVerticle.class);

    public void start() {
//        Logger logger = LoggerFactory.getLogger(HelloVerticle.class);
        System.out.println("Hello World!!!");
        logger.info("hello!");
    }

}

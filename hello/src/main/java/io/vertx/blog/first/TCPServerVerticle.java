package io.vertx.blog.first;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;
import io.vertx.core.net.NetServer;
import io.vertx.core.net.NetSocket;

/**
 * Created by Naver on 2016-07-01.
 */
public class TCPServerVerticle extends AbstractVerticle {
    private Logger logger = LoggerFactory.getLogger(TCPServerVerticle.class);

    @Override
    public void start() {
        NetServer netServer = getVertx().createNetServer();
        netServer.connectHandler((NetSocket netSocket) -> {
            netSocket.handler(event -> logger.info(event.toString()));
        });
        netServer.listen(8090, "localhost");
    }

}

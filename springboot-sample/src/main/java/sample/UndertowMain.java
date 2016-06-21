package sample;

import org.xnio.Options;

import io.undertow.Undertow;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.Headers;

public class UndertowMain {

    public static void main(final String[] args) {
        // Standalone undertow server
        Undertow server = Undertow.builder()
                .setSocketOption(Options.BACKLOG, 128)
                .setIoThreads(8)
                .setWorkerThreads(32)
                .addHttpListener(8080, "0.0.0.0")
                .setHandler(new HttpHandler() {
                    @Override
                    public void handleRequest(final HttpServerExchange exchange) throws Exception {
                        exchange.getResponseHeaders().put(Headers.CONTENT_TYPE, "application/json");
                        exchange.getResponseSender().send("{\"id\":0}");
                    }
                }).build();
        
        server.start();
    }
}

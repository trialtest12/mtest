package com.home.msr;


import com.sun.jersey.api.container.grizzly2.GrizzlyServerFactory;
import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.api.core.ResourceConfig;
import org.glassfish.grizzly.http.server.HttpServer;

import java.io.IOException;

public class AppServer {

    public static void main(String[] args) throws IOException, InterruptedException {
        ResourceConfig rc = new PackagesResourceConfig("com.home.msr");
        HttpServer server = GrizzlyServerFactory.createHttpServer("http://localhost:9999", rc);
        server.start();
        Thread.currentThread().join();
    }
}

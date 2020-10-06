package com.apa.multimodule.core;

import com.apa.multimodule.service.Service;

/**
 * Core application class.
 */
public class App implements Runnable {
    Service service = null;

    public App() {
        service = new Service();
    }

    public void run() {
        System.out.println("Hello world from " + this.getClass().getName());
        System.out.println(service.getHello("App.run()"));
    }

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
}

package com.apa.multimodule.service;

/**
 * Hello world service.
 */
public class Service {
    public String getHello(String target) {
        return "Hello world from " + this.getClass().getName() + " to " + target;
    }

    public static void main(String[] args) {
        Service service = new Service();
        String hello = service.getHello("Service.main()");
        System.out.println(hello);
    }
}

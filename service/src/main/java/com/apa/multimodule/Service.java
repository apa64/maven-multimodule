package com.apa.multimodule;

/**
 * Hello world service.
 */
public class Service {
    public String getHello() {
        return "Hello world from Service!";
    }

    public static void main(String[] args) {
        Service service = new Service();
        String hello = service.getHello();
        System.out.println(hello);
    }
}

package com.ksk.async;

import java.util.Collections;
import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;

public class CompletableFutureTest {

    public static void main(String[] args) {
        OrderService service = new OrderService();
        for (int i = 0; i < 10; i++) {
        CompletableFuture.runAsync(service::getOrder)
                .thenApply(order -> enrichOrder(order))
            .thenAccept(order -> paymentOrder());
        }
        Collections.synchronizedList()
    }

    private static void paymentOrder() {
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("PaymentOrder");
    }

    private static Object enrichOrder(Void order) {
        System.out.println("enrichOrder");
        try {
            Thread.sleep(new Random().nextInt(2000));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return order;
    }


}

class OrderService {

    public static int id = 0;
    public Order getOrder() {
        System.out.println("getOrder");
        try {
            Thread.sleep(new Random().nextInt(100));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        id = id + 1;
        return new Order(id, "Test::" + id);
    }
}


class Order {
    private int id;
    private String name;

    public Order(int id, String name) {
        this.id = id;
        this.name = name;
    }
}


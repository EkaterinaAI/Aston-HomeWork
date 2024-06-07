package src.java.HW7;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        // Товары в магазине
        Map<String, Double> goods = new HashMap<>();
        goods.put("Potato", 52.5);
        goods.put("Carrot", 37.1);
        goods.put("Meat", 541.3);
        goods.put("Chicken", 356.9);
        goods.put("Bread", 45.7);
        goods.put("Milk", 97.4);

        // ScheduledExecutorService для периодического добавления покупателей
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);

        // ExecutorService для управления потоками покупателей
        ExecutorService buyerExecutorService = Executors.newCachedThreadPool();

        // Задание для ScheduledExecutorService, которое будет повторяться каждую секунду
        Runnable task = new Runnable() {
            private int buyerId = 1;

            @Override
            public void run() {
                // Рандомное число для количества покупателей (0-2)
                Random random = new Random();
                int randomBuyer = random.nextInt(3);
                System.out.println("В магазин в текущую секунду зашло " + randomBuyer + " покупателей");

                for (int i = 0; i < randomBuyer; i++) {
                    int currentBuyerId = buyerId++;
                    // Задание для ExecutorService, который будет распараллеливать покупателей по разным потокам
                    buyerExecutorService.submit(() -> {
                        Buyer buyer = new Buyer(currentBuyerId);
                        buyer.enterToMarket();
                        buyer.takeBasket();
                        buyer.chooseGoods(goods);
                        buyer.putGoodsToBasket();
                        buyer.goOut();
                    });
                }
            }
        };

        scheduledExecutorService.scheduleAtFixedRate(task, 0, 1, TimeUnit.SECONDS);

        // Завершение работы ScheduledExecutorService через 2 минуты (120 секунд)
        scheduledExecutorService.schedule(() -> {
            System.out.println("Прошло 2 минуты");
            scheduledExecutorService.shutdown();
            buyerExecutorService.shutdown();
        }, 120, TimeUnit.SECONDS);
    }
}
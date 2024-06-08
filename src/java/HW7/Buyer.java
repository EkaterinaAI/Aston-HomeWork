package src.java.HW7;


import java.util.*;

public class Buyer implements IBuyer, IUseBasket {

    private int id;
    private Map<String, Double> basket = new HashMap<>();

    public Buyer(int id) {
        this.id = id;
    }

    @Override
    public void enterToMarket() {
        System.out.println("Покупатель " + id + " вошел в супермаркет");
    }

    @Override
    public void chooseGoods(Map<String, Double> goods) {
        Random random = new Random();
        int numberOfGoods = random.nextInt(4) + 1; // От 1 до 4 товаров
        List<String> goodsList = new ArrayList<>(goods.keySet());

        for (int i = 0; i < numberOfGoods; i++) {
            String good = goodsList.get(random.nextInt(goodsList.size()));
            basket.put(good, goods.get(good));
            try {
                Thread.sleep(500 + random.nextInt(1500)); // Задержка от 0,5 до 2 секунд
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Покупатель " + id + " выбрал товар: " + good + " по цене " + goods.get(good));
        }
    }

    @Override
    public void goOut() {
        System.out.println("Покупатель " + id + " вышел из магазина");
    }

    @Override
    public void takeBasket() {
        System.out.println("Покупатель " + id + " взял корзину");
    }

    @Override
    public void putGoodsToBasket() {
        double result = 0.0;
        for (Map.Entry<String,Double> entry : basket.entrySet()) {
            result += entry.getValue();
        }
        System.out.println("Сумма покупок покупателя " + id + " составила " + result);
    }
}
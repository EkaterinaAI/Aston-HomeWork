package src.java.HW7;

import java.util.Map;

public interface IBuyer {

    public void enterToMarket(); //вошел в магазин мгновенно
    public void chooseGoods(Map<String, Double> goods); //выбрал товары (от 0,5 до 2 сек)
    public void goOut(); //отправился на выход мгновенно
}

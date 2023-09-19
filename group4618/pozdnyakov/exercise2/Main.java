package group4618.pozdnyakov.exercise2;

public class Main {
    public static void main(String[] args) {
        ShopToy shopToy = new ShopToy();
        shopToy.put(1, "Конструктор", 0.2);
        shopToy.put(2, "Робот", 0.2);
        shopToy.put(3, "Кукла", 0.6);
        shopToy.put(4, "Мяч", 0.3);
        shopToy.put(5, "Машинка", 0.4);
        shopToy.put(6, "Меч", 0.1);
        shopToy.put(1, "Конструктор", 0.2);
        shopToy.put(2, "Робот", 0.2);
        shopToy.put(3, "Кукла", 0.6);
        shopToy.put(4, "Мяч", 0.3);
        shopToy.put(5, "Машинка", 0.4);
        shopToy.put(6, "Меч", 0.1);

        System.out.println(shopToy.get());
        System.out.println(shopToy.get());
        System.out.println(shopToy.get());

    }

}

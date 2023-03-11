package Decarator;

public class main {

    public static void main(String[] args) {
        System.out.println("НАЧАЛО");

        Baking baking = new Cake();
        System.out.println("Вы заказали: " + baking.getDesc());
        System.out.println("Стоимость: " + baking.getPrice());

        System.out.println("--------------------------------------------------------------");

        baking = new Cream(baking);
        System.out.println("Вы заказали: " + baking.getDesc());
        System.out.println("Стоимость: " + baking.getPrice());

        System.out.println("--------------------------------------------------------------");

        baking = new Chocolad(baking);
        System.out.println("Вы заказали: " + baking.getDesc());
        System.out.println("Стоимость: " + baking.getPrice());

        System.out.println("КОНЕЦ");
    }

}

package Decarator;

public class Cake implements Baking {

    @Override
    public int getPrice() {
        return 100;
    }

    @Override
    public String getDesc() {
        return "Торт";
    }
}

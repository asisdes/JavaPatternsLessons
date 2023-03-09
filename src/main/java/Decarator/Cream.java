package Decarator;

public class Cream extends Goodies {

    public Cream(Baking baking) {
        super(baking);
    }

    @Override
    public int getPrice() {
        return baking.getPrice() + 15;
    }

    @Override
    public String getDesc() {
        return baking.getDesc() + " с кремом";
    }



}

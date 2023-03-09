package Decarator;

public class Chocolad extends Goodies {

    public Chocolad(Baking baking) {
        super(baking);
    }

    @Override
    public int getPrice() {
        return baking.getPrice() + 50;
    }

    @Override
    public String getDesc() {
        return baking.getDesc() + " с шоколадом";
    }
}

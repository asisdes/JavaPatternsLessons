package Decarator;

public abstract class Goodies implements Baking{

    Baking baking;

    public Goodies(Baking baking) {
        this.baking = baking;
    }
}



package entity.baseCake;

import strategy.CreamStrategy;

public class Cake {

    public CreamStrategy creamStrategy;

    public void addCakeLayer(int size) {
        System.out.println("Added default cake layers.");
    }

    public void addCream() {
        creamStrategy.addCream();
    }

    public void ready() {
        System.out.println("Your cake is ready!");
    }


}
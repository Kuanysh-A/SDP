package entity.creams;

import strategy.CreamStrategy;

public class CarrotCream implements CreamStrategy {

    @Override
    public void addCream() {
        System.out.println("Added carrot cream.");
    }
}

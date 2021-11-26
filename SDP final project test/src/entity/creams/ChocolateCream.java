package entity.creams;

import strategy.CreamStrategy;

public class ChocolateCream implements CreamStrategy {

    @Override
    public void addCream() {
        System.out.println("Added chocolate cream.");
    }
}

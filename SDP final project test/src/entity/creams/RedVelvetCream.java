package entity.creams;

import strategy.CreamStrategy;

public class RedVelvetCream implements CreamStrategy {

    @Override
    public void addCream() {
        System.out.println( "Added red velvet cream."); }
}

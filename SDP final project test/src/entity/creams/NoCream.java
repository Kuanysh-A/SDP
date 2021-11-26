package entity.creams;

import strategy.CreamStrategy;

public class NoCream implements CreamStrategy {

    @Override
    public void addCream() {
        System.out.println( "Biscuit doesn't need a cream."); }
}
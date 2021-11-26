package entity.creams;

import strategy.CreamStrategy;

public class CinnamonCream implements CreamStrategy {

    @Override
    public void addCream() {
        System.out.println("Added cinnamon cream.");; }
}

package entity.glaze;

import entity.baseCake.CakeGlaze;

public class NoGlaze implements CakeGlaze {

    @Override
    public void addGlaze() {
        System.out.println("No glaze was added.");
    }
}

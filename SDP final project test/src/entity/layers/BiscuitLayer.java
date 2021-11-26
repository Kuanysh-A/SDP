package entity.layers;

import entity.baseCake.CakeLayer;

public class BiscuitLayer implements CakeLayer {

    @Override
    public void addCakeLayer() {
        System.out.println("Added biscuit layer.");
    }
}

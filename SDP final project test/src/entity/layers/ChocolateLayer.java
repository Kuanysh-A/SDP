package entity.layers;

import entity.baseCake.CakeLayer;

public class ChocolateLayer implements CakeLayer {

    @Override
    public void addCakeLayer() {
        System.out.println("Added chocolate cake layers.");
    }
}

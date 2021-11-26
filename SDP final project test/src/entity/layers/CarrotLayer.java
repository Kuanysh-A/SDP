package entity.layers;

import entity.baseCake.CakeLayer;

public class CarrotLayer implements CakeLayer {

    @Override
    public void addCakeLayer() {
        System.out.println("Added carrot cake layers.");
    }
}

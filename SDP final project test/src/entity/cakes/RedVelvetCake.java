package entity.cakes;

import decorator.LargeCakeLayerDecorator;
import decorator.SmallCakeLayerDecorator;
import entity.baseCake.CakeLayer;
import entity.creams.RedVelvetCream;
import entity.layers.BiscuitLayer;
import entity.layers.RedVelvetLayer;
import strategy.CreamStrategy;
import entity.baseCake.Cake;

public class RedVelvetCake extends Cake {
    CakeLayer redVelvetCakeLayer;

    public RedVelvetCake() {
        this.creamStrategy = new RedVelvetCream();
    }

    public void addCakeLayer(int size) {
        switch (size) {
            case 1:
                redVelvetCakeLayer = new SmallCakeLayerDecorator(new RedVelvetLayer());
                break;
            case 2:
                redVelvetCakeLayer = new RedVelvetLayer();
                break;
            case 3:
                redVelvetCakeLayer = new LargeCakeLayerDecorator(new RedVelvetLayer());
                break;
        }
        redVelvetCakeLayer.addCakeLayer();
    }
}

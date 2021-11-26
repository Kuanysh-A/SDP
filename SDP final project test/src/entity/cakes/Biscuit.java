package entity.cakes;

import decorator.LargeCakeLayerDecorator;
import decorator.SmallCakeLayerDecorator;
import entity.baseCake.Cake;
import entity.baseCake.CakeLayer;
import entity.creams.NoCream;
import entity.layers.BiscuitLayer;
import strategy.CreamStrategy;

public class Biscuit extends Cake {
    CakeLayer biscuitLayer;

    public Biscuit() {
        this.creamStrategy = new NoCream();
    }

    public void addCakeLayer(int size) {
        switch (size) {
            case 1:
                biscuitLayer = new SmallCakeLayerDecorator(new BiscuitLayer());
                break;
            case 2:
                biscuitLayer = new BiscuitLayer();
                break;
            case 3:
                biscuitLayer = new LargeCakeLayerDecorator(new BiscuitLayer());
                break;
        }
        biscuitLayer.addCakeLayer();
    }
}

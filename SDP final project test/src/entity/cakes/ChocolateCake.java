package entity.cakes;

import decorator.LargeCakeLayerDecorator;
import decorator.SmallCakeLayerDecorator;
import entity.baseCake.CakeLayer;
import entity.creams.ChocolateCream;
import entity.creams.NoCream;
import entity.layers.BiscuitLayer;
import entity.layers.ChocolateLayer;
import strategy.CreamStrategy;
import entity.baseCake.Cake;

public class ChocolateCake extends Cake {
    CakeLayer chocolateCakeLayer;

    public ChocolateCake() {
        this.creamStrategy = new ChocolateCream();
    }

    public void addCakeLayer(int size) {
        switch (size) {
            case 1:
                chocolateCakeLayer = new SmallCakeLayerDecorator(new ChocolateLayer());
                break;
            case 2:
                chocolateCakeLayer = new ChocolateLayer();
                break;
            case 3:
                chocolateCakeLayer = new LargeCakeLayerDecorator(new ChocolateLayer());
                break;
        }
        chocolateCakeLayer.addCakeLayer();
    }
}

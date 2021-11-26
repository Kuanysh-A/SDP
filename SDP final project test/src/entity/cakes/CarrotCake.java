package entity.cakes;

import decorator.LargeCakeLayerDecorator;
import decorator.SmallCakeLayerDecorator;
import entity.baseCake.CakeLayer;
import entity.creams.CarrotCream;
import entity.creams.NoCream;
import entity.layers.BiscuitLayer;
import entity.layers.CarrotLayer;
import strategy.CreamStrategy;
import entity.baseCake.Cake;

public class CarrotCake extends Cake {
    CakeLayer carrotCakeLayer;

    public CarrotCake() {
        this.creamStrategy = new CarrotCream();
    }

    public void addCakeLayer(int size) {
        switch (size) {
            case 1:
                carrotCakeLayer = new SmallCakeLayerDecorator(new CarrotLayer());
                break;
            case 2:
                carrotCakeLayer = new CarrotLayer();
                break;
            case 3:
                carrotCakeLayer = new LargeCakeLayerDecorator(new CarrotLayer());
                break;
        }
        carrotCakeLayer.addCakeLayer();
    }
}

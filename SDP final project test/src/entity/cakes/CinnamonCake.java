package entity.cakes;

import decorator.LargeCakeLayerDecorator;
import decorator.SmallCakeLayerDecorator;
import entity.baseCake.CakeLayer;
import entity.creams.CinnamonCream;
import entity.creams.NoCream;
import entity.layers.BiscuitLayer;
import entity.layers.CinnamonLayer;
import strategy.CreamStrategy;
import entity.baseCake.Cake;

public class CinnamonCake extends Cake {
    CakeLayer cinnamonCakeLayer;

    public CinnamonCake() {
        this.creamStrategy = new CinnamonCream();
    }

    public void addCakeLayer(int size) {
        switch (size) {
            case 1:
                cinnamonCakeLayer = new SmallCakeLayerDecorator(new CinnamonLayer());
                break;
            case 2:
                cinnamonCakeLayer = new CinnamonLayer();
                break;
            case 3:
                cinnamonCakeLayer = new LargeCakeLayerDecorator(new CinnamonLayer());
                break;
        }
        cinnamonCakeLayer.addCakeLayer();
    }
}

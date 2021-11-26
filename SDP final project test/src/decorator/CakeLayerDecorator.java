package decorator;

import entity.baseCake.CakeLayer;

public abstract class CakeLayerDecorator implements CakeLayer {

    protected CakeLayer sizedCakeLayer;

    public CakeLayerDecorator (CakeLayer sizedCakeLayer) {
        this.sizedCakeLayer = sizedCakeLayer;
    }

    public void addCakeLayer(){
        sizedCakeLayer.addCakeLayer();
    }
}

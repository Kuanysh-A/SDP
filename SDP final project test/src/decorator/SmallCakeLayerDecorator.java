package decorator;

import entity.baseCake.CakeLayer;

public class SmallCakeLayerDecorator extends CakeLayerDecorator{

    public SmallCakeLayerDecorator(CakeLayer sizedCakeLayer) {
        super(sizedCakeLayer);
    }

    @Override
    public void addCakeLayer() {
        sizedCakeLayer.addCakeLayer();
        setSizeSmall(sizedCakeLayer);
    }

    private void setSizeSmall(CakeLayer sizedCakeLayer) {
        System.out.println("Size: small");
    }
}

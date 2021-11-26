package decorator;

import entity.baseCake.CakeLayer;

public class LargeCakeLayerDecorator extends CakeLayerDecorator{

    public LargeCakeLayerDecorator(CakeLayer sizedCakeLayer) {
        super(sizedCakeLayer);
    }

    @Override
    public void addCakeLayer() {
        sizedCakeLayer.addCakeLayer();
        setSizeLarge(sizedCakeLayer);
    }

    private void setSizeLarge(CakeLayer sizedCakeLayer) {
        System.out.println("Size: large");
    }
}

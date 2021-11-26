package facade;

import entity.baseCake.Cake;
import entity.baseCake.CakeGlaze;
import entity.cakes.*;
import factory.GlazeFactory;

public class CakeMaker {

    GlazeFactory glazeFactory = new GlazeFactory();

    private Cake biscuit;
    private Cake carrotCake;
    private Cake chocolateCake;
    private Cake cinnamonCake;
    private Cake redVelvetCake;

    public CakeMaker() {
        biscuit = new Biscuit();
        carrotCake = new CarrotCake();
        chocolateCake = new ChocolateCake();
        cinnamonCake = new CinnamonCake();
        redVelvetCake = new RedVelvetCake();
    }

    public void makeBiscuit(int size, int glaze) {
        biscuit.addCakeLayer(size);
        biscuit.addCream();
        CakeGlaze glaze1 = glazeFactory.getGlaze(glaze);
        glaze1.addGlaze();
        biscuit.ready();
    }

    public void makeCarrotCake(int size, int glaze) {
        carrotCake.addCakeLayer(size);
        carrotCake.addCream();
        CakeGlaze glaze1 = glazeFactory.getGlaze(glaze);
        glaze1.addGlaze();
        carrotCake.ready();
    }

    public void makeChocolateCake(int size, int glaze) {
        chocolateCake.addCakeLayer(size);
        chocolateCake.addCream();
        CakeGlaze glaze1 = glazeFactory.getGlaze(glaze);
        glaze1.addGlaze();
        chocolateCake.ready();
    }

    public void makeCinnamonCake(int size, int glaze) {
        cinnamonCake.addCakeLayer(size);
        cinnamonCake.addCream();
        CakeGlaze glaze1 = glazeFactory.getGlaze(glaze);
        glaze1.addGlaze();
        cinnamonCake.ready();
    }

    public void makeRedVelvetCake(int size, int glaze) {
        redVelvetCake.addCakeLayer(size);
        redVelvetCake.addCream();
        CakeGlaze glaze1 = glazeFactory.getGlaze(glaze);
        glaze1.addGlaze();
        redVelvetCake.ready();
    }


}

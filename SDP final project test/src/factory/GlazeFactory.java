package factory;

import entity.baseCake.CakeGlaze;
import entity.glaze.*;

public class GlazeFactory {

    public CakeGlaze getGlaze(int glaze) {
        switch(glaze) {
            case 1:
                return new NoGlaze();
            case 2:
                return new CarrotGlaze();
            case 3:
                return new ChocolateGlaze();
            case 4:
                return new CinnamonGlaze();
            case 5:
                return new RedVelvetGlaze();
        }
        return null;
    }
}

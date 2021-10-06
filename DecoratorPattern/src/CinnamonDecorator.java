public class CinnamonDecorator extends FlavourDecorator{
    public CinnamonDecorator(Coffee coffee){
        super(coffee, "adding cinnamon ", 0.3);
    }
}

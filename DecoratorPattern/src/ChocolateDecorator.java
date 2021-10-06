public class ChocolateDecorator extends FlavourDecorator{
    public ChocolateDecorator(Coffee coffee){
        super(coffee, "adding chocolate ", 1.5);
    }
}

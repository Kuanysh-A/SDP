public class FlavourDecorator implements Coffee{
    private Coffee coffee;
    private String Description;
    private double Price;

    public FlavourDecorator(Coffee coffee, String Description, double Price){
        this.coffee = coffee;
        this.Description = Description;
        this.Price = Price;
    }
    public String getDescription(){
        return coffee.getDescription()+this.Description;
    }
    public double getPrice(){
        return coffee.getPrice()+this.Price;
    }
}

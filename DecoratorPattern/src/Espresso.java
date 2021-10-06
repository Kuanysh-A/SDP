public class Espresso implements Coffee{
    private String Description;
    private double Price;

    public Espresso (String Description, double Price){
        this.Description = Description;
        this.Price = Price;
    }
    public String getDescription(){
        return this.Description;
    }
    public double getPrice(){
        return this.Price;
    }
}

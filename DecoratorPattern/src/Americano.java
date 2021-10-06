public class Americano implements Coffee{
    private String Description;
    private double Price;

    public Americano(String Description, double Price){
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

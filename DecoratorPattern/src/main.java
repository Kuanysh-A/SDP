public class main {
    public static void main(String[] args) {
        Espresso espresso = new Espresso("Espresso ", 8);
        ChocolateDecorator EspressoWithChocolate = new ChocolateDecorator(espresso);
        System.out.println(EspressoWithChocolate.getDescription()+" cost "+EspressoWithChocolate.getPrice());

        Americano americano = new Americano("Americano ", 12);
        ChocolateDecorator americanoWithChocolate = new ChocolateDecorator(americano);
        System.out.println(americanoWithChocolate.getDescription()+"cost "+ americanoWithChocolate.getPrice());
        
        Cappuccino cappuccino = new Cappuccino("Cappuccino ", 9.5);
        CinnamonDecorator CappuccinoWithCinnamon = new CinnamonDecorator(cappuccino);
        SyrupDecorator CappuccinoWithCannamonAndSyrup = new SyrupDecorator(CappuccinoWithCinnamon);
        System.out.println(CappuccinoWithCannamonAndSyrup.getDescription()+"cost "+ CappuccinoWithCannamonAndSyrup.getPrice());

    }
}

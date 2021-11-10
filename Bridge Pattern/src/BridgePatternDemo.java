public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100, new RedCircle());
        Shape greenCircle = new Circle(50, new BlueCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
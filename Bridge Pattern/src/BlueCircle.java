public class BlueCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius) {
        System.out.println("Drawing Circle[ color: blue, radius: " + radius + "]");
    }
}
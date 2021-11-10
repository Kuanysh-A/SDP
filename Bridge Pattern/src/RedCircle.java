public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + "]");
    }
}
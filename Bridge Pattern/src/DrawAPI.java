public interface DrawAPI {                //This interface is a Bridge. It is used to create objects of abstract
    public void drawCircle(int radius);   //class Shape. This makes concrete classes RedCircle and BlueCircle independent
}                                         //from an abstract class Shape.
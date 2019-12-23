import java.util.*;
public class Box {
    double w,h,d;

     Box(double width,double height,double depth)
    {
        h=height;
        w=width;
        d=depth;
    }
    double volume()
    { 
     double v;
    v=h*w*d;
    return v;
    }
   
    public static void main(String[] args) {
       
    Box bx= new Box(20.8,45.2,98.5);
    System.out.println(bx.volume());

    }

}

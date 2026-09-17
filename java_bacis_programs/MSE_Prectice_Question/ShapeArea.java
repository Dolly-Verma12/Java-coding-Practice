import java.util.Scanner;

class AreaCalc{
    void area(double r,char ch){
    System.out.print("Area of circle is: "+2*Math.PI*r);
    }
    void area(double len , double wid){
        System.out.println("Area of rectangle: "+(len*wid));
    }
    void area(double side){
System.out.println("Area of Square: "+side*side);
    }
}
public class ShapeArea {
    public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    String nm= s.next();
    AreaCalc ar=new AreaCalc();
    if(nm.equals("SQUARE")){
    double side=s.nextDouble();
    ar.area(side);
    }
    else if(nm.equals("CIRCLE")){
        double r=s.nextDouble();
        ar.area(r,'e');
    }
    else if(nm.equals("RECTANGLE")){
        double ln=s.nextDouble();
        double wid=s.nextDouble();
        ar.area(ln, wid);
    }else {
        System.out.println("invalid choice!!");
        return;
    }
    s.close();
  
}
}

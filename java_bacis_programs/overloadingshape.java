class Shape{
    void draw(){
        System.out.println("draww!!");
    }
}
class Circle extends Shape{
    void draw(){
System.out.println("Circle!!");
    }
}
class Rectangle extends Shape{
    void draw(){
System.out.println("Rectangle!!");
    }
}
class Triangle extends Shape{
    void draw(){
System.out.println("Triangle!!");
    }
}
public class overloadingshape {
    public static void main(String[] args){
     Shape s=new Circle();
     s.draw();
    }
}

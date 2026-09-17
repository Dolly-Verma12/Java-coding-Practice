import java.util.Scanner;

abstract class Animal{
    abstract void makeSound();
}
class Dog extends Animal{
    void makeSound(){
        System.out.println("Bark!!");
    }
}
class Cat extends Animal{
    void makeSound(){
        System.out.println("Meow");
    }
}
class Cow extends Animal{
    void makeSound(){
        System.out.println("Moo");
    }
}
public class AnimalSound {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
         String nm=s.next();
        Animal a;
       
        if(nm.equals("Cat")){
            a=new Cat();
        }else if(nm.equals("Dog")){
            a=new Dog();    
            }
         else if(nm.equals("Cow")){
         a=new Cow();
         }else{
            System.out.println("invalid choice!!");
            return;
         }
         a.makeSound();
         s.close();
    }
  
}

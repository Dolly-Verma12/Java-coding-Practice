    abstract class Animal{
        abstract void sound();
        void eat(){
         System.out.println("THis animal eat food!!");
        }   
    }
   class Dog extends Animal{
    void sound(){
        System.out.println("Dog Bark");
    }
}
public class abstactclass {
    public static void main(String[] args){
  Animal a =new Dog();
  a.sound();
  a.eat();
    }
}

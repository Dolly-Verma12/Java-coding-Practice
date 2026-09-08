class Animal{
   
    void name(){
        System.out.println("Class Animal");
    }
}
class Dog extends Animal{
     @Override 
    void name(){
        System.out.println("class Dog");
    }
}

public class Ovrrideanimal {
    public static void main(String[] args){
  Animal a= new Dog();
  a.name();  
    }
}

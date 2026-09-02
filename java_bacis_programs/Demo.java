
class Animal{
void show(){
System.out.println("This is Animal Class");
}
}

class Dog extends Animal{
void bark(){
System.out.println("Dog is Barking");
}
}

class Cat extends Animal{
void meow(){
System.out.println(" Cat Class");
}
}

class Puppy extends Dog{
void cry(){
System.out.println("Puppy is Crying");
}
}

public class Demo{

void main(String[] args){

Puppy p=new Puppy();
p.cry();
p.show();
p.bark();
}
}
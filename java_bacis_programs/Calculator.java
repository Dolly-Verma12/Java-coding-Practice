public class Calculator{

void add(int a, int b){
System.out.print("Addition is:"+a+b);
}


int mul(int a, int b){
return a*b;
//System.out.print(" \nMultipilication is:"+a*b);
}


public static void main(String[] args){
  Calculator c= new Calculator();
c.add(1,2);
System.out.print("");
System.out.print(" \nMultipilication is:"+c.mul(1,2));

}
}



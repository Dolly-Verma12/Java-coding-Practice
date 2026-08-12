public class SwapWithoutUsingVal{
public static void main(String[] args){
int a=10;
int b=20;
System.out.println("Before  Swap: "+a+" "+b);
 a=(a+b)-a;
 b=(a+b)-b;

System.out.print("After Swap: "+a+" "+b);
}
}
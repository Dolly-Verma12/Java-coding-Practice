public class SwapUsingTemp{
public static void main(String[] args){
int a=10;
int b=20;
System.out.println("Before  Swap: "+a+" "+b);
int temp=a;
 a=b;
 b=temp;

System.out.print("After Swap: "+a+" "+b);
}
}
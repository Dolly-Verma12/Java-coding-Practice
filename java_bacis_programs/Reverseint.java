public class Reverseint{
public static void main(String[] args){
int num=123;
int rev=0;
while(0<num){
int rem=num%10;
rev=rev*10+rem;
num=num/10;
}
System.out.print("Reverse of a number: "+rev);
}
}


import java.util.Scanner;
class Device{
    String brandname;
}
class SmartBulb extends Device{
    int waltage;
    SmartBulb(String nm,int n){
        brandname=nm;
        waltage=n;
    }
     void printCon(){
        System.out.println(brandname);
        System.out.println(waltage + "W");
     }
}
public class SimpleDevice {
    public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    SmartBulb b=new SmartBulb("tl", 10);
    b.printCon();
    }
}

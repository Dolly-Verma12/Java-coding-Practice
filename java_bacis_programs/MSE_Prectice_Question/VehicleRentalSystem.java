import java.util.Scanner;
abstract class Vehicle{
abstract void rentPricePerDay();
}
class Car extends Vehicle{
    int day;
    Car(int day){
        this.day=day;
    }
    void rentPricePerDay(){
    System.out.println(day*1500);
 }
}
public class VehicleRentalSystem{
public static void main(String[] args){
    Scanner s =new Scanner(System.in);
    int day=s.nextInt();
    Vehicle vh=new Car(day);
    vh.rentPricePerDay();
    s.close();
}

}
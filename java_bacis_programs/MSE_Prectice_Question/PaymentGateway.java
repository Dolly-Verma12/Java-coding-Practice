 interface InnerPaymentGateway {
void  calculateDis();   
}
class StdDis implements InnerPaymentGateway{
      int tt;
    StdDis(int p){
        tt=p;
    }
  public   void  calculateDis( ){
    System.out.println(tt);
    System.out.println("Discount:"+(tt-(tt*10)/100));
    }
}
public class PaymentGateway {
    public static void main(String[] args){
     InnerPaymentGateway ar=new StdDis(1000);
     ar.calculateDis();
       
    }
    
}

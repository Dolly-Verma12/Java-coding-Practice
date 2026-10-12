public class Program2 {
    public static void main(String[] args){
        try{
            try{
                int num=30/0;
                System.out.println(num);
            }catch(ArithmeticException a){
                System.out.println("Error"+a);
            }
            try{
                int arr[]=new int[5];
                arr[6]=20;

            }catch(ArrayIndexOutOfBoundsException a){
                System.out.println("Error"+a);
            }
            System.out.println(" \nTHis is my exception handling");
        }catch(Exception e){
            System.out.println("error"+e);
        }
    }
}

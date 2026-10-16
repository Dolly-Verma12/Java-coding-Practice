public class NestedTry {
    public static void main(String[] args){
        try{
        int arr[]={12,34,4,56};
        System.out.println(arr[9]);
        try{
            int num=45/0;
            System.out.println(num);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic error..");
        }
        }
         catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index error..");
        }
        
    }
}

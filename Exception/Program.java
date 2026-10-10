public class Program{
    public static void main(String[] args){
        try{
            int []Arr =new int[5];
            Arr[6]=30/0;

        }
       catch(Exception e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println(a);
        } catch(ArithmeticException Air){
            System.out.println(Air);
        } 
    }
}
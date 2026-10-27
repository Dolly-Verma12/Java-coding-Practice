package Multi_threading;

class A extends  Thread{
    public void run(){
        for(int i=0;i<=5;i++){
        System.out.print(i);
        }
        System.out.println("-----------------");
    }
}
class B extends Thread{
    public void run(){
        for(int i=0;i<=5;i++){

     System.out.println(i);
        }
    }
}

public class index {
     public static void main(String[] args){
        new A().start();
        new B().start();
     }
}

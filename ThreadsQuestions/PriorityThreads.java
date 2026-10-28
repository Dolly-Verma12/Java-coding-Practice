package ThreadsQuestions;

class ThreadClass extends Thread{
     public void run(){
        for (int i=0;i<=5;i++){
            System.out.println(
                Thread.currentThread().getName()+":"+i
            );
            Thread.yield();
        }
     }
}


public class PriorityThreads {
     
 public static void main(String[] args) {
    ThreadClass t1=new ThreadClass();
    ThreadClass t2=new ThreadClass();
    //    t1.setPriority(10);
    //    t2.setPriority(4);
       t1.start();
       t2.start();

 }

}

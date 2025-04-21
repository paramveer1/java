package Thread;

public class ThreadDemo extends Thread {
   public void run(){
    System.out.println("Thread Task");

    }

    

    public static void main(String[] args) {
        ThreadDemo td = new ThreadDemo();
        td.start();


        
    }
    
}

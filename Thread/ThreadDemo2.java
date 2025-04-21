package Thread;

public class ThreadDemo2 implements Runnable {
    public void run(){
        System.out.println("Thread Task");
    }
    public static void main(String[] args) {
        ThreadDemo2 td = new ThreadDemo2();
        ThreadDemo2 td2 = new ThreadDemo2();

        // Thread th = new Thread(td);
        // th.start();
        // Thread th2 = new Thread(td2);
        // th2.start();
        td.run();
    }
    
}

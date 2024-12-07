public class ThreadTest implements Runnable{
    public void run(){
        System.out.println("Thread Task Welcomes you");
    }
    public static void main(String[] args) {
        ThreadTest test = new ThreadTest();
        Thread t = new Thread(test);
        t.start();
        
    }
    
}

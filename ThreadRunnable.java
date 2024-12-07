public class ThreadRunnable  implements Runnable {
    public void run(){
        System.out.println("Thread Task");
    }
    public static void main(String[] args) {
        ThreadRunnable tr = new ThreadRunnable();
        Thread th = new Thread(tr);
        th.start();
    }

    
}

package Thread;

class Thread1 extends Thread{
    public void run(){
        System.out.println("Thread 1 task");
    }

}

class Thread2 extends Thread{
    public void run(){
        System.out.println("Thread 2 task");
    }

}

class Thread3 extends Thread{
    public void run(){
        System.out.println("Thread 3 task");
    }

}

public class MulThrMulTask {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        t1.start();

        
        Thread3 t3 = new Thread3();
        t3.start();

        Thread2 t2 = new Thread2();
        t2.start();

        
        Thread3 t4 = new Thread3();
        t4.start();

    }
    
}

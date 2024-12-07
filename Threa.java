public class Threa extends Thread {

    public void run(){
        System.out.println("Thread Task");
    }
    public static void main(String[] args) {
        Threa th = new Threa();
        th.start();
        
    }
    
}

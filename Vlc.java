class PlayMusic extends Thread{
    public void run(){
        System.out.println("Play Music");
    }
}

class PlayVideo extends Thread{
    public void run(){
        System.out.println("Play Video");
    }
}

class ProgressBar extends Thread {
    public void run(){
        System.out.println("Run Progress bar");
    }
}
    public class Vlc {
        public static void main(String[] args) {
            PlayMusic t1 = new PlayMusic();
            t1.start();
            PlayVideo  t2 = new PlayVideo();
            t2.start();
            ProgressBar t3 = new ProgressBar();
            t3.start();


        }



    
}

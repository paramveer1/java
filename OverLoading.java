public class OverLoading {

    void show(short a ){
        System.out.println("short method");
    }

    void show (byte a){
        System.out.println("Byte method");
    }

    public static void main(String[] args) {
        OverLoading a = new OverLoading();
        a.show(88);
       
    }
        

    }
    


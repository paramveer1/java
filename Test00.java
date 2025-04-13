abstract class Bank{
    abstract void  openAccount();
    abstract void closeAccount();
}

class Sbi extends Bank{
    void openAccount(){
        System.out.println("Account opened ");
    }
    void closeAccount(){
        System.out.println("Acct closed");
    }

}

public class Test00 {
    public static void main(String[] args) {
        Sbi s = new Sbi();
        s.openAccount();
        s.closeAccount();
    
}
    
}

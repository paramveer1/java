class Parent {
    int money = 100000;
    int business (){
        int i =8;
        System.out.println("Trasnsport business" );
        return 5;

    }
}



public class Son extends Parent {
    public static void main(String[] args) {
        Son s = new Son();
        // ;
        System.out.println(s.business());
    }
    
}

public class OverLoading0 {

    void m(){
        System.out.println("No argument");
    }

    void m(int a ){
        System.out.println(" Int arg");
    }

    void m(float a){
        System.out.println("Float arg");
    }

    public static void main(String[] args) {
        OverLoading0 o = new OverLoading0();
        o.m();
        
        o.m(4.6f);
        o.m(5);
        
    }
    
}

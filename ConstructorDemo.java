public class ConstructorDemo {

    ConstructorDemo( ){
        System.out.println("param");

    }



    void show(){
        this();
    }
    int a ;
    public static void main(String[] args) {
        ConstructorDemo cd = new ConstructorDemo( );
        System.out.println(cd.a);
    }
    
}

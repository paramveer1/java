

class A{
    int a = 10;
    void showA(){
        System.out.println("A class method");
    }

}

class B extends A{
    void showB(){
        System.out.println("Class B method");
    }
}

public class Main extends B {
    public static void main(String[] args) {
       
        showB();
    }
    
}
interface I{
    void show();
}

interface I2{
    void display();
}



public class InterfaceA implements I,I2 {
    public void show(){
        System.out.println(" I method");

    }

    public void display(){
        System.out.println(" I2 method");
    }

    public static void main(String[] args) {
        InterfaceA i = new InterfaceA();
        i.show();
        i.display();
        
    }
    
}

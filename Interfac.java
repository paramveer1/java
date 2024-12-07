
interface I{
   void show();
    
}

interface I2{
    void show();
}
class Interfac implements I,I2{
public void show(){
    System.out.println("Param");

}
public void display(){
    System.out.println("2");
}


public static void main(String[] args) {
    Interfac i = new Interfac();
    i.show();
    i.display();
}

}
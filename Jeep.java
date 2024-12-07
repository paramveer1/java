interface Vehicle{
    void starts();
}
interface I{
    void show();
}




public class Jeep implements Vehicle,I {
    public void starts(){
        System.out.println("Car starts with Key");
    }
    public void show(){
        System.out.println("Hi");
    }
    public static void main(String[] args) {
        
            Jeep i = new Jeep();
            i.starts();
            i.show();

        
    }
    
}

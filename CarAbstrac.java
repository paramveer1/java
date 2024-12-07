 class CarAbstrac extends Vehicle{
    void start(){
        System.out.println("Car starts with key");
        
    }

    
    public static void main(String[] args) {
        CarAbstrac c = new CarAbstrac();
        c.start();
        Scooter s = new Scooter();
        s.start();        

    }
    
}

class Scooter extends Vehicle{
    void start(){
        System.out.println("Starts with kick");
    }

}




 abstract class Vehicle {
    int tyres;
     abstract void start();
        
}
 
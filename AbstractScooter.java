abstract class Vehicle{
    abstract void start();
}

class Car extends Vehicle{
    void start(){
        System.out.println(" Car starts with Key");

    }



}



public class AbstractScooter extends Vehicle{
  void start(){
    System.out.println(" Scooter starts with kick");
  }

  public static void main(String[] args) {

    Car c = new Car();
    c.start();

    AbstractScooter a = new AbstractScooter();
    a.start();
    
  }
    
}

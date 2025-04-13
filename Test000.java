class Car{
    void move(){
        System.out.println("Car is moving");
    }
    void brake(){
        System.out.println("Brake applieed");
    }
}

class Audi extends Car{
    void autoPilot(){
        System.out.println("car has auto pilot System");
    }

    void autogear(){
        System.out.println(" car has autogear");
    }

}





public class Test000 {
    public static void main(String[] args) {

        Audi a = new Audi();
        a.autoPilot();
        a.autogear();
        a.brake();
        a.move();
        
    }
}

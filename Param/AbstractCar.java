

package Param;
abstract class Vehicle{
    int noOfTyres;


    abstract  void starts();
}





public class AbstractCar extends Vehicle {
void starts(){
    System.out.println("car starts with key");
}
public static void main(String[] args) {

AbstractCar ac = new AbstractCar();
ac.starts();

System.out.println();
    
}
}
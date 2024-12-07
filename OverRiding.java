 class A {
    void show(){
        System.out.println("Parent class");
    }
 }
 public class OverRiding  extends A {
   public static void main(String[] args) {
   OverRiding a = new OverRiding();
   a.show();

    
   }
   void show (){
    super.show();
    System.out.println("You are in child class");
   }
    
}

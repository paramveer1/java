
class A{
     void a(){
        System.out.println(" parnt clss mthod");
    }
  
}



public class MainMethodHiding extends A {

     void a(){
        System .out.println("child clss mthod");
    }
    public static void main(String[] args) {
        A ref = new MainMethodHiding();
        ref.a();
        
    }
    
}

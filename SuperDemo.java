
class A{
    int a = 10;
    void mo(){
        System.out.println("Prnt mo  method");
    }

}





public class SuperDemo extends A {
    int a= 4;


    void mo(){
       System.out.println(" child class mo ");
  
    }

    void m(){
        // System.out.println("u in M");
       super. mo();
    }
    public static void main(String [] args){
        // System.out.println("jf");
        SuperDemo sd = new SuperDemo();
        sd.m();
        
        
    }
    
}

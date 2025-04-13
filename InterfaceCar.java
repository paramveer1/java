interface I{
//    int a = 5;
 void  starts();
}

 interface I1{
    int a= 555;
    void starts();

    
}





public class InterfaceCar implements I1,I{

     public void starts(){
        System.out.println("car starts with key");
    }
    public static void main(String[] args) {

        InterfaceCar ic = new InterfaceCar();
        // ic.starts();
       System.out.println( a);
        
    }
    
}

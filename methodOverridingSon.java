class Parent{

  void property(){
    System.out.println("House in Village");

  }


}




public class methodOverridingSon extends Parent {
  void property(){
    System.out.println(" House in Village + House in City ");
   }

   
  public static void main(String[] args) {

    Parent p = new Parent();
     p.property();

     methodOverridingSon s = new methodOverridingSon();
     s.property();






  
   
  
  }
}
 
   
    

  

     
  

    
    

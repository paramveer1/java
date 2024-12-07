import java.io.*;
public class NullPointEx {

     public static void main(String[] args) {
          String a = null;
            System.out.println("before");
try{
       System.out.println( a.length());
       System.out.println("After");

}
      catch(Exception f)
      { 
        System.out.println("param");
      } 
           
            System.out.println("okkkkk");
        
     }
}
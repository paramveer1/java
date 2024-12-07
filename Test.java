public class Test extends Xyz {
    int a =10;
   
    
    
    void show2(){
        System.out.println("hiiiii");
    }
    

    
public static void main(String[] args) {
    
    Test t = new Test();
    t.show();
    Xyz x = new Xyz();
    x.show();
    // x.show();
    
    
  
}




    
}
class Xyz{
    
   
    void show (){
        System.out.println("you are in show method of xyz class");
        
    }

}


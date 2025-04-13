class Father{
static int ii =10;
    void property(){
        System.out.println("purana ghar");
    }
}
public class InheritanceSon extends Father {
     void play(){
        System.out.println("cricket");

     }


    public static void main(String[] args) {

        // InheritanceSon i = new InheritanceSon();
        InheritanceSon i = new InheritanceSon();
        // i.property();
        
        i.play();
        


        
    }
    
}

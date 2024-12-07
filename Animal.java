public class Animal {

    String  name = "Param";
    String color;
    int age = 5;
    void initObj(){
        name = "";
        color = c;
        age = ag;
        System.out.println(name+ " " +color + " "+age);
        
    }
    void show(String n,String c, int a){
        // System.out.println(String n + " " + String c+" "+  int a);
        name = n;
        // color = c;
        // age = a;
        
        
        // System.out.println(name);
    }
    void sho(){
        System.out.println(name);
    }
    public static void main(String[] args) {
        Animal a = new Animal();
        a.show("dog","Red",5);
        a.sho();

       Animal b = new Animal();
      
         b.sho ();
    }

    
}

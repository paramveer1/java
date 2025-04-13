package param2;
public class Animal0 {

    void eat(){
        
        System.out.println("I am Eating");
    }
}

class  Cat  {

    void eat(){
        System.out.println("She am Eating");
    }

    
    public static void main(String[] args) {

        
       
        Cat ani = new Cat();
        System.out.println(ani instanceof Cat);
        ani.eat();
        
    }
}

public class Demo {

    static int a = 5;

     void s(){
        System.out.println("okkkkk");
    }
    void b(){

        s();
    }
    public static void main(String[] args) {
        // System.out.println(a);
      Demo d = new Demo();
      d.b();
        
    }
    
}

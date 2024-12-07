class Test {
    int a ;
    

    void setValue(int a ){
        this.a = a;
    }
      int show (){
       return a;
     }
    
  

}
public class This {
    public static void main(String[] args) {
        int a = 6;
        Test t = new Test();
        Test u = new Test();
        t.setValue(12);
        System.out.println(u.show());
        
    }
    
}

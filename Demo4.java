public class Demo4 {
    int a = 8;
    void a(){
        System.out.println(this.a);
    }
    public static void main(String[] args) {
        Demo4 d = new Demo4();
        d.a=1;
       d.a();
       Demo4 e = new Demo4();
       e.a();
       
    }
    
}

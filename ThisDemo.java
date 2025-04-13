public class ThisDemo {

 int i ;
    void show(){
System.out.println(i);
    }
    ThisDemo(){
        this(2);
        System.out.println(" Non Paramter cons");
    }

    ThisDemo(int a){
        // this();
        System.out.println("Paramter cons");
    }
    public static void main(String[] args) {
        ThisDemo td = new ThisDemo();
        // td.show();

    }
    
}

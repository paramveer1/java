class Test{
    Test(Thi th){
        System.out.println("Test class Constructor");
    }
}
public class Thi{

    void m1(){
        Test t = new Test(this);


        

    }
    public static void main(String[] args) {
        Thi th = new Thi();
        th.m1();
    }
}
 @FunctionalInterface
 interface I{
    void m();
    // void m2;


}

// class C implements I
// {
//     public void m()
//     {
//         System.out.println("you are in m method ");
//     }
// }


public class InterfaceEx  {

    // public void m()
    // {
    //     System.out.println("welcome");

    // }
    public static void main(String[] args) {
        // System.out.println("paaaaaaaaaaaaaaaaaaaaaaaaaa");
        // C c = new C();
        // c.m();

        // I ii = new I() {
        //    public  void m()
        //     {
        //         System.out.println("you are in mmethod");
        //     }
        // };

        // ii.m();

        I ii = () -> System.out.println("you are in mmm method");
        ii.m();
    }
}


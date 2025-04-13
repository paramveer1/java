class Test{
    void m(){
        System.out.println("Test class method");
    }
}
class OverRidingXyz extends Test{
    void m(){
        System.out.println("Child class method");
    }

    public static void main(String[] args) {
        // Test t = new Test();
        // t.m();
        OverRidingXyz o = new OverRidingXyz();
        o.m();


        
    }
}
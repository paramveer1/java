public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        int a = 88;
        int b = 555;
        a= a+b;
        b=a-b;
        a= a-b;
        System.out.println(a);
        System.out.println(b);
    }
    
}

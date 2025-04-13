public class Fibonacci1 {
    public static void main(String[] args) {
        System.out.print("0 1");
        int a = 0;
        int b = 1;
        
        for(int i = 1 ; i<9;i++){
            int c = a+b;
            System.out.print(" "+c);
        a = b;
        b=c;
        }
        

    }
    
}

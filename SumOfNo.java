public class SumOfNo {
    public static void main(String[] args) {
        int a = 14875;
        int sum =0;
        while(a>0){
            int r = a%10;
            sum = sum + r;

            a=a/10;
        }
        System.out.println(sum);

    }
    
}

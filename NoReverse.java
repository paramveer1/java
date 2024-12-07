public class NoReverse {
    public static void main(String [] args){
        int a = 123456789;
        int rev=0;
       while(a!=0){
       int r =  a%10;
       rev = rev*10 + r;
       a=a/10;

       }
       System.out.println(rev);
    }
}

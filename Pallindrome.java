public class Pallindrome {
    
    public static void main(String[] args) {
        int n = 1234321;
        int temp = n;
        int rev = 0;
        while (n>0) {
            int r = n%10;
            rev = rev*10+r;
            n = n/10;
            
            
        }
        System.out.println(rev);
        if(temp==rev){
            System.out.println(temp + " is Pallindrome");
        }
        else{
            System.out.println(temp + " is not Pallindrome");
        }
    }
    
}

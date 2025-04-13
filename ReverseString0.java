import java.util.Scanner;
public class ReverseString0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuffer sb = new StringBuffer(s);
        
        System.out.println(sb.reverse());


    }

    
    
}

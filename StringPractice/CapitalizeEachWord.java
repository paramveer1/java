package StringPractice;
import java.util.Scanner;

public class CapitalizeEachWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String []words = s.split(" ");
        String result = "";
        for(int i = 0;i<= words.length-1;i++)
        {
            String first = words[i].substring(0,1).toUpperCase();
            String last = words[i].substring(1);
            String full = first + last;
            result = result+full+" ";

           
        }
        System.out.print(result+" ");
        
    }
    
}

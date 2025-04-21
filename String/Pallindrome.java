package String;

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        String s2="";
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i = s.length()-1;i>=0;i--){
            s2=s2+s.charAt(i);



        }
        System.out.println(s);
        System.out.println(s2);
        if(s.equals(s2)){
            System.out.println("pallindrome ");
        }
        else 
        {
            System.out.println("not pallindrome");
        }
    }
    
}

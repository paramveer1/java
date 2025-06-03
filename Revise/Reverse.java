package Revise;

import java.util.Scanner;

public class Reverse
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  s  = sc.nextLine();
        String rev = "";
        for(int i = s.length()-1;i>=0;i--)
        {
            rev = rev + s.charAt(i);
        }
        // System.out.print(rev);
        if(rev.equals(s))
        {
            System.out.println("Pallindrome String");
        }
        else{
            System.out.println("Not Pallindrome");
        }

        

    }

}
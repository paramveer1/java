package String;

import java.util.Scanner;

public class CapitalizeWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String [] words =  s.split(" ");
      for(String i: words){
        System.out.print(i.substring(0,1).toUpperCase()+i.substring(1 )+" ");
      }
       
        

    }
    
}

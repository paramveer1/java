package String;

import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        String s = "paramveejhkjhuhkir singhjkbkgjhgj rajawajlkjlk,mkl,nk,t";
        // Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine();
        String [] words = s.split(" ");
        int len1 = words[0].length();
        int len2 = words[1].length();
        int len3 = words[2].length();

        if(len2<len1 && len1>len3){
            System.out.println(words[0] + " is greater");

        }


else if(len2>len1 && len2>len3){
    System.out.println(words[1] + " is grester");
    
}

else{
    System.out.println(words[2]+ " is grester");
}



    }
    
}

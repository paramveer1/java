package StringPractice;
import java.util.Scanner;
public class NoOfVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st sentence");
       String s =  sc.nextLine();
    //    System.out.println("enter 2nd sentence");

       s = s.toLowerCase();
       s=s.replaceAll(" ", "");
       int vowelNo = 0;
       int consonantNo = 0;
       String vowelWord = "";
       String consonantWord = "";


       for(int i = 0;i<= s.length()-1;i++){
        char c = s.charAt(i);
             if(c=='a'||c=='e'||c=='i'||c=='o'|| c=='u')
             {
                vowelWord = vowelWord+s.charAt(i);
                vowelNo++;
             }  
             else{
                
             consonantWord =    consonantWord+s.charAt(i)+"";
                consonantNo++;
             }

       }
       System.out.println(vowelWord);
       System.out.println(vowelNo);
       System.out.println(consonantWord);
       System.out.println(consonantNo);


        
    }
    
}

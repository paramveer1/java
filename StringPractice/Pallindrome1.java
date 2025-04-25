package StringPractice;

public class Pallindrome1 {
    public static void main(String[] args) 
    {
        
    String rev = "";
    String s = "nolemonnomelon";
    for(int i = s.length()-1;i>= 0;i--)
         {
            rev = rev+s.charAt(i);
         }

         if(rev.equals(s))
         {
            System.out.print("pallindrome");
         }
         else{
            System.out.println("not pallindrome");
         }
    }

    
}

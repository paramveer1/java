import java.util.Arrays;
import java.util.Scanner;



class Anagram 
{
    public static void main(String args [])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st word");
        String a =sc.next();
        // System.out.println("in capital") ;
        // System.out.println(a.toUpperCase());
                System.out.println("enter 2nd word");

        String b = sc.next();
        char arr[] = a.toCharArray();
        char arr2[] = b.toCharArray();

        Arrays.sort(arr);
        // System.out.println("first word sorted: ");
        // System.out.println(arr);
        Arrays.sort(arr2);

        
        if(  Arrays.equals(arr,arr2))
        {
            System.out.println(" Result:Anagram");
        }
        else
        {
            System.out.println("result :not anagram");
        }


    }
}
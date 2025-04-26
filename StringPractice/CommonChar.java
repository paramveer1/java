package StringPractice;

public class CommonChar {
    public static void main(String[] args) 
    {
        String s = "paramvqzeer";
        String s2 = "iartmpeqr";

        for(int i = 0;i<= s.length()-1;i++)
        {
            for(int j = 0;j<= s2.length()-1;j++)
            {
                if(s.charAt(i)==(s2.charAt(j)))
                {
                    System.out.print(s.charAt(i)+" ");
                }
            }
        }

    }
    
}

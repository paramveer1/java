package StringPractice;

public class FirstNonRepeatedChar 
{
    public static void main(String[] args)
     {
        String s = "AABCCDBED";
       
        for(int i = 0;i<= s.length()-1;i++)
        {
            boolean b = false;
            
            for(int j = 0 ;j<= s.length()-1;j++)
            {
                // if((i!=j && s.charAt(i)==s.charAt(j)))
                // if((i!=j && !(s.charAt(i)==s.charAt(j)))
                // {
                // {
                //     b = true;
                // }
            }
            // if(b==false)
            // {
            //     System.out.print(s.charAt(i));
            //     break;
            // }
            
        
        }
    }
    
}

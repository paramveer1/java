package StringPractice;

public class FirstNonRepeatedChar0 {
    public static void main(String[] args) {
        String s = "AABCDDEECDEWTRGHB";
       
        for(int i = 0;i<= s.length()-1;i++)
        {
            Boolean b = false;
            for(int j = 0;j<= s.length()-1;j++)
            {
                if(i!=j && (s.charAt(i)==s.charAt(j)))
                {
                    b = true;
                }   
            }
            if(!b)
            {
                System.out.print(s.charAt(i));
                break;
            }
        }
    }
    
}

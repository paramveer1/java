package StringPractice;

public class DuplicateManual2
 {
    public static void main(String[] args) 
    {
        String rev = "";
        String s = "paramveer singh";
        for(int i = 0;i<= s.length()-1;i++)
        {
            Boolean b = false;
            for(int j = i+1;j<= s.length()-1;j++)
            {
                if(s.charAt(i) == s.charAt(j))
                {
                    b=true;

                }

            }
            if(!b){
                rev = rev+ s.charAt(i);
            }
        }
        System.out.println(rev);
    }
    
}

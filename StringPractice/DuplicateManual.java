package StringPractice;

public class DuplicateManual
 {
    public static void main(String[] args)
     {
        String s = "paramveer is genius";
        String rev = "";
        for(int i = 0;i<= s.length()-1;i++)
        {
        Boolean b = false;

            for(int j = i+1;j<= s.length()-1;j++)
            {
                if(s.charAt(i)== s.charAt(j))
                {
                    b = true;
                    break;

                }
               
            }
            if(!b)
            {
                
                    rev = rev + s.charAt(i);
                
            }
        

        }
        System.out.println(rev);
    }
    
}

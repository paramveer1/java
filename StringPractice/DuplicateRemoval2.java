package StringPractice;

public class DuplicateRemoval2 {
    public static void main(String[] args) {
        String s = "paramveer singh rajwat";
        String result = "";
        for(int i = 0;i<= s.length()-1;i++)
        {
            Boolean b = false;
            for(int j = i+1;j<= s.length()-1;j++)
            {
                if(s.charAt(i ) == s.charAt(j))
                {
                    b = true;
                }
            }
            if(!b)
            {
                result = result + s.charAt(i) ;
               
            }

        }
        System.out.println(result);
    }
    
}

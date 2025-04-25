package StringPractice;

public class CapitalixeFirstWord {
    public static void main(String[] args) {
        String s = "param veer  song";
        char [] c = s.toCharArray();
        String S = "";
        for(int i = 0;i<= c.length-1;i++)
        {
            if(i==0)
            {
                S= S+s.charAt(i);

            }
        }
        
    }
    
}

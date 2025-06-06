package Revise.In2It;

public class PrintDuplicatesString {
    

    public static void main(String[] args) {
        String s = "paramveer";
        String snew = "";
        for(int i = 0;i<= s.length()-1;i++)
        {
            for(int j = i+1;j<= s.length()-1;j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    // System.out.print(s.charAt(i));
                    snew = snew + s.charAt(i);
                }
            }
        }
        System.out.print(snew);
    }
    
}

package Revise.In2It;

public class RemoveDuplicateString2 {
    public static void main(String[] args) {
        String s = "paramveer";
        String updated = "";
        for(int i = 0;i<= s.length()-1;i++)
        {
            Boolean duplicate = false;
            for(int j = i+1 ;j<= s.length()-1;j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    duplicate = true;
                    break;
                    
                }

            }
            if(!duplicate)
            {
                System.out.print(s.charAt(i));
                // updated = updated + s.charAt(i);
            }
          
        }
        //   System.out.print(updated);
    }
    
}

package StringPractice;

public class SortAlphaOrder {
    public static void main(String[] args) {
        String s = "paramveer singh rajawat";
        char [] c = s.toCharArray();
        for(int i = 0;i<= c.length-1;i++)
        {
            for(int j = i+1;j<= c.length-1;j++)
            {
                if(c[i]>c[j])
                {
                    char temp = c[i];
                    c[i] = c[j];
                     c[j] = temp;
                }
            }
        }
        String ss = new String(c);
        System.out.println(ss);
        
    }
    
}

package Revise.In2It;

public class StringReverse2 {
    public static void main(String[] args) {
        String s = "paparam";
        char c [] = s.toCharArray();
        char temp = 0;
        String rev = "";
        for(int i = 0;i<c.length/2;i++)
        {
          temp =   c[i];
          c[i] = c[c.length-1-i];
          c[c.length-1-i] = temp;
        }
        for(char i : c)
        {
            rev = rev+i;
        }
        System.out.println(rev);
    }
    
}

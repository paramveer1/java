public class ReverseString1 {
   
    public static void main(String [] args){
        String s  = "paramveer singh";
    
        for(int i = s.length()-1; i>=0;i--)
        {
            System.out.print(s.charAt(i));
        }
    }
}

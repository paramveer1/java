public class StringPallindrome1 {
    public static void main(String[] args) {
        String s = "paramarap";
       
        String rev = "";
        for(int i = s.length()-1;i>=0;i--){
          char  t=s.charAt(i);
                rev = rev +t;
        }
        if(rev.equals(s)){
            System.out.println(s + " is Pallindrome");
        }
        else{
            System.out.println(s +" is not Pallindrome");
        }
    }
    
}

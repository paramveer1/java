package StringPractice;
public class RemoveSpecialChar {
    public static void main(String[] args) {
        String s = "#@5443gfggh$    %^^$#%       @%GHGCV%Y^&^%$E%";
        String a = "paramveer singh";
        s = s.replaceAll("\\s", "");
        // a = a.replaceAll(',"");
        System.out.println(s);
    }
    
}

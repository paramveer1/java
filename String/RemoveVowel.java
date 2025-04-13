package String;

public class RemoveVowel {
    public static void main(String[] args) {
        String s = " paramveer singh rajawat";
        s = s.replaceAll("[aeiouA EIOU]","");
        System.out.println(s);
    }
    
}

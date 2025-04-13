package String;

public class RemoveSpecialChar {
    public static void main(String[] args) {
        String s = "P*&#^A&#&   #*R&*@&@    *@A**&     WM";
        String plain = s.replaceAll("[^0-9a-zA-Z]", "");
        System.out.println(plain);
    }
    
}

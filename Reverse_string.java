public class Reverse_string {
    public static void main(String[] args) {
        String s = " param is a good boy";
        String [] a = s.split(" ");
        for(int i = a.length-1;i>=0;i--){
            System.out.println(a[i]);

        }
    }
}

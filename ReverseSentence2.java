import java .util. Scanner;
public class ReverseSentence2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String arr[] = s.split(" ");
        for(int i = arr.length-1;i>=0;i--){
            System.out.print(arr[i]+"");
        }
    }
    
}

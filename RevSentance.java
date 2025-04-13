import java.util.Scanner;
public class RevSentance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String [] arr = a.split(" ");
        for(int i = arr.length-1;i>= 0;i--){
            System.out.print(arr[i]+" ");
        }
        
    }
}

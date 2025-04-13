import java.util.Scanner;
// import java.util.LinkedHashSet;
public class DuplicateElementRemovalStringtocharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char [] c = s.toCharArray();
       for(int i = 0 ; i<= c.length-1;i++){
        for(int j = i+1;j< c.length;j++){
            if(c[i]==c[j]){
                break;
            }

            if(j==c.length-1){
                System.out.print(c[i] + "");
              
            }
        }
       

       }
       System.out.println(c[c.length-1]);
    }
    
}

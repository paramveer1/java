package NumberPattern.Pattern2;

public class TriangleVerticalCounting
 {
    public static void main(String[] args) 
    {
        for(int i = 1;i<= 10;i++){
            int no = i;
            for(int j = 1;j<= i;j++ ){
                System.out.print(no+" ");
                no = no+(10-j);



            }
            System.out.println();
        }

    
}
    
}

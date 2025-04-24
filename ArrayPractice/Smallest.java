package ArrayPractice;

public class Smallest
 {
    public static void main(String[] args)
     {
        int [] a = {3,4,32,335,234,5654,3554,2,35,3,67,465,4,6,877,65,2,2,2,5,5,5,5,5,5,67,67,0};
        int small = a[0];
        for(int i = 1;i<= a.length-1;i++)
        {
            if(a[i]< small){
                small = a[i];
            }
        }
        System.out.println(small);

     }
    
}

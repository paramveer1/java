package ArrayPractice;

public class CommonElement2Arrays

 {
    public static void main(String[] args)
     {
        int [] a = {3,4,32,335,234,5654,3554,2,35,3,67,465,4,6,877,65,2,2,2,5,5,5,5,5,5,67,67,0};
        int [] b = {3,444,32,3356,2,35,3,55,4,6,877,65,2,2,5,5,5,5,564,0};
        for(int i = 0;i<= a.length-1;i++)
        {
            for(int j = 0;j<= b.length-1;j++)
            {
                if(a[i]==b[j])
                {
                    System.out.print(a[i]+" ");
                    break;
                }
            }
        }


    }
    
}

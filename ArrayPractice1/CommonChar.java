public class CommonChar {
    public static void main(String[] args) {
        int a []  = {1,4,7,5,7,9,89,00,0,6,9,7,3,6,5,4};
        int ab []  = {1,433,7,5,33,9,89,00,3330,6,93,7,433,36,5,3334};
        for(int i = 0 ;i<= a.length-1;i++)
        {
            for(int j  = 0;j<= ab.length-1;j++)
            {
                if(a[i]==ab[j])
                {
                    System.out.print(a[i] + " ");
                    break;
                   
                }
                
               
            }
        }
        int aaa = 00;
        System.out.println(aaa);


        
    }
    
}

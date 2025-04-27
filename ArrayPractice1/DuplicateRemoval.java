public class DuplicateRemoval {
    public static void main(String[] args) {
        int ab []  = {1,433,7,5,33,9,89,00,3330,6,93,7,433,36,5,3334};
        for(int i = 0;i<= ab.length-1;i++)
        {
             boolean b = false;
            for(int j = i+1;j<= ab.length-1;j++)
            {
                if(ab[i]==ab[j])
                {
                    b = true;
                }
            }
            if(!b)
            {
                System.out.print(ab[i]+" ");
            }
        }


    }
    
}

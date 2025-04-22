package ArrayPractice;
import java.util.LinkedHashSet;


public class DuplicateViaSet 
{
    public static void main(String[] args) 
    {
        int [] a = {3,4,32,335,234,5654,3554,2,35,3,67,465,4,6,877,65,2,2,2,5,5,5,5,5,5,67,67};
        LinkedHashSet lhs = new LinkedHashSet();

        for(int i : a)
    
        {
            if(!lhs.add(i))
            {
                System.out.print(i + " ");
            }

                
        }
    }
    
}

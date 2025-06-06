package Revise.In2It;

public class RemoveDuplicateArray {
    public static void main(String[] args) {
        int a []= {1,2,3,5,6,7,8,9,6,3,9,51,11,2,3,6,5};
        for(int i = 0;i<= a.length-1;i++)
        {

            boolean duplicate = false;
            for(int j = i+1;j<= a.length-1;j++)
            {
                if(a[i]==a[j])
                {
                    duplicate = true;
                     break;
                }
               
            }
            if(!duplicate)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
    
}

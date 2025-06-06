package Revise.In2It;

public class RemoveDuplicateElementArray {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,2,3,5,78,9,4,6,4,6,7,8,9};
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
            if(!duplicate){
                System.out.print(a[i]+" ");
            }
        }
    }
    
}

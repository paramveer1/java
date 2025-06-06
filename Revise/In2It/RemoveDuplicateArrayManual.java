package Revise.In2It;

public class RemoveDuplicateArrayManual {
    public static void main(String[] args) {
        int a [] = {1,2,3,4,5,6,7,8,9,5,41,6,226,2,3,5,4};
        for(int i = 0;i<= a.length-1;i++){
            boolean duplicate = false;
            for(int j = i+1;j<= a.length-1;j++){
                if(a[i]==a[j])
                {
                   duplicate = true; 
                }
            }
            if(!duplicate)
            {
                System.out.print(a[i]+" ");
            }
        }

        
    }
    
}

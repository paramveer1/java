package Revise.In2It;

public class DuplicatElementArray {
    public static void main(String[] args) {
        int a [] = {1,5,6,7,5,3,3};
        for(int i = 0 ;i<= a.length-1;i++)
        {
            for(int j = i+1;j<= a.length-1;j++)
            {
                if(a[i]==a[j])
                {
                    System.out.print(a[i]);
                }
            }
        }
    }
    
}

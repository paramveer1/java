public class MaxElement {
    public static void main(String[] args) {
        int a []  = {4,7,5,7,9,89,6,9,7,3,6,5,4545};
        int max = a[0];
        for(int i = 0;i<= a.length-1;i++)
        {
            if(max> a[i])
            {
                max = a[i];
            }
        }
        System.out.println(max);
    }
    
}

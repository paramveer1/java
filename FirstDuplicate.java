public class FirstDuplicate {
    public static void main(String[] args) {
        int temp = 0;
        int a [] = {1,3,5,3,2,2,6,8,4,5,3,2,1,0,0,8};
        for(int i = 0;i<a.length-1;i++){
            for(int j = i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.print(a[j]);
                    temp++;

                    break;
                }
            }
            if(temp>0){
                break;
            }

            System.out.println();

        }
    }
}

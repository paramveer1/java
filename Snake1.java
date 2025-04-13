public class Snake1 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 1 ; i<=5;i++){
            // for(int j = 1;j<=i;j++){
                if(i%2!=0){
                    for(int j = 1;j<=i;j++){
                            count++;
                    System.out.print(count);
                    }
                    
                }
                else{
                    int temp = count+1;
                    for(int k = count+i;k>=temp;k--){
                        count++;
                        System.out.print(k);
                    }
                }
                 System.out.println();

            }
           
            // }
        }
    }










        
    
    


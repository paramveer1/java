public class HorizontalSnake {

    public static void main(String args[]){

    
   
        int count = 1;
        for(int i = 1; i<= 5; i++){
            
                // int a = i;
                if(i%2!=0){
                    for(int j = 1;j<=5;j++){
                        System.out.print(count++ +" ");
                    }
                    
                }
                else{
                    int a = count;
                
                   
                for(int k = a+4;k>= a;k--){
                    System.out.print(k+" ");
                    count++;

                    
                }
            }
           
            
            System.out.println();
            
        }
    }
}   


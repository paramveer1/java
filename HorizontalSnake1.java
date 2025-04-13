public class HorizontalSnake1 {
    public static void main(String[] args) {
        int count = 1;
        for(int i=1;i<= 5;i++ ){
            if(i%2!=0){
                for(int j = 1;j<= 5;j++){
                    System.out.print(count++);
                }
                

               
            }
            else{
                int a = count;
                for(int j = a+4;j>= a;j--){
                    System.out.print(j);
                    count++;
                }
            }

           
            System.out.println();
           
        }
    }
    
}

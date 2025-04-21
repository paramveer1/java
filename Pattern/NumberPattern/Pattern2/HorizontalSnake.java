package NumberPattern.Pattern2;

public class HorizontalSnake {
    public static void main(String[] args) {
        int count = 1;

        for(int i = 1 ; i<= 5; i++){
            if(i%2!= 0){
                for(int j = 1;j<= 5;j++ ){
                    System.out.print(count++);

                }

            }

            else{
                int temp = count;
                for(int j = temp+4;j>= temp; j--){
                    System.out.print(j);
                    count++;
                }
            }
            System.out.println();

        }
    }
    
}

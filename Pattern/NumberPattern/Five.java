package NumberPattern;

public class Five {
    public static void main(String[] args) {
        int count = 1;
        for(int i = 1;i<= 5;i++){
            for( int j = 1;j<=9;j++){
                if(i+j == 6){
                    System.out.print(1);
                }
                else if(i==5 && j%2 != 0){
                    System.out.print(++count);


                }

                else if(j-i == 4){
                    System.out.print(i);
                }

                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
           
        }

    }
    
}

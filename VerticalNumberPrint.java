public class VerticalNumberPrint {
    public static void main(String[] args) {
        
        for(int i = 1;i<= 5; i++){
            int a = i;
            for(int j = 1 ; j<= 5;j++){
                System.out.print(a+" ");
                a=a+5;
                
            }
            System.out.println();
        }
    }
    
}

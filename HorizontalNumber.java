public class HorizontalNumber {
    public static void main(String[] args) {
        int count = 1;
        for(int i = 1;i<= 5;i++){
            for(int j = 1;j<= 5;j++){
                System.out.print(count+++" ");
            }
            System.out.println();
        }
    }
}

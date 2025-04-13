public class NumPatternMisc {
    public static void main(String[] args) {
        for(int i = 1 ; i<= 8;i++){
            int no = i;
            for(int j = 1;j<= i;j++){
                System.out.print(no+ " ");
                no = no+8-j;

            }
            System.out.println();
        }
    }
}

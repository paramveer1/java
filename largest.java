public class largest {
    public static void main(String[] args) {
        int a = 8;
        int b = 2;
        int c = 99;
        if(a>b){
            if(a>c){
                System.out.println(a + " is big");
            }
            else{
                System.out.println(c+ "is big ");
            }
        }
        else if(b>a){
            if(b>c){
                System.out.println(b + "is big");
            }
            else{
                System.out.println(c + " is big");
            }
        }
    }
    
}

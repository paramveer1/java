public class TryCatch {


    public static void main(String[] args) {
        int a = 7;
        int b = 8;
        try{
        System.out.println(a+b);
        System.out.println(a/0);
        
        }
        catch(Exception e){
            System.out.println(e);
        }
        System.out.println(a-b);
    }
    
}

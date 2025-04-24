package Pattern2;

public class TriangleABC {
    public static void main(String[] args) {
        for(char i = 'A';i<='C';i++)
        {
            for(char j ='B';j>=i;j--)
            {
                System.out.print(" ");
            }
            for(char j='A';j<=i;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    
}

package StringPractice;

public class ReverseWord {
    public static void main(String[] args) {
        String  s = "param sing rajsawat";
        String [] words = s.split(" ");
        String result = "";
        for(String i : words)
        {
            for(int j = i.length()-1;j>= 0;j-- )
            {
               result = result + i.charAt(j);
            }
           result = result + " ";

        }
        System.out.println(result);
    }
    
}

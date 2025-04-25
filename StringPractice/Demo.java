package StringPractice;

public class Demo {
    public static void main(String[] args) {
        String s = "param singh raja";
       s =  s.concat("pg");
    //    System.out.println(s);
    //    System.out.println(s.equalsIgnoreCase("para"));
    //   s =  s.replaceAll("par" , "sha");

    // int a = s.indexOf("sin");
    // System.out.println(s.startsWith("p"));
    char [] c = s.toCharArray();
    int count = 0;
    for(char i : c)
    {
        if(i=='a')
        {
            count++;
        }
    }

      System.out.println(count);


    }
    
}

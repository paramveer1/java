import java.util.Arrays;
import java.util.Scanner;
public class AnagramManual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();

        char arra[] = a.toCharArray();
        char arrb[] = b.toCharArray();

        for(int i = 0;i<arra.length-1;i++)
        {
            for(int j = i+1;j<arra.length;j++)
            {
                if(arra[i]>arra[j])
                {
                    char temp = arra[i];
                    arra[i]=arra[j];
                    arra[j]=temp;
                }
            }
        }

//   System.out.println(Arrays.toString(arra));
        for(int i = 0;i<arrb.length-1;i++)
        {
            for(int j = i+1;j<arrb.length;j++)
            {
                if(arrb[i]>arrb[j])
                {
                    char temp = arrb[i];
                    arrb[i]=arrb[j];
                    arrb[j]=temp;
                }
            }
        }

        // System.out.println(Arrays.toString(arrb));

        //  a = new String(arra);
        //  b = new String(arrb);
        //  if(a.equals(b))
        //  {
        //     System.out.println("anagram");
        //  }
        //  else{
        //     System.out.println("not anagram");
        //  }

      boolean boo = true;
      for(int i = 0;i<= arra.length-1;i++)

    {

      if(arra[i] !=  arrb[i]) 
      {
          boo= false;
      }


    }

    if(boo==true){
System.out.println("ana");
    }
    else
    {
        System.out.println("not ana");
    }

    





        
    }
    
}

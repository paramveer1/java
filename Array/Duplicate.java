package Array;

import java.util.LinkedHashSet;

public class Duplicate {
    public static void main(String[] args) {
        int [] a = {2,3,2,3,4,4,1,5,5};
    LinkedHashSet lhs = new LinkedHashSet();
    for(int i : a){
       if( lhs.add(i)== false){
        System.out.print(i+" ");
        break;

       }
    } 
    }
   
    


    
}

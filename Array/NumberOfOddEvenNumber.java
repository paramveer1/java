package Array;

public class NumberOfOddEvenNumber {
    public static void main(String[] args) {
        int [] a = { 1,36,7,4,9,0,6,4,3,32};
        int even = 0;
        int odd=0;
        int totaleven =0;
        int totalOdd = 0;
        for(int i : a){
            if(i%2==0){
                totaleven = totaleven+i;
                even++;
            }
            else{
                // System.out.println("odd"+" "+ i);
                totalOdd = totalOdd + i;
                odd++;
            }
            
        }
        System.out.println(
                "even " + even + "odd " +  odd
            );
            System.out.println(totalOdd + " " + totaleven );
        

    }
    
}

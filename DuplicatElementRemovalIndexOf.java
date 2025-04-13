public class DuplicatElementRemovalIndexOf {

     
public static void main(String[] args) {
    // public static void main(String [] args){
    String s = "paramveer singh raja";
    StringBuffer ss = new StringBuffer();
    for(int i = 0;i<s.length();i++){
        if(s.indexOf(s.charAt(i),i+1)==-1){
            ss = ss.append(s.charAt(i));
        }
    }
    System.out.println(ss);
    }

    
}

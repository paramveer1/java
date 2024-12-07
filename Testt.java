class Employee{
    private int emp_id;
    private String name = "param";
    private int mob = 575;
     String getName(){
        return name;
    }
    void setName(String name){
        this.name = name;
    }

}
public class Testt {
    public static void main(String[] args) {
        Employee e = new Employee();
        Employee f = new Employee();
      
        e.setName("Gopal");
    
        System.out.println(e.getName());
        System.out.println(e.getName()); 
    }  
    
}

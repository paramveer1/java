class Employee{
    private int employee_id;
    public void setEmpId(int a ){
        employee_id = a;
    }
    public int  getEmpId(){
        return employee_id;
    }

}
public class Encapsulatio {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmpId(50);
       
        System.out.println( e.getEmpId());

        
    }

    
}

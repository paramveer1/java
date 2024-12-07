public class Encapsulation {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setEmpId(5);
        System.out.println(emp.getEmpId());
        
    }
    
}
class Employee{
    private int  empId;
    void setEmpId(int empId){
        this.empId = empId;
    }
    int getEmpId(){
        return empId;
    }

}

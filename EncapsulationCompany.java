
class Employee{
  private  int  employee_Id =10;
private int b;
      public void setEmpId(int oo){
       employee_Id = oo;
      

    }

    public int getEmpId(){
        return employee_Id;


    }



}



public class EncapsulationCompany{
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setEmpId(555);
       
    System.out.println(e.getEmpId());
    }
    
    
}

class Employee{
   private int  employee_id ;
   void set(int employee_id){
    this.employee_id = employee_id;

   }
   int get(){
    return employee_id;
   }

}



public class EncapsulationCompany0 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.set(555);
       System.out.println( e.get());
    }
    
}

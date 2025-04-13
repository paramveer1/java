
public class Student {

    int roll_no;
    String name;

    Student(int roll_no , String name ){
        this.roll_no = roll_no;
        this.name = name;
    }
    public static void main(String[] args) {
        Student s = new Student(32, "param");
        System.out.println(s.roll_no + s.name);
        
    }
    
}

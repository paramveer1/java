public class Demo {

    String name = "pa";
    int id;
    static int p = 0;

    void ok(){
        System.out.println(name);
    }

  void set(String name,int id)
  {
    this.name = name;
    this.id =  id;
  }

    
    public static void main(String[] args) {
        // p = 9;
        // System.out.println(p);



       Demo d = new Demo();
    //    d.set("param",555);

       System.out.println(name);
    d.ok();
        
        
    }

    }
    


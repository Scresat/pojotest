package POJO;

public class Student  implements java.io.Serializable {

     private int id;
     private String name;
     private Integer fees;

    public Student() {
    }

	
    public Student(int id) {
        this.id = id;
    }
    public Student(int id, String name, Integer fees) {
       this.id = id;
       this.name = name;
       this.fees = fees;
    }
   
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public Integer getFees() {
        return this.fees;
    }
    
    public void setFees(Integer fees) {
        this.fees = fees;
    }

}



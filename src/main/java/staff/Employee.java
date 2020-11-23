package staff;

public class Employee {
    private String name;
    private String NInumber;
    private double salary;

    public Employee(String name, String NInumber, double salary){
        this.name = name;
        this.NInumber = NInumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getNINumber(){
        return this.NInumber;
    }

    public void setNINumber(String newNI){
        this.NInumber = newNI;
    }
}

package staff;

public abstract class Employee {
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
        if (newName != null) {
            this.name = newName;
        }
    }

    public String getNINumber(){
        return this.NInumber;
    }

    public void setNINumber(String newNI){
        this.NInumber = newNI;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(int newSalary) {
        this.salary = newSalary;
    }

    public void raiseSalary(double raisedSalary){
        if (raisedSalary > 0) {
            this.salary += raisedSalary;
        }
    }

    public double getBonus() {
        return this.salary * 0.01;
    }
}

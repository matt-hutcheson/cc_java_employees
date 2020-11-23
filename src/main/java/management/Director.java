package management;

public class Director extends Manager {

    private Double budget;

    public Director(String name, String NInumber, double salary, String deptName, double budget) {
        super(name, NInumber, salary, deptName);
        this.budget = budget;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

}

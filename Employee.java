public class Employee implements Measurable{
    private double salary;
    private String name;

    public Employee(String name, int Salary) {
        this.name = "";
        this.salary = 0;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int getMeasure() {
        return (int) getSalary();
    }

    @Override
    public String toString() {
        return "Employee [name=" +
                getName() +
                ", salary=" +
                getSalary() +
                "]";
    }

    public String payroll() {
        return "Pay " +
               getName() +
               " $" +
                getSalary();
}

}

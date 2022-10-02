public class Employee {
    protected String name;
    protected String department_name;
    protected double salary;
    protected int ID;
    static int  next_ID = 0;
    int manager_ID;


    public Employee() {
        name = "0";
        department_name = "0";
        salary = 0;
    }

    public String getName() {
        return name;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public double getSalary() {
        return salary;
    }

    public int getID() {
        return ID;
    }

    public int getManagerID() {
        return manager_ID;
    }

    public Employee(String name, double salary) throws FieldLengthLimitException, IncorrectSalaryException {
        this.ID = next_ID++;

        if (name.length() > 15) {
            throw new FieldLengthLimitException("Too much symbols in name!");
        } else {
            this.name = name;
        }

        if (salary <= 0) {
            throw new IncorrectSalaryException("Salary cannot be less than zero!");
        } else {
            this.salary = salary;
        }
    }

    void PrintEmployee(){
        System.out.println("ID: " + ID + " Name: " + name + " Salary: " + salary);
    }

}

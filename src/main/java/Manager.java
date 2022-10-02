public class Manager extends Employee{
    double bonus;

    public Manager(){
        bonus = 0;
    }

    public double getBonus(){
        return bonus;
    }

    public Manager(String name, double salary, double bonus) throws FieldLengthLimitException, IncorrectSalaryException {
        ID = next_ID++;

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

        if (bonus < 0) {
            throw new IncorrectSalaryException("Bonus cannot be less than zero!");
        } else {
            this.bonus = bonus;
        }
    }

    void PrintEmployee(){
        System.out.println("ID: " + ID + " Name: " + name + " Salary: " + salary + " Bonus: " + bonus);
    }

}

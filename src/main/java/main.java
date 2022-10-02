public class main {
    public static void main(String[] args) throws IncorrectSalaryException, EmployeeInRegistryException,
            FieldLengthLimitException{

        Registry employees = Registry.getRegistry();
        employees.printList();

        Employee emp1 = new Employee("Bohdan", 1200);
        employees.addEmployee(emp1);

        Employee emp2 = new Employee("John", 600);
        employees.addEmployee(emp2);

        Manager man = new Manager("Borys", 3000, 200);
        employees.addEmployee(man);

        employees.printList();

    }
}

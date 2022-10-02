import java.util.ArrayList;

public class Registry {
    private static Registry instance = null;
    private final ArrayList<Employee> employees = new ArrayList<Employee>();

    private Registry() {
    }

    public static Registry getRegistry() {
        if (instance == null) {
            instance = new Registry();
        }
        return instance;
    }

    public void addEmployee(Employee employee) throws EmployeeInRegistryException {
        if (employees.size() == 0) {
            employees.add(employee);
        } else {
            for( int i = 0; i < employees.size(); i++ ){
                if( employee.getID() == employees.get(i).getID() ){
                    throw new EmployeeInRegistryException("Employee with such ID is already registered in the system");
                }
            }
            employees.add(employee);
        }

    }

    public void printList(){
        if( employees.size() == 0 ){
            System.out.println("Company employees list is empty.");
        } else{
            System.out.println("Company employees list:");

            for( int i = 0; i < employees.size(); i++ ){
                employees.get(i).PrintEmployee();
            }
        }
    }

}

public class EmpMain {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(5);

        Employee emp1 = new Employee(1, "Pip", "Analyst", 75000);
        Employee emp2 = new Employee(2, "Holly", "Developer", 60000);
        Employee emp3 = new Employee(3, "Max", "Manager", 85000);

        ems.addEmployee(emp1);
        ems.addEmployee(emp2);
        ems.addEmployee(emp3);

        System.out.println("All Employees:");
        ems.traverseEmployees();

        System.out.println("\nSearching for Employee with ID 2:");
        Employee emp = ems.searchEmployee(2);
        if (emp != null) {
            System.out.println(emp);
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("\nDeleting Employee with ID 2:");
        ems.deleteEmployee(2);
        ems.traverseEmployees();
    }
}
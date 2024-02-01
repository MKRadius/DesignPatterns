public class Main {
    public static void main(String[] args) {

        Organization organization = new Organization("organization1");

        Department department1 = new Department("department1");
        Department department2 = new Department("department2");
        Department department3 = new Department("department3");

        Employee employee1 = new Employee("employee1", 100);
        Employee employee2 = new Employee("employee2", 200);
        Employee employee3 = new Employee("employee3", 300);
        Employee employee4 = new Employee("employee4", 400);
        Employee employee5 = new Employee("employee5", 500);
        Employee employee6 = new Employee("employee6", 600);
        Employee employee7 = new Employee("employee7", 700);
        Employee employee8 = new Employee("employee8", 800);

        // add employee1 to organization
        organization.addEmployee(employee1);

        // add department1 and department2 to organization
        organization.addDepartment(department1);
        organization.addDepartment(department2);

        // add employee2 and employee3 to department3
        department3.addEmployee(employee2);
        department3.addEmployee(employee3);

        // make deparment3 a sub-department of department1
        department1.addDepartment(department3);

        // add employee4 and employee5 to department1
        department1.addEmployee(employee4);
        department1.addEmployee(employee5);

        // add employee6, 7 and 8 to department2
        department2.addEmployee(employee6);
        department2.addEmployee(employee7);
        department2.addEmployee(employee8);

        // print the salary of organization1
        System.out.println("Salary of organization1: " + organization.getSalary());
    }
}
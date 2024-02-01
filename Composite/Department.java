import java.util.ArrayList;
import java.util.List;

public class Department {
    private static int id = 0;
    
    private int departmentId;
    private String name;
    private List<Employee> employeeList;

    public Department() {
        this.departmentId = id++;
        this.name = "department" + departmentId;
        this.employeeList = new ArrayList<Employee>();
    }

    public Department(String name) {
        this();
        this.name = name;
    }

    public void setName(String name) { 
        this.name = name; 
    }

    public String getName() { 
        return name; 
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }

    public int getSalary() {
        int salary = 0;
        for (Employee employee : employeeList) {
            salary += employee.getSalary();
        }
        return salary;
    }
}

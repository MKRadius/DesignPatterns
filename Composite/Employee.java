public class Employee {
    private static int id = 0;

    private int employeeId;
    private String name;
    private int salary;

    public Employee() {
        this.employeeId = id++;
        this.name = "employee" + employeeId;
        this.salary = 0;
    }

    public Employee(String name, int salary) {
        this();
        this.name = name;
        this.salary = salary;
    }

    public void setName(String name) { 
        this.name = name; 
    }

    public void setSalary(int salary) { 
        this.salary = salary; 
    }
    
    public int getSalary() { 
        return salary; 
    }

    public String getName() { 
        return name; 
    }
}

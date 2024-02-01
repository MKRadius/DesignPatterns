import java.util.ArrayList;
import java.util.List;

public class Organization {
    private static int id = 0;

    private String name;
    private List<Department> departmentList;
    private List<Employee> employeeList;

    public Organization() {
        this.name = "organization" + id++;
        this.departmentList = new ArrayList<Department>();
        this.employeeList = new ArrayList<Employee>();
    }

    public Organization(String name) {
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

    public void addDepartment(Department department) {
        departmentList.add(department);
    }

    public void removeDepartment(Department department) {
        departmentList.remove(department);
    }

    public int getSalary() {
        int salary = 0;

        if (employeeList.isEmpty() && departmentList.isEmpty()) {
            return salary;
        }
        else if (employeeList.isEmpty() && !departmentList.isEmpty()) {
            for (Department department : departmentList) {
                salary += department.getSalary();
            }
            return salary;
        }
        else if (!employeeList.isEmpty() && departmentList.isEmpty()) {
            for (Employee employee : employeeList) {
                salary += employee.getSalary();
            }
            return salary;
        }
        else {
            for (Employee employee : employeeList) {
                salary += employee.getSalary();
            }
            for (Department department : departmentList) {
                salary += department.getSalary();
            }
            return salary;
        }
    }

    public String toXML() {
        StringBuilder xml = new StringBuilder();
        xml.append("<organization name=\"").append(name).append("\">");

        if (employeeList.isEmpty() && departmentList.isEmpty()) {
            xml.append("</organization>\n");
            return xml.toString();
        }
        else if (employeeList.isEmpty() && !departmentList.isEmpty()) {
            for (Department department : departmentList) {
                xml.append(department.toXML(1));
            }
            xml.append("</organization>\n");
            return xml.toString();
        }
        else if (!employeeList.isEmpty() && departmentList.isEmpty()) {
            for (Employee employee : employeeList) {
                xml.append("\n    ").append("<employee name=\"").append(employee.getName())
                   .append("\" salary=\"").append(employee.getSalary()).append("\" />\n");
            }
            xml.append("</organization>\n");
            return xml.toString();
        }
        else {
            for (Employee employee : employeeList) {
                xml.append("\n    ").append("<employee name=\"").append(employee.getName())
                   .append("\" salary=\"").append(employee.getSalary()).append("\" />\n");
            }
            for (Department department : departmentList) {
                xml.append(department.toXML(1));
            }
            xml.append("</organization>\n");
            return xml.toString();
        }
    }
}

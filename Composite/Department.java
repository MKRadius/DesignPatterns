import java.util.ArrayList;
import java.util.List;

public class Department {
    private static int id = 0;
    
    private int departmentId;
    private String name;
    private List<Employee> employeeList;
    private List<Department> departmentList;

    public Department() {
        this.departmentId = id++;
        this.name = "department" + departmentId;
        this.employeeList = new ArrayList<Employee>();
        this.departmentList = new ArrayList<Department>();
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

    public String toXML(int indentationLevel) {
        StringBuilder xml = new StringBuilder();
        String indentation = "    ".repeat(indentationLevel);

        xml.append(indentation).append("<department name=\"").append(name).append("\">\n");

        if (departmentList.isEmpty() && employeeList.isEmpty()) {
            xml.append(indentation).append("</department>\n");
            return xml.toString();
        }
        else if (departmentList.isEmpty() && !employeeList.isEmpty()) {
            for (Employee employee : employeeList) {
                xml.append(indentation).append("    ")
                   .append("<employee name=\"").append(employee.getName())
                   .append("\" salary=\"").append(employee.getSalary()).append("\" />\n");
            }
            xml.append(indentation).append("</department>\n");
            return xml.toString();
        }
        else if (!departmentList.isEmpty() && employeeList.isEmpty()) {
            for (Department department : departmentList) {
                xml.append(department.toXML(indentationLevel + 1));
            }
            xml.append(indentation).append("</department>\n");
            return xml.toString();
        }
        else {
            for (Employee employee : employeeList) {
                xml.append(indentation).append("    ")
                   .append("<employee name=\"").append(employee.getName())
                   .append("\" salary=\"").append(employee.getSalary()).append("\" />\n");
            }
            for (Department department : departmentList) {
                xml.append(department.toXML(indentationLevel + 1));
            }
            xml.append(indentation).append("</department>\n");
            return xml.toString();
        }
    }
}

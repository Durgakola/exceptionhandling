package streams;

public class Employee {
    private String employeeId;
    private String dept;

    public Employee(String employeeId, String dept) {
        this.employeeId = employeeId;
        this.dept = dept;
    }

    public String getEmployeeId() {

        return employeeId;
    }

    public String getDept() {

        return dept;
    }
}

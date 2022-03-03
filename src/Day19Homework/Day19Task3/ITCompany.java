package Day19Homework.Day19Task3;

public class ITCompany {
    protected int countOfEmployees;
    protected String departmentName;

    public ITCompany() {

    }

    public ITCompany(int countOfEmployees, String departmentName) {
        this.countOfEmployees = countOfEmployees;
        this.departmentName = departmentName;
    }

    public int getCountOfEmployees() {
        return countOfEmployees;
    }

    public void setCountOfEmployees(int countOfEmployees) {
        this.countOfEmployees = countOfEmployees;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void account() {
        System.out.println("Count of employees: " + getCountOfEmployees());
        System.out.println("Department name: " + getDepartmentName());
    }
}

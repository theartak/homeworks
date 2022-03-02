package Day19Homework;

public class Task2_1_Accounting {
    private int countOfEmployees;
    private String departmentName;

    public Task2_1_Accounting() {

    }

    public Task2_1_Accounting(int countOfEmployees, String departmentName) {
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

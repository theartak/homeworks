package Day19Homework.day19task3;

public class ITCompany {
    protected int countOfEmployees;
    protected String companyName;
    protected String departmentName;

    public ITCompany() {

    }

    public ITCompany(int countOfEmployees, String companyName) {
        this.countOfEmployees = countOfEmployees;
        this.companyName = companyName;
    }

    public int getCountOfEmployees() {
        return countOfEmployees;
    }

    public void setCountOfEmployees(int countOfEmployees) {
        this.countOfEmployees = countOfEmployees;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public void account() {
        System.out.println("Count of employees: " + getCountOfEmployees());
        System.out.println("Department name: " + getCompanyName());
    }
}

package Day19Homework.day19task3;

public class AccountingT3 extends ITCompany {
    protected String departmentName;

    public AccountingT3() {
    }

    public AccountingT3(String departmentName) {
        super();
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public void account() {
        System.out.println("Company name: " + getCompanyName());
        System.out.println("Count of employees: " + getCountOfEmployees());
        System.out.println("Department name: " + getDepartmentName());
    }
}

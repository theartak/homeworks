package Day19Homework;

public class Task3_3_FinancialAccount extends Task3_2_Accounting {
    private int salary;

    public Task3_3_FinancialAccount() {
    }

    public Task3_3_FinancialAccount(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void account() {
        int finalSalary = getSalary() - ((getSalary() + getTaxPercentage()) / 100);
        System.out.println("Count of employees: " + getCountOfEmployees());
        System.out.println("Department name: " + getDepartmentName());
        System.out.println("Salary: " + finalSalary);
    }
}

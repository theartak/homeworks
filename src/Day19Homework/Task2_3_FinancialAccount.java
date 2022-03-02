package Day19Homework;

public class Task2_3_FinancialAccount extends Task2_2_TaxAccounting {
    private int salary;

    public Task2_3_FinancialAccount() {
    }

    public Task2_3_FinancialAccount(int salary) {
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

package Day19Homework.day19task2;

public class FinancialAccountT2 extends TaxAccountingT2 {
    private int salary;

    public FinancialAccountT2() {
    }

    public FinancialAccountT2(int salary) {
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

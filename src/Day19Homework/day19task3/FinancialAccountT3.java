package Day19Homework.day19task3;

public class FinancialAccountT3 extends TaxAccountingT3 {
    protected int salary;

    public FinancialAccountT3() {
    }

    public FinancialAccountT3(int salary) {
        super();
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

package Day19Homework;

public class Task2_2_TaxAccounting extends Task2_1_Accounting {
    private int taxPercentage;

    public Task2_2_TaxAccounting() {
    }

    public Task2_2_TaxAccounting(int taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public int getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(int taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    @Override
    public void account() {
        System.out.println("Count of employees: " + getCountOfEmployees());
        System.out.println("Department name: " + getDepartmentName());
        System.out.println("Tax percentage: " + getTaxPercentage() + "%");
    }
}

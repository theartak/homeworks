package Day19Homework.Day19Task2;

public class TaxAccountingT2 extends AccountingT2 {
    private int taxPercentage;

    public TaxAccountingT2() {
    }

    public TaxAccountingT2(int taxPercentage) {
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

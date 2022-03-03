package Day19Homework.Day19Task3;

public class AccountingT3 extends ITCompany {
    protected int taxPercentage;

    public AccountingT3() {
    }

    public AccountingT3(int taxPercentage) {
        super();
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

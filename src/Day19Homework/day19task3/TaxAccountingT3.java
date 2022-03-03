package Day19Homework.day19task3;

public class TaxAccountingT3 extends AccountingT3 {
    protected int taxPercentage;

    public TaxAccountingT3(){

    }

    public TaxAccountingT3(int taxPercentage){
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
        System.out.println("Company name: " + getCompanyName());
        System.out.println("Count of employees: " + getCountOfEmployees());
        System.out.println("Department name: " + getDepartmentName());
        System.out.println("Tax percentage: " + getTaxPercentage() + "%");
    }
}

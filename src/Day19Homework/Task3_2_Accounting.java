package Day19Homework;

public class Task3_2_Accounting extends Task3_1_ITCompany {
    private int taxPercentage;

    public Task3_2_Accounting() {
    }

    public Task3_2_Accounting(int taxPercentage) {
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

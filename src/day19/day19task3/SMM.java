package day19.day19task3;

public class SMM extends ITCompany {
    protected String smm;

    public SMM() {
    }

    public SMM(String smm) {
        super();
        this.smm = smm;
    }

    public String getSMM() {
        return smm;
    }

    public void setSMM(String smm) {
        this.smm = smm;
    }

    public void marketing() {
        System.out.println("Count of employees: " + getCountOfEmployees());
        System.out.println("Department name: " + getDepartmentName());
        System.out.println("Marketing: " + getSMM());
    }
}

package Day19Homework;

public class Task3_5_SMM extends Task3_1_ITCompany {
    private String smm;

    public Task3_5_SMM() {
    }

    public Task3_5_SMM(String smm) {
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

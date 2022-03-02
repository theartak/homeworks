package Day19Homework;

public class Task3_4_Marketing extends Task3_1_ITCompany {
    private String marketing;

    public Task3_4_Marketing() {
    }

    public Task3_4_Marketing(String marketing) {
        this.marketing = marketing;
    }

    public String getMarketing() {
        return marketing;
    }

    public void setMarketing(String marketing) {
        this.marketing = marketing;
    }

    public void marketing() {
        System.out.println("Count of employees: " + getCountOfEmployees());
        System.out.println("Department name: " + getDepartmentName());
        System.out.println("Marketing: " + getMarketing());
    }
}

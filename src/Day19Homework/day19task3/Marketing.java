package Day19Homework.day19task3;

public class Marketing extends ITCompany {
    protected String marketing;

    public Marketing() {
    }

    public Marketing(String marketing) {
        super();
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

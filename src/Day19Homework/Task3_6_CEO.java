package Day19Homework;

public class Task3_6_CEO extends Task3_1_ITCompany {
    private String ceo;

    public Task3_6_CEO() {
    }

    public Task3_6_CEO(String ceo) {
        this.ceo = ceo;
    }

    public String getCEO() {
        return ceo;
    }

    public void setCEO(String ceo) {
        this.ceo = ceo;
    }

    public void marketing() {
        System.out.println("CEO: " + getCEO());
    }
}

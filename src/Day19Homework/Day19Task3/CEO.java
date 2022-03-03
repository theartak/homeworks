package Day19Homework.Day19Task3;

public class CEO extends ITCompany {
    protected String ceo;

    public CEO() {
    }

    public CEO(String ceo) {
        super();
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

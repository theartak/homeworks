package Day19Homework;

import javafx.concurrent.Task;

public class Main {
    public static void main(String[] args) {
        ceoClass();
    }

    public static void animalClass() {
        Task1_1_Animal a = new Task1_1_Animal();
        a.voice();
        a.eat();
    }

    public static void dogClass() {
        Task1_2_Dog d = new Task1_2_Dog();
        d.voice();
        d.eat();
    }

    public static void accountingClass1() {
        Task2_1_Accounting t = new Task2_1_Accounting();
        t.setCountOfEmployees(10);
        t.setDepartmentName("Production management");
        t.account();
    }

    public static void taxAccountingClass() {
        Task2_2_TaxAccounting t = new Task2_2_TaxAccounting();
        t.setCountOfEmployees(4);
        t.setDepartmentName("Team leads");
        t.setTaxPercentage(25);
        t.account();
    }

    public static void financialAccountingClass1() {
        Task2_3_FinancialAccount t = new Task2_3_FinancialAccount();
        t.setCountOfEmployees(6);
        t.setDepartmentName("Project management");
        t.setTaxPercentage(25);
        t.setSalary(1500);
        t.account();
    }

    public static void itCompanyClass() {
        Task3_1_ITCompany it = new Task3_1_ITCompany();
        it.setCountOfEmployees(200);
        it.setDepartmentName("Cool IT company");
        it.account();
    }

    public static void accountingClass2() {
        Task3_2_Accounting t = new Task3_2_Accounting();
        t.setCountOfEmployees(10);
        t.setDepartmentName("Production management");
        t.setTaxPercentage(25);
        t.account();
    }

    public static void financialAccountingClass2() {
        Task3_3_FinancialAccount t = new Task3_3_FinancialAccount();
        t.setCountOfEmployees(6);
        t.setDepartmentName("Project management");
        t.setTaxPercentage(25);
        t.setSalary(1500);
        t.account();
    }

    public static void marketingClass() {
        Task3_4_Marketing m = new Task3_4_Marketing();
        m.setCountOfEmployees(5);
        m.setDepartmentName("Marketing dept.");
        m.setMarketing("Social media, YouTube");
        m.marketing();
    }

    public static void smmClass() {
        Task3_5_SMM smm = new Task3_5_SMM();
        smm.setCountOfEmployees(10);
        smm.setDepartmentName("SMM dept.");
        smm.setSMM("Facebook, Twitter, Instagram");
        smm.marketing();
    }

    public static void ceoClass() {
        Task3_6_CEO ceo = new Task3_6_CEO();
        ceo.setCEO("John Smith");
        ceo.marketing();
    }
}

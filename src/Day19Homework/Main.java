package Day19Homework;

import Day19Homework.Day19Task1.Animal;
import Day19Homework.Day19Task1.Dog;
import Day19Homework.Day19Task2.AccountingT2;
import Day19Homework.Day19Task2.TaxAccountingT2;
import Day19Homework.Day19Task2.FinancialAccountT2;
import Day19Homework.Day19Task3.*;

public class Main {
    public static void main(String[] args) {
        ceoClass();
    }

    public static void animalClass() {
        Animal a = new Animal();
        a.voice();
        a.eat();
    }

    public static void dogClass() {
        Dog d = new Dog();
        d.voice();
        d.eat();
    }

    public static void accountingClass1() {
        AccountingT2 t = new AccountingT2();
        t.setCountOfEmployees(10);
        t.setDepartmentName("Production management");
        t.account();
    }

    public static void taxAccountingClass() {
        TaxAccountingT2 t = new TaxAccountingT2();
        t.setCountOfEmployees(4);
        t.setDepartmentName("Team leads");
        t.setTaxPercentage(25);
        t.account();
    }

    public static void financialAccountingClass1() {
        FinancialAccountT2 t = new FinancialAccountT2();
        t.setCountOfEmployees(6);
        t.setDepartmentName("Project management");
        t.setTaxPercentage(25);
        t.setSalary(1500);
        t.account();
    }

    public static void itCompanyClass() {
        ITCompany it = new ITCompany();
        it.setCountOfEmployees(200);
        it.setDepartmentName("Cool IT company");
        it.account();
    }

    public static void accountingClass2() {
        AccountingT3 t = new AccountingT3();
        t.setCountOfEmployees(10);
        t.setDepartmentName("Production management");
        t.setTaxPercentage(25);
        t.account();
    }

    public static void financialAccountingClass2() {
        FinancialAccountT3 t = new FinancialAccountT3();
        t.setCountOfEmployees(6);
        t.setDepartmentName("Project management");
        t.setTaxPercentage(25);
        t.setSalary(1500);
        t.account();
    }

    public static void marketingClass() {
        Marketing m = new Marketing();
        m.setCountOfEmployees(5);
        m.setDepartmentName("Marketing dept.");
        m.setMarketing("Social media, YouTube");
        m.marketing();
    }

    public static void smmClass() {
        SMM smm = new SMM();
        smm.setCountOfEmployees(10);
        smm.setDepartmentName("SMM dept.");
        smm.setSMM("Facebook, Twitter, Instagram");
        smm.marketing();
    }

    public static void ceoClass() {
        CEO ceo = new CEO();
        ceo.setCEO("John Smith");
        ceo.marketing();
    }
}

package Domain;

public class Customers {

    private int customerNumber;
    private String customerName;
    private String sureName;
    private double yearMoney;

    public Customers(int customerNumber, String customerName, String sureName, double yearMoney) {
        this.customerNumber = customerNumber;
        this.customerName = customerName;
        this.sureName = sureName;
        this.yearMoney = yearMoney;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getSureName() {
        return sureName;
    }

    public double getYearMoney() {
        return yearMoney;
    }
}

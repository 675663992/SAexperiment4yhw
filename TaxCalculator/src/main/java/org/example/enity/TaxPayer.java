package org.example.enity;

public class TaxPayer {
    private String name;
    private double income;

    // 无参数构造函数
    public TaxPayer() {
    }

    // 带参数的构造函数
    public TaxPayer(String name, double income) {
        this.name = name;
        this.income = income;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }
}

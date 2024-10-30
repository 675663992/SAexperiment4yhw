package org.example.service.impl;

import org.example.enity.TaxPayer;
import org.example.service.TaxCalculator;

import javax.jws.WebService;

@WebService(endpointInterface = "org.example.service.TaxCalculator")
public class TaxCalculatorImpl implements TaxCalculator {
    @Override
    public double calculateTax(TaxPayer taxPayer) {
        // 假设的简单计算逻辑，实际应用中需要根据当地税法进行计算
        double income = taxPayer.getIncome();
        if (income <= 3500) { // 假设3500为免税额
            System.out.println("需缴纳的税为：0元");
            return 0;
        } else {
            double inc = (income - 3500) * 0.1; // 超过部分按10%计算
            System.out.println(taxPayer.getName()+"需缴纳的税为："+inc+"元");
            return inc;
        }
    }
}

import org.example.service.impl.TaxCalculatorImpl;

import javax.xml.ws.Endpoint;

public class TaxServicePublisher {
    public static void main(String[] args) {
        // 发布 WebService
        Endpoint.publish("http://localhost:8080/taxcalculator/TaxCalculator", new TaxCalculatorImpl());
        System.out.println("Tax Calculator Web Service is published at http://localhost:8080/taxcalculator/TaxCalculator");
    }
}

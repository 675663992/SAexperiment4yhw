package org.example.service;

import org.example.enity.TaxPayer;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface TaxCalculator {
    @WebMethod
    double calculateTax(TaxPayer taxPayer);
}

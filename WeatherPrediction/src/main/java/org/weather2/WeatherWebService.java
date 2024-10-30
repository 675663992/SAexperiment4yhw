//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.weather2;

import java.net.MalformedURLException;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface WeatherWebService {
    @WebMethod
    String[] getSupportCity(String var1) throws MalformedURLException;

    @WebMethod
    String[] getSupportProvince() throws MalformedURLException;

    @WebMethod
    String[] getSupportDataSet() throws MalformedURLException;

    @WebMethod
    String[] getWeatherbyCityName(String var1) throws MalformedURLException;

    @WebMethod
    String[] getWeatherbyCityNamePro(String var1, String var2) throws MalformedURLException;
}

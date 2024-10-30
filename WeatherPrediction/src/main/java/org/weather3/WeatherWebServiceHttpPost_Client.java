package org.weather3;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public final class WeatherWebServiceHttpPost_Client {

    private static final QName SERVICE_NAME = new QName("http://WebXml.com.cn/", "WeatherWebService");

    public static void main(String args[]) throws Exception {
        URL wsdlURL = new URL("file:/E:/study/大三上/软件体系结构/实验4/WeatherWebService_1.wsdl");
        WeatherWebService service = new WeatherWebService(wsdlURL, SERVICE_NAME);
        WeatherWebServiceHttpPost port = service.getWeatherWebServiceHttpPost();

        System.out.println("Invoking getWeatherbyCityName...");
        String theCityName = "Beijing"; // Example city name
        ArrayOfString _getWeatherbyCityName__return = port.getWeatherbyCityName(theCityName);
        System.out.println("getWeatherbyCityName.result=" + _getWeatherbyCityName__return);
    }
}

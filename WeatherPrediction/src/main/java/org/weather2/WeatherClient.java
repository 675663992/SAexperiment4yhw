//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.weather2;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class WeatherClient {
    private static final String NAMESPACE = "http://WebXml.com.cn/";
    private static final String URL = "http://www.webxml.com.cn/WebServices/WeatherWebService.asmx";
    private static final QName QNAME = new QName("http://WebXml.com.cn/", "WeatherWebService");

    public WeatherClient() {
    }

    public String[] getWeatherInfo(String city) {
        try {
            URL endpointURL = new URL("http://www.webxml.com.cn/WebServices/WeatherWebService.asmx");
            Service service = Service.create(endpointURL, QNAME);
            WeatherWebService port = (WeatherWebService)service.getPort(WeatherWebService.class);
            return port.getWeatherbyCityName(city);
        } catch (Exception var5) {
            var5.printStackTrace();
            return null;
        }
    }
}

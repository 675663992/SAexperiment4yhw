
package org.weather;

import javax.xml.ws.Endpoint;

/**
 * This class was generated by Apache CXF 3.6.4
 * 2024-10-30T21:45:18.679+08:00
 * Generated source version: 3.6.4
 *
 */

public class WeatherWebServiceHttpGet_WeatherWebServiceHttpGet_Server{

    protected WeatherWebServiceHttpGet_WeatherWebServiceHttpGet_Server() throws java.lang.Exception {
        System.out.println("Starting Server");
        Object implementor = new WeatherWebServiceHttpGetImpl();
        String address = "http://www.webxml.com.cn/WebServices/WeatherWebService.asmx";
        Endpoint.publish(address, implementor);
    }

    public static void main(String args[]) throws java.lang.Exception {
        new WeatherWebServiceHttpGet_WeatherWebServiceHttpGet_Server();
        System.out.println("Server ready...");

        Thread.sleep(5 * 60 * 1000);
        System.out.println("Server exiting");
        System.exit(0);
    }
}

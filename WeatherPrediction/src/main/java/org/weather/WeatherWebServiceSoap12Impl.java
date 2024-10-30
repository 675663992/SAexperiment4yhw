
/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

package org.weather;

import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.6.4
 * 2024-10-30T21:45:18.634+08:00
 * Generated source version: 3.6.4
 *
 */

@javax.jws.WebService(
                      serviceName = "WeatherWebService",
                      portName = "WeatherWebServiceSoap12",
                      targetNamespace = "http://WebXml.com.cn/",
                      wsdlLocation = "http://www.webxml.com.cn/WebServices/WeatherWebService.asmx?wsdl",
                      endpointInterface = "org.weather.WeatherWebServiceSoap")

public class WeatherWebServiceSoap12Impl implements WeatherWebServiceSoap {

    private static final Logger LOG = Logger.getLogger(WeatherWebServiceSoap12Impl.class.getName());

    /* (non-Javadoc)
     * @see org.weather.WeatherWebServiceSoap#getSupportProvince()*
     */
    public org.weather.ArrayOfString getSupportProvince() {
        LOG.info("Executing operation getSupportProvince");
        try {
            org.weather.ArrayOfString _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.weather.WeatherWebServiceSoap#getWeatherbyCityNamePro(java.lang.String theCityName, java.lang.String theUserID)*
     */
    public org.weather.ArrayOfString getWeatherbyCityNamePro(java.lang.String theCityName, java.lang.String theUserID) {
        LOG.info("Executing operation getWeatherbyCityNamePro");
        System.out.println(theCityName);
        System.out.println(theUserID);
        try {
            org.weather.ArrayOfString _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.weather.WeatherWebServiceSoap#getSupportCity(java.lang.String byProvinceName)*
     */
    public org.weather.ArrayOfString getSupportCity(java.lang.String byProvinceName) {
        LOG.info("Executing operation getSupportCity");
        System.out.println(byProvinceName);
        try {
            org.weather.ArrayOfString _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.weather.WeatherWebServiceSoap#getSupportDataSet()*
     */
    public org.weather.GetSupportDataSetResponse.GetSupportDataSetResult getSupportDataSet() {
        LOG.info("Executing operation getSupportDataSet");
        try {
            org.weather.GetSupportDataSetResponse.GetSupportDataSetResult _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

    /* (non-Javadoc)
     * @see org.weather.WeatherWebServiceSoap#getWeatherbyCityName(java.lang.String theCityName)*
     */
    public org.weather.ArrayOfString getWeatherbyCityName(java.lang.String theCityName) {
        LOG.info("Executing operation getWeatherbyCityName");
        System.out.println(theCityName);
        try {
            org.weather.ArrayOfString _return = null;
            return _return;
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
            throw new RuntimeException(ex);
        }
    }

}
package org.weather;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * <a href="http://www.webxml.com.cn/" target="_blank">WebXml.com.cn</a> <strong>天气预报 Web 服务，数据每2.5小时左右自动更新一次，准确可靠。包括 340 多个中国主要城市和 60 多个国外主要城市三日内的天气预报数据。</br>此天气预报Web Services请不要用于任何商业目的，若有需要请<a href="http://www.webxml.com.cn/zh_cn/contact_us.aspx" target="_blank">联系我们</a>，欢迎技术交流。 QQ：8409035<br />使用本站 WEB 服务请注明或链接本站：http://www.webxml.com.cn/ 感谢大家的支持</strong>！<br /><span style="color:#999999;">通知：天气预报 WEB 服务如原来使用地址 http://www.onhap.com/WebServices/WeatherWebService.asmx 的，请改成现在使用的服务地址 http://www.webxml.com.cn/WebServices/WeatherWebService.asmx ，重新引用即可。</span><br /><br />&nbsp;
 *
 * This class was generated by Apache CXF 3.6.4
 * 2024-10-30T21:45:18.683+08:00
 * Generated source version: 3.6.4
 *
 */
@WebServiceClient(name = "WeatherWebService",
                  wsdlLocation = "http://www.webxml.com.cn/WebServices/WeatherWebService.asmx?wsdl ",
                  targetNamespace = "http://WebXml.com.cn/")
public class WeatherWebService extends Service {

    public static final URL WSDL_LOCATION;

    public static final QName SERVICE = new QName("http://WebXml.com.cn/", "WeatherWebService");
    public static final QName WeatherWebServiceSoap12 = new QName("http://WebXml.com.cn/", "WeatherWebServiceSoap12");
    public static final QName WeatherWebServiceSoap = new QName("http://WebXml.com.cn/", "WeatherWebServiceSoap");
    public static final QName WeatherWebServiceHttpGet = new QName("http://WebXml.com.cn/", "WeatherWebServiceHttpGet");
    public static final QName WeatherWebServiceHttpPost = new QName("http://WebXml.com.cn/", "WeatherWebServiceHttpPost");
    static {
        URL url = null;
        try {
            url = new URL("http://www.webxml.com.cn/WebServices/WeatherWebService.asmx?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(WeatherWebService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://www.webxml.com.cn/WebServices/WeatherWebService.asmx?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public WeatherWebService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public WeatherWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WeatherWebService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public WeatherWebService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public WeatherWebService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public WeatherWebService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns WeatherWebServiceSoap
     */
    @WebEndpoint(name = "WeatherWebServiceSoap12")
    public WeatherWebServiceSoap getWeatherWebServiceSoap12() {
        return super.getPort(WeatherWebServiceSoap12, WeatherWebServiceSoap.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WeatherWebServiceSoap
     */
    @WebEndpoint(name = "WeatherWebServiceSoap12")
    public WeatherWebServiceSoap getWeatherWebServiceSoap12(WebServiceFeature... features) {
        return super.getPort(WeatherWebServiceSoap12, WeatherWebServiceSoap.class, features);
    }


    /**
     *
     * @return
     *     returns WeatherWebServiceSoap
     */
    @WebEndpoint(name = "WeatherWebServiceSoap")
    public WeatherWebServiceSoap getWeatherWebServiceSoap() {
        return super.getPort(WeatherWebServiceSoap, WeatherWebServiceSoap.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WeatherWebServiceSoap
     */
    @WebEndpoint(name = "WeatherWebServiceSoap")
    public WeatherWebServiceSoap getWeatherWebServiceSoap(WebServiceFeature... features) {
        return super.getPort(WeatherWebServiceSoap, WeatherWebServiceSoap.class, features);
    }


    /**
     *
     * @return
     *     returns WeatherWebServiceHttpGet
     */
    @WebEndpoint(name = "WeatherWebServiceHttpGet")
    public WeatherWebServiceHttpGet getWeatherWebServiceHttpGet() {
        return super.getPort(WeatherWebServiceHttpGet, WeatherWebServiceHttpGet.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WeatherWebServiceHttpGet
     */
    @WebEndpoint(name = "WeatherWebServiceHttpGet")
    public WeatherWebServiceHttpGet getWeatherWebServiceHttpGet(WebServiceFeature... features) {
        return super.getPort(WeatherWebServiceHttpGet, WeatherWebServiceHttpGet.class, features);
    }


    /**
     *
     * @return
     *     returns WeatherWebServiceHttpPost
     */
    @WebEndpoint(name = "WeatherWebServiceHttpPost")
    public WeatherWebServiceHttpPost getWeatherWebServiceHttpPost() {
        return super.getPort(WeatherWebServiceHttpPost, WeatherWebServiceHttpPost.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WeatherWebServiceHttpPost
     */
    @WebEndpoint(name = "WeatherWebServiceHttpPost")
    public WeatherWebServiceHttpPost getWeatherWebServiceHttpPost(WebServiceFeature... features) {
        return super.getPort(WeatherWebServiceHttpPost, WeatherWebServiceHttpPost.class, features);
    }

}

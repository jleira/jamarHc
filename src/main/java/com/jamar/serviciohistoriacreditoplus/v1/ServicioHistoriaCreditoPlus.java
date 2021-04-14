
package com.jamar.serviciohistoriacreditoplus.v1;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServicioHistoriaCreditoPlus", targetNamespace = "http://www.datacredito.com.co/services/serviciohistoriacreditoplus/v1", wsdlLocation = "file:/Users/jleira/Desktop/DHServicePlus.wsdl")
public class ServicioHistoriaCreditoPlus
    extends Service
{

    private final static URL SERVICIOHISTORIACREDITOPLUS_WSDL_LOCATION;
    private final static WebServiceException SERVICIOHISTORIACREDITOPLUS_EXCEPTION;
    private final static QName SERVICIOHISTORIACREDITOPLUS_QNAME = new QName("http://www.datacredito.com.co/services/serviciohistoriacreditoplus/v1", "ServicioHistoriaCreditoPlus");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/Users/jleira/Desktop/DHServicePlus.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICIOHISTORIACREDITOPLUS_WSDL_LOCATION = url;
        SERVICIOHISTORIACREDITOPLUS_EXCEPTION = e;
    }

    public ServicioHistoriaCreditoPlus() {
        super(__getWsdlLocation(), SERVICIOHISTORIACREDITOPLUS_QNAME);
    }

    public ServicioHistoriaCreditoPlus(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICIOHISTORIACREDITOPLUS_QNAME, features);
    }

    public ServicioHistoriaCreditoPlus(URL wsdlLocation) {
        super(wsdlLocation, SERVICIOHISTORIACREDITOPLUS_QNAME);
    }

    public ServicioHistoriaCreditoPlus(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICIOHISTORIACREDITOPLUS_QNAME, features);
    }

    public ServicioHistoriaCreditoPlus(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicioHistoriaCreditoPlus(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns HC2PNJService
     */
    @WebEndpoint(name = "ServicioHistoriaCreditoPlus.dmz.https")
    public HC2PNJService getServicioHistoriaCreditoPlusDmzHttps() {
        return super.getPort(new QName("http://www.datacredito.com.co/services/serviciohistoriacreditoplus/v1", "ServicioHistoriaCreditoPlus.dmz.https"), HC2PNJService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HC2PNJService
     */
    @WebEndpoint(name = "ServicioHistoriaCreditoPlus.dmz.https")
    public HC2PNJService getServicioHistoriaCreditoPlusDmzHttps(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.datacredito.com.co/services/serviciohistoriacreditoplus/v1", "ServicioHistoriaCreditoPlus.dmz.https"), HC2PNJService.class, features);
    }

    /**
     * 
     * @return
     *     returns HC2PNJService
     */
    @WebEndpoint(name = "ServicioHistoriaCreditoPlus.wan.http")
    public HC2PNJService getServicioHistoriaCreditoPlusWanHttp() {
        return super.getPort(new QName("http://www.datacredito.com.co/services/serviciohistoriacreditoplus/v1", "ServicioHistoriaCreditoPlus.wan.http"), HC2PNJService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HC2PNJService
     */
    @WebEndpoint(name = "ServicioHistoriaCreditoPlus.wan.http")
    public HC2PNJService getServicioHistoriaCreditoPlusWanHttp(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.datacredito.com.co/services/serviciohistoriacreditoplus/v1", "ServicioHistoriaCreditoPlus.wan.http"), HC2PNJService.class, features);
    }

    /**
     * 
     * @return
     *     returns HC2PNJService
     */
    @WebEndpoint(name = "ServicioHistoriaCreditoPlus.wan.https")
    public HC2PNJService getServicioHistoriaCreditoPlusWanHttps() {
        return super.getPort(new QName("http://www.datacredito.com.co/services/serviciohistoriacreditoplus/v1", "ServicioHistoriaCreditoPlus.wan.https"), HC2PNJService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HC2PNJService
     */
    @WebEndpoint(name = "ServicioHistoriaCreditoPlus.wan.https")
    public HC2PNJService getServicioHistoriaCreditoPlusWanHttps(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.datacredito.com.co/services/serviciohistoriacreditoplus/v1", "ServicioHistoriaCreditoPlus.wan.https"), HC2PNJService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICIOHISTORIACREDITOPLUS_EXCEPTION!= null) {
            throw SERVICIOHISTORIACREDITOPLUS_EXCEPTION;
        }
        return SERVICIOHISTORIACREDITOPLUS_WSDL_LOCATION;
    }

}


package com.jamar.serviciohistoriacreditoplus.v1;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import com.dc.hc2.ws.v1.ObjectFactory;
import com.dc.hc2.ws.v1.SolicitudPlus;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "HC2PNJService", targetNamespace = "http://www.datacredito.com.co/services/serviciohistoriacreditoplus/v1")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface HC2PNJService {


    /**
     * 
     * @param solicitud
     * @return
     *     returns java.lang.String
     * @throws HC2PNJException
     */
    @WebMethod
    @WebResult(name = "consultarHC2Return", targetNamespace = "http://ws.hc2.dc.com/v1")
    @RequestWrapper(localName = "consultarHC2", targetNamespace = "http://ws.hc2.dc.com/v1", className = "com.dc.hc2.ws.v1.HistoriaCreditoPlus")
    @ResponseWrapper(localName = "consultarHC2Response", targetNamespace = "http://ws.hc2.dc.com/v1", className = "com.dc.hc2.ws.v1.ConsultarHC2Response")
    public String consultarHC2(
        @WebParam(name = "solicitud", targetNamespace = "http://ws.hc2.dc.com/v1")
        SolicitudPlus solicitud)
        throws HC2PNJException
    ;

    /**
     * 
     * @param solicitud
     * @return
     *     returns java.lang.String
     * @throws HC2PNJException
     */
    @WebMethod
    @WebResult(name = "consultarHC2PJReturn", targetNamespace = "http://ws.hc2.dc.com/v1")
    @RequestWrapper(localName = "consultarHC2PJ", targetNamespace = "http://ws.hc2.dc.com/v1", className = "com.dc.hc2.ws.v1.HistoriaCreditoPlusPJ")
    @ResponseWrapper(localName = "consultarHC2PJResponse", targetNamespace = "http://ws.hc2.dc.com/v1", className = "com.dc.hc2.ws.v1.ConsultarHC2PJResponse")
    public String consultarHC2PJ(
        @WebParam(name = "solicitud", targetNamespace = "http://ws.hc2.dc.com/v1")
        SolicitudPlus solicitud)
        throws HC2PNJException
    ;

}

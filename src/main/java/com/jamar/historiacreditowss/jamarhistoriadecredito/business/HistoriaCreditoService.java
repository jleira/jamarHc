/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jamar.historiacreditowss.jamarhistoriadecredito.business;

import com.dc.hc2.ws.v1.Parametro;
import com.dc.hc2.ws.v1.Parametros;
import com.dc.hc2.ws.v1.SolicitudPlus;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.jamar.hc.ClientPasswordCallback;
import static com.jamar.hc.Constants.KEY_IDENTIFIER_TYPE;
import com.jamar.historiacreditowss.jamarhistoriadecredito.entities.DatAuditoria;
import com.jamar.historiacreditowss.jamarhistoriadecredito.generics.Informes;
import com.jamar.historiacreditowss.jamarhistoriadecredito.pojo.Mensaje;
import com.jamar.historiacreditowss.jamarhistoriadecredito.pojo.Solicitud;

//import utils.system;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.StringReader;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import com.jamar.historiacreditowss.jamarhistoriadecredito.dto.DictumSolicitud;
import com.jamar.historiacreditowss.jamarhistoriadecredito.dto.HistoriaSolicitud;
import com.jamar.historiacreditowss.jamarhistoriadecredito.entities.DatInforme;
import com.jamar.historiacreditowss.jamarhistoriadecredito.entities.DatPreselecta;
import com.jamar.historiacreditowss.jamarhistoriadecredito.helpers.HistoriaCreditoHelper;
import com.jamar.serviciohistoriacreditoplus.v1.HC2PNJException;
import com.jamar.serviciohistoriacreditoplus.v1.HC2PNJService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.cxf.configuration.jsse.TLSClientParameters;
import org.apache.cxf.ext.logging.LoggingInInterceptor;
import org.apache.cxf.ext.logging.LoggingOutInterceptor;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.transport.http.HTTPConduit;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;
import org.apache.wss4j.dom.WSConstants;
import org.apache.wss4j.dom.handler.WSHandlerConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

@Service
public class HistoriaCreditoService {

    
    @Autowired
    private HistoriaCreditoJPA historiaCreditoJpa;
    
    public HistoriaCreditoService() {
    }
    
    public String dictum(DictumSolicitud jsonParams) {
        System.out.println(" Params " +  new Gson().toJson(jsonParams));
        Mensaje msg = new Mensaje();
        
        JsonObject jsonResult = HistoriaCreditoHelper.dataValidateConsumodictum(jsonParams);
        if (jsonResult.get("success").getAsBoolean()) {

            Solicitud payload = new Solicitud();

            payload.setEmpresa(jsonParams.getcEmp());
            payload.setOrigen(jsonParams.getOrigen());
            payload.setProducto(jsonParams.getProducto());
            payload.setTipoIdentificacion(jsonParams.getTipoIdentificacion());
            payload.setIdentificacion(jsonParams.getIdentificacion());
            payload.setUsuario(jsonParams.getUsuario());
            payload.setClave(jsonParams.getClave());
            payload.setPrimerApellido(jsonParams.getPrimerApellido());
            payload.setSTRAID(jsonParams.getsTraId());
            payload.setSTRNAM(jsonParams.getsTrNam());
            payload.setFR_INGRESO(jsonParams.getFrIngreso());
            payload.setFR_TASA_USURA(jsonParams.getFrTasaUsura());
            payload.setFR_SEGMENTO_1(jsonParams.getFrSegmento1());
            payload.setFR_FORMATO(jsonParams.getFrFormato());
            payload.setENDPOINT(jsonParams.getUrlSoapService());

            try {
                if (jsonResult.get("success").getAsBoolean()) {
                    msg = consultarInformacion(payload);
                    if (msg.getCode().equals("000")) {
                        jsonResult.addProperty("success", true);
                        jsonResult.addProperty("code", msg.getCode());
                        jsonResult.addProperty("message", msg.getDescription());
                        jsonResult.addProperty("id_preselecta", msg.getId_preselecta());
                        jsonResult.addProperty("id_informe", msg.getId_informe());
                        jsonResult.addProperty("id_dictum", msg.getArbolesdictom());
                    } else {
                        jsonResult.addProperty("success", false);
                        jsonResult.addProperty("code", msg.getCode());
                        jsonResult.addProperty("message", msg.getDescription());
                    }
                }
                return jsonResult.toString();

            } catch (Exception e) {
                msg.setCode("999");
                msg.setDescription(e.getMessage());
                msg.setResponse(false);
                jsonResult.addProperty("success", false);
                jsonResult.addProperty("code", msg.getCode());
                jsonResult.addProperty("message", msg.getDescription());

                return jsonResult.toString();
            }
        }

        return jsonResult.toString();
    }
    
    public String consultar(HistoriaSolicitud jsonParams) {

        Mensaje msg = new Mensaje();
        JsonObject jsonResult = HistoriaCreditoHelper.dataValidateConsumohistoria(jsonParams);
        if (jsonResult.get("success").getAsBoolean()) {

            Solicitud payload = new Solicitud();


            payload.setEmpresa(jsonParams.getC_emp());
            payload.setOrigen(jsonParams.getOrigen());
            payload.setProducto(jsonParams.getProducto());
            payload.setTipoIdentificacion(jsonParams.getTipoIdentificacion());
            payload.setIdentificacion(jsonParams.getIdentificacion());
            payload.setUsuario(jsonParams.getUsuario());
            payload.setClave(jsonParams.getClave());
            payload.setPrimerApellido(jsonParams.getPrimerApellido());
            payload.setENDPOINT(jsonParams.getURLSOAPSERVICE());

            
            try {

                if (jsonResult.get("success").getAsBoolean()) {
                    msg = consultarInformacion(payload);
                    if (msg.getCode().equals("000")) {
                        jsonResult.addProperty("success", true);
                        jsonResult.addProperty("code", msg.getCode());
                        jsonResult.addProperty("message", msg.getDescription());
                        jsonResult.addProperty("id_preselecta", msg.getId_preselecta());
                        jsonResult.addProperty("id_informe", msg.getId_informe());
                        jsonResult.addProperty("id_dictum", msg.getArbolesdictom());
                    } else {
                        jsonResult.addProperty("success", false);
                        jsonResult.addProperty("code", msg.getCode());
                        jsonResult.addProperty("message", msg.getDescription());

                    }

                }
                return jsonResult.toString();

            } catch (Exception e) {
                msg.setCode("999");
                msg.setDescription(e.getMessage());
                msg.setResponse(false);
                jsonResult.addProperty("success", false);
                jsonResult.addProperty("code", msg.getCode());
                jsonResult.addProperty("message", msg.getDescription());

                return jsonResult.toString();
            }
        }

        return jsonResult.toString();
    }
   
    public Mensaje consultarInformacion(Solicitud solicitud) {
        Mensaje mensaje = new Mensaje();
        Informes informesType;
        DatAuditoria auditoria = getAuditoriaFromServiceRequest(solicitud);
        try {
            historiaCreditoJpa.create(auditoria);
        } catch (Exception ex) {
            Logger.getLogger(HistoriaCreditoService.class.getName()).log(Level.SEVERE, null, ex);
            mensaje.setCode("999");
            mensaje.setDescription(ex.getMessage());
            mensaje.setResponse(false);
            return mensaje;
        }
        try {
           
            informesType = getInformesFromService(solicitud);
            if (informesType != null && informesType.getInforme() != null && informesType.getInforme().size() > 0) {
            	HistoriaCreditoWrapper wrapper = new HistoriaCreditoWrapper();
                List<DatInforme> informes = wrapper.getInformesFromServiceResponse(informesType, solicitud.getEmpresa());

                for (DatInforme informe : informes) {
                    historiaCreditoJpa.create(informe);
                    mensaje.setId_informe(informe.getId());
                    if(informe.getDatArbolesDictum().isEmpty()) {
                        mensaje.setArbolesdictom(null);
                    }else {
                        mensaje.setArbolesdictom(informe.getDatArbolesDictum().get(0).getId());                    	
                    }

                }
 
                DatPreselecta preselecta =wrapper.getInformesFromServiceResponsePreselecta(informesType, solicitud.getEmpresa());
                if(preselecta.getcEmp()!=null) {
                    historiaCreditoJpa.create(preselecta,auditoria);
                    mensaje.setId_preselecta(preselecta.getId());
                }else {
                    mensaje.setId_preselecta((long) 0);
                }

                mensaje.setCode("000");
                mensaje.setDescription("Historia de Credito creada");
                mensaje.setResponse(true);
            } else {
                mensaje.setCode("111");
                mensaje.setDescription("No se encontraron datos");
                mensaje.setResponse(true);
            }

        } catch (Exception e) {
            mensaje.setCode("999");
            mensaje.setDescription(e.getMessage());
            mensaje.setResponse(false);
        } finally {
            try {
//                entityManager.flush();
//                entityManager.close();
            } catch (Exception ex) {
                Logger.getLogger(HistoriaCreditoService.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return mensaje; 
    }
    
    public static Informes getInformesFromXMLFile(String path) {
        Informes informes = new Informes();
        try {
            File file = new File(path);
            JAXBContext jaxbContext = JAXBContext.newInstance(Informes.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            informes = (Informes) jaxbUnmarshaller.unmarshal(file);
        } catch (JAXBException ex) {
            Logger.getLogger(HistoriaCreditoService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return informes;
    }
    
    public static Informes getInformesFromService(Solicitud payload) throws RemoteException, JAXBException, Exception {
          
        String response = consumirHC(payload);        
        JAXBContext jaxbContext = JAXBContext.newInstance(Informes.class);
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
        StringReader reader = new StringReader(response);
        Informes informes = (Informes) jaxbUnmarshaller.unmarshal(reader);
        return informes;
    }

    public DatAuditoria getAuditoriaFromServiceRequest(Solicitud solicitud) {
        DatAuditoria auditoria = new DatAuditoria();
        auditoria.setCEmp(solicitud.getEmpresa());
        auditoria.setOrigen(solicitud.getOrigen());
        auditoria.setNumeroIdentificacion(solicitud.getIdentificacion());
        auditoria.setUsuario(solicitud.getUsuario());
        auditoria.setTipoIdentificacion(solicitud.getTipoIdentificacion() + "");
        auditoria.setPrimerApellido(solicitud.getPrimerApellido());
        return auditoria;
    }
    
    public static String consumirHC(Solicitud payload) throws HC2PNJException, FileNotFoundException {
        //String propertistring = "/u01/ssl/certificate/datacredito/hc/crypto.properties";
        String propertistring = ResourceUtils.getFile("classpath:crypto/crypto.properties").getAbsolutePath();

        JaxWsProxyFactoryBean wsProxyFactoryBean = new JaxWsProxyFactoryBean();
        //        wsProxyFactoryBean.setAddress("https://demo-servicesesb.datacredito.com.co:443/wss/dhws3/services/DHServicePlus");

        wsProxyFactoryBean.setAddress(payload.getENDPOINT());
        wsProxyFactoryBean.setServiceClass(HC2PNJService.class);
        Object client = wsProxyFactoryBean.create();

        // Loggers parar mostrar en consola la entrada y salida de la conexión con el
        // servicio web
        LoggingInInterceptor loggingInInterceptor = new LoggingInInterceptor();
        LoggingOutInterceptor loggingOutInterceptor = new LoggingOutInterceptor();
        loggingInInterceptor.setPrettyLogging(false);
        loggingOutInterceptor.setPrettyLogging(false);

        ClientProxy.getClient(client).getInInterceptors().add(loggingInInterceptor);
        ClientProxy.getClient(client).getOutInterceptors().add(loggingOutInterceptor);
        // WS-Security properties
        Map<String, Object> propsOut = new HashMap<>();
        propsOut.put(WSHandlerConstants.USER, "2-900461448.001");

//        propsOut.put(WSHandlerConstants.USER, payload.getUsuario());
        propsOut.put(WSHandlerConstants.ACTION, WSHandlerConstants.USERNAME_TOKEN + " "
                + WSHandlerConstants.TIMESTAMP + " " + WSHandlerConstants.SIGNATURE);
        propsOut.put(WSHandlerConstants.SIG_PROP_FILE, propertistring);
        propsOut.put(WSHandlerConstants.SIGNATURE_USER, "1");//deberia ser mueblesjamar
        propsOut.put(WSHandlerConstants.ADD_USERNAMETOKEN_NONCE, "true");
        propsOut.put(WSHandlerConstants.ADD_USERNAMETOKEN_CREATED, "true");
        propsOut.put(WSHandlerConstants.MUST_UNDERSTAND, "false");
        propsOut.put(WSHandlerConstants.SIGNATURE_PARTS, "{Content}{http://schemas.xmlsoap.org/soap/envelope/}Body;"
                + "{Content}{http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd}UsernameToken;"
                + "{Content}{http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd}Timestamp;");
        propsOut.put(WSHandlerConstants.SIG_KEY_ID, KEY_IDENTIFIER_TYPE);
        propsOut.put(WSHandlerConstants.SIG_ALGO, "http://www.w3.org/2000/09/xmldsig#rsa-sha1");
        propsOut.put(WSHandlerConstants.PASSWORD_TYPE, WSConstants.PW_TEXT);
        propsOut.put(WSHandlerConstants.PW_CALLBACK_REF, new ClientPasswordCallback());

        WSS4JOutInterceptor wss4jOutInterceptor = new WSS4JOutInterceptor(propsOut);
        ClientProxy.getClient(client).getOutInterceptors().add(wss4jOutInterceptor);

        TLSClientParameters tlsCP = new TLSClientParameters();
        tlsCP.setDisableCNCheck(true);

        HTTPConduit httpConduit = (HTTPConduit) ClientProxy.getClient(client).getConduit();
        httpConduit.setTlsClientParameters(tlsCP);

        SolicitudPlus serviceparams = new SolicitudPlus();

        if (payload.getFR_FORMATO() != null) {
            Parametro parametro = new Parametro();
            parametro.setNombre("STRAID");
            parametro.setTipo("T");
            parametro.setValor(payload.getSTRAID());

            Parametro parametro2 = new Parametro();
            parametro2.setNombre("STRNAM");
            parametro2.setTipo("T");
            parametro2.setValor(payload.getSTRNAM());

            Parametro parametro3 = new Parametro();
            parametro3.setNombre("FR_INGRESO");
            parametro3.setTipo("T");
            parametro3.setValor(payload.getFR_INGRESO());

            Parametro parametro4 = new Parametro();
            parametro4.setNombre("FR_TASA_USURA");
            parametro4.setTipo("T");
            parametro4.setValor(payload.getFR_TASA_USURA());

            Parametro parametro5 = new Parametro();
            parametro5.setNombre("FR_SEGMENTO_1");
            parametro5.setTipo("T");
            parametro5.setValor(payload.getFR_SEGMENTO_1());

            Parametro parametro6 = new Parametro();
            parametro6.setNombre("FR_FORMATO");
            parametro6.setTipo("T");
            parametro6.setValor(payload.getFR_FORMATO());

            Parametros parametros = new Parametros();
            parametros.getParametro().add(parametro);
            parametros.getParametro().add(parametro2);
            parametros.getParametro().add(parametro3);
            parametros.getParametro().add(parametro4);
            parametros.getParametro().add(parametro5);
            parametros.getParametro().add(parametro6);
            serviceparams.setParametros(parametros);
        }
        serviceparams.setClave(payload.getClave());
        serviceparams.setIdentificacion(payload.getIdentificacion());
        serviceparams.setPrimerApellido(payload.getPrimerApellido());
        serviceparams.setProducto(payload.getProducto());
        serviceparams.setTipoIdentificacion(Integer.toString(payload.getTipoIdentificacion()));
        serviceparams.setUsuario(payload.getUsuario());

        /*        Parametro parametro = new Parametro();
        parametro.setNombre("STRAID");
        parametro.setTipo("T");
        parametro.setValor(jsonParams.get("STRAID").getAsString());//"24896"

        Parametro parametro2 = new Parametro();
        parametro2.setNombre("STRNAM");
        parametro2.setTipo("T");
        parametro2.setValor(jsonParams.get("STRNAM").getAsString());//"Preselecta_Credijamar"

        Parametro parametro3 = new Parametro();
        parametro3.setNombre("INGRESO");
        parametro3.setTipo("T");
        parametro3.setValor(jsonParams.get("INGRESO").getAsString());//5000000

        Parametro parametro4 = new Parametro();
        parametro4.setNombre("NOMBRE_PRODUCTO");
        parametro4.setTipo("T");
        parametro4.setValor(jsonParams.get("NOMBRE_PRODUCTO").getAsString());//CREDIYA

        Parametros parametros = new Parametros();
        parametros.getParametro().add(parametro);
        parametros.getParametro().add(parametro2);
        parametros.getParametro().add(parametro3);
        parametros.getParametro().add(parametro4);*/
//        System.out.println(jsonParams);
        HC2PNJService mService = (HC2PNJService) client;
        return mService.consultarHC2(serviceparams);
    }
    
}

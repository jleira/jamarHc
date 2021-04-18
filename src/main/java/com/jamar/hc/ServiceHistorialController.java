package com.jamar.hc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jamar.historiacreditowss.jamarhistoriadecredito.business.HistoriaCreditoService;
import com.jamar.historiacreditowss.jamarhistoriadecredito.dto.DictumSolicitud;
import com.jamar.historiacreditowss.jamarhistoriadecredito.dto.HistoriaSolicitud;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

@RequestMapping("hc")
@RestController
public class ServiceHistorialController {
    
    private static Logger LOGGER = LoggerFactory.getLogger(ServiceHistorialController.class);

    
    @Autowired
    private HistoriaCreditoService business;

    static {
        try {

            System.out.println( ResourceUtils.getFile("classpath:certificate/mueblesjamar.com.co.p12").getAbsolutePath());
            System.setProperty("javax.net.ssl.keyStore",
                    ResourceUtils.getFile("classpath:certificate/mueblesjamar.com.co.p12").getAbsolutePath());
            //System.setProperty("javax.net.ssl.keyStore", "/u01/ssl/certificate/datacredito/hc/mueblesjamar.com.co.p12");

            System.setProperty("javax.net.ssl.keyStoreType", "pkcs12");
            System.setProperty("javax.net.ssl.keyStorePassword", "Jamar01");
        } catch (Exception e) {
            LOGGER.error("ServiceHistorialController","The properties can not be loaded: " + e.getMessage());
        }
    }

    @PostMapping(
            value = "historia"
    )
    public String consultar(@RequestBody HistoriaSolicitud jsonParams, HttpServletRequest request) {
        System.out.println(request);
        return business.consultar(jsonParams);
    }

    @PostMapping(
            value = "dictum"
    )
    public String dictum(@RequestBody DictumSolicitud jsonParams, HttpServletRequest request) throws IOException {
        System.out.println(request);
        System.out.println(new ObjectMapper().writeValueAsString(jsonParams));
        return business.dictum(jsonParams);
    }
    

}

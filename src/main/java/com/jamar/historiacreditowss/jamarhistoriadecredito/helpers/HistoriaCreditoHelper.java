/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jamar.historiacreditowss.jamarhistoriadecredito.helpers;

import com.google.gson.JsonObject;
import com.jamar.historiacreditowss.jamarhistoriadecredito.dto.DictumSolicitud;
import com.jamar.historiacreditowss.jamarhistoriadecredito.dto.HistoriaSolicitud;
import java.util.ArrayList;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author jleira
 */
public class HistoriaCreditoHelper {
    
    private static Logger LOGGER = LoggerFactory.getLogger(HistoriaCreditoHelper.class);
    
    public static JsonObject dataValidateConsumodictum(DictumSolicitud jsonData) {
        JsonObject jsonResult = new JsonObject();
        ArrayList<String> errors = new ArrayList<String>();
        String errorString = "";
        Boolean success = true;

        try {
            // Se agregan los campos obligatorios para la peticion de la operacion
            if (jsonData.getcEmp() == null || jsonData.getcEmp().equals("")) {
                success = false;
                errors.add("Entidad es requerida");
            }
            if (jsonData.getOrigen() == null || jsonData.getOrigen().equals("")) {
                success = false;
                errors.add("origen es requerida");
            }

            if (jsonData.getClave() == null || jsonData.getClave().equals("")) {
                success = false;
                errors.add("clave es requerida");
            }
            if (jsonData.getIdentificacion() == null || jsonData.getIdentificacion().equals("")) {
                success = false;
                errors.add("identificacion es requerida");
            }

            if (jsonData.getPrimerApellido() == null || jsonData.getPrimerApellido().equals("")) {
                success = false;
                errors.add("primerApellido es requerida");
            }
            jsonResult.addProperty("success", success);
            jsonResult.addProperty("errors", errors.toString());
        }  catch (Exception e) {
            LOGGER.error("dataValidateConsumodictum",e);
            jsonResult.addProperty("success", false);
            jsonResult.addProperty("errors", e.getMessage());
        }

        return jsonResult;
    }
    
    public static JsonObject dataValidateConsumohistoria(HistoriaSolicitud jsonData) {
        JsonObject jsonResult = new JsonObject();
        ArrayList<String> errors = new ArrayList<String>();
        String errorString = "";
        Boolean success = true;

        try {
            // Se agregan los campos obligatorios para la peticion de la operacion
            if (jsonData.getC_emp() == null || jsonData.getC_emp().equals("")) {
                success = false;
                errors.add("Entidad es requerida");
            }
            if (jsonData.getOrigen() == null || jsonData.getOrigen().equals("")) {
                success = false;
                errors.add("origen es requerida");
            }

            if (jsonData.getClave() == null || jsonData.getClave().equals("")) {
                success = false;
                errors.add("clave es requerida");
            }
            if (jsonData.getIdentificacion() == null || jsonData.getIdentificacion().equals("")) {
                success = false;
                errors.add("identificacion es requerida");
            }

            if (jsonData.getPrimerApellido() == null || jsonData.getPrimerApellido().equals("")) {
                success = false;
                errors.add("primerApellido es requerida");
            }
            jsonResult.addProperty("success", success);
            jsonResult.addProperty("errors", errors.toString());
        }  catch (Exception e) {
            LOGGER.error("dataValidateConsumodictum",e);
            jsonResult.addProperty("success", false);
            jsonResult.addProperty("errors", e.getMessage());
        }

        return jsonResult;
    }
    
}

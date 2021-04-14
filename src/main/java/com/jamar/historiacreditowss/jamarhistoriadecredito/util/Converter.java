/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jamar.historiacreditowss.jamarhistoriadecredito.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Ruthford Jay Archbold
 * @since 2020-10-19
 * @version 3.0
 */
public class Converter {

    public static String trimLongString(String value) {
        try {
            return value.trim();
        } catch (Exception e) {
            return null;
        }
    }

    public static Integer convertStringToInteger(String value) {
        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static Long convertStringToLong(String value) {
        try {
            return Long.parseLong(value);
        } catch (NumberFormatException e) {
            return null;
        }
    }

    public static Boolean convertStringToBoolean(String value) {
        try {
            return Boolean.parseBoolean(value);
        } catch (Exception e) {
            return null;
        }
    }

    public static String convertBooleanToChar(Boolean bool) {
        if (bool) {
            return "V";
        } else {
            return "F";
        }
    }

    public static java.util.Date convertToDate(javax.xml.datatype.XMLGregorianCalendar calendar) {
        if (calendar == null) {
            return null;
        }
        return new java.util.Date(calendar.toGregorianCalendar().getTimeInMillis());
    }

    public static java.util.Date convertStringToDate(String value) {
        SimpleDateFormat sdf;
        try {
            sdf = new SimpleDateFormat("yyyy-MM-dd");
            return sdf.parse(value);
        } catch (ParseException e1) {
            try {
                sdf = new SimpleDateFormat("dd/MM/yyyy");
                return sdf.parse(value);
            } catch (ParseException e2) {
                try {
                    sdf = new SimpleDateFormat("yyyy/MM/dd");
                    return sdf.parse(value);
                } catch (ParseException e3) {
                    return null;
                }
            }
        }
    }
}

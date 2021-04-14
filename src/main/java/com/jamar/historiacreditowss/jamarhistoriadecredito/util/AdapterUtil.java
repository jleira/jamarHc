/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jamar.historiacreditowss.jamarhistoriadecredito.util;

import java.util.Date;
import javax.xml.datatype.XMLGregorianCalendar;

/**
 *
 * @author Ruthford Jay Archbold
 * @since 2020-10-19
 * @version 3.0
 */
public class AdapterUtil {

    public static String getCharFromBoolean(Boolean bool) {
        if (bool) {
            return "V";
        } else {
            return "F";
        }
    }

    public static Date toDate(XMLGregorianCalendar calendar) {
        if (calendar == null) {
            return null;
        }
        return new Date(calendar.toGregorianCalendar().getTimeInMillis());
    }
}

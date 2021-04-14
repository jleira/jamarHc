/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jamar.historiacreditowss.jamarhistoriadecredito.util;

/**
 *
 * @author Ruthford Jay Archbold
 * @since 2020-10-19
 * @version 3.0
 */
public class Validator {

    public static boolean isNullOrEmpty(String value) {
        return value == null || value.trim().equals("");
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.util;

/**
 *
 * @author ayaduwanshi
 */
public class WebUtil {

    public static boolean isEmpty(String param) {
        if((param == null) || (param.trim().equals(""))) {
            return true;
        } else {
            return false;
        }
    }

    public static String trimParam(String param) {
        if(isEmpty(param)) {
            return null;
        } else {
            return param.trim();
        }
    }
}

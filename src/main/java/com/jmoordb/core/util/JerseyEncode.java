/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jmoordb.core.util;
import org.glassfish.jersey.uri.UriComponent;
/**
 *
 * @author avbravo
 */
public class JerseyEncode {
        // <editor-fold defaultstate="collapsed" desc="String encodeJson(String query)" >

    public static String encodeJson(String query) {
        try {

            return UriComponent.encode(query, UriComponent.Type.QUERY_PARAM_SPACE_ENCODED);
        } catch (Exception e) {
            MessagesUtil.error(MessagesUtil.nameOfClassAndMethod() + "error: " + e.getLocalizedMessage());
        }
        return query;

    }
    // </editor-fold>
}

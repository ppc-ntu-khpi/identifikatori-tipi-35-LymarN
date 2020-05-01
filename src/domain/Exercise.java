/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.math.BigInteger;
import java.security.MessageDigest;

/**
 *
 * @author Надюха
 */
public class Exercise {
    /**
     * Encoding a string of text into a hash code
     * @param text text to encode
     * @return hash code
     */
    public static String Hash(final String text) {
        try 
        {
            MessageDigest m = MessageDigest.getInstance("MD5");
            m.update(text.getBytes(), 0, text.length()); 
            final BigInteger hash = new BigInteger(1, m.digest()); 
            return String.format("%1$032X", hash); 
        } 
        catch (Exception e) 
        {
            return null;
        }
    }
}


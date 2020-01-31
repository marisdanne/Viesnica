/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.regex.*;

/**
 *
 * @author user
 */
public class Validator {
    
    public static boolean isName(String str){      
        Pattern p = Pattern.compile("[a-zA-Z]+");
        Matcher m = p.matcher(str);
        
        return m.matches() && str.length() >= 3;
    }
    
}

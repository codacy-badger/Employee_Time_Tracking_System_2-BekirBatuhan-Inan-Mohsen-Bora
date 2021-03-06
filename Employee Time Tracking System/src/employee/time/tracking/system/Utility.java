/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.time.tracking.system;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author InanEvin
 */
public class Utility
{
    static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
     
    public static boolean validateEmail(String email)
    {
       Matcher matcher = VALID_EMAIL_ADDRESS_REGEX .matcher(email);
       return matcher.find();
    }
}

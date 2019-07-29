/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trying.io;

import java.util.HashMap;

/**
 *This class for dealing with the typed characters  written by the user and list of errors from the GUI application
 * there is a a method for initialize the member variables , set and get the value of each member variable 
 * method for counts number of words per minute  and  listing the errors .
 * @author majd1
 */
public class BasicClass {
    
    // member variable that store uncorrected character  as "key" and number of errors for each as "value"
    private HashMap<Character,Integer> charErrors;
    
    //member varible that stores number of all typed characters which needed for calculate number of words per minute and display in the result form
    private int numberOfTypedChars;
    
    // member variable that stores number of uncorrected characters needed for calculate number of words per minute  and display in the result form
    private int numberOfUncorrectChars;
}

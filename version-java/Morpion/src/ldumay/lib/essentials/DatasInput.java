/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ldumay.lib.essentials;

import java.util.Scanner;

/**
 *
 * @author ldumay
 */

/**
 * Class - DatasInput
 * <br/>
 * <br/>
 * <br/>Constructor :
 * <br/>- String -> enteredData
 * <br/>
 * <br/>
 * <br/>Functions :
 * <br/>- getDatasUser(String "messageInserted")
 * <br/>|--> change value -> enteredData
 * <br/>
 * <br/>
 * <br/>End.
 */
public class DatasInput {
    
    public String enteredData;
    
    /**
     * This method asks the user to enter a value and save it in the class.
     * 
     * @param message - type String
     * @return enteredData - type String
     */
    public void getDatasUser(String message){
        System.out.println(message);
        Scanner keyboard = new Scanner(System.in);
        enteredData = keyboard.next();
        this.enteredData = enteredData;
    }
}

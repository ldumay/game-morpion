/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ldumay.lib.essentials;

/**
 *
 * @author dumay
 */
public class ConverterBytesToOctets {

    public static String getFormattedFileSize(long size) {
        String[] suffixes = new String[] { "octets", "Ko", "Mo", "Go", "To" };
 
        double tmpSize = size;
        int i = 0;
 
        while (tmpSize >= 1024) {
            tmpSize /= 1024.0;
            i++;
        }
 
        // arrondi à 10^-2
        tmpSize *= 100;
        tmpSize = (int) (tmpSize + 0.5);
        tmpSize /= 100;
 
        return tmpSize + " " + suffixes[i];
    }
}
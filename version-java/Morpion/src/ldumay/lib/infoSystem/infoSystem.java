/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ldumay.lib.infoSystem;

import ldumay.lib.essentials.*;
import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author dumay
 */
public class infoSystem {
    
    private String Space = "# - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - #";
    public final ArrayList systemFullInformations = new ArrayList(); //{Space, SystemArch, SystemName, SystemVersion, SystemJavaVersion}
        
    public ArrayList InfosRunSystem(boolean osInfo, boolean osDisks) {
        
        System.out.println(Space);
        System.out.println("Start Checking");
        
        //--[OS-Informations]--
        if(osInfo==true){
            //---
            System.out.println(Space);
            //---
            String systemArch = System.getProperty("os.arch");
            String systemName = System.getProperty("os.name");
            String systemVersion = System.getProperty("os.version");
            String systemJavaVersion = System.getProperty("java.version");
            //---
            int systemJavaCores = Runtime.getRuntime().availableProcessors();
            long maxMemory = Runtime.getRuntime().maxMemory(); // This will return Long.MAX_VALUE if there is no preset limit
            long systemTotalMemory = Runtime.getRuntime().totalMemory(); //Total memory currently in use by the JVM - Total memory (bytes)
            long systemFreeMemory = Runtime.getRuntime().freeMemory(); // Total amount of free memory available to the JVM
            //--
            System.out.println("Systeme Arch : " + systemArch);
            System.out.println("Systeme Name : " + systemName);
            System.out.println("Version : " + systemVersion);
            System.out.println("Java Version : " + systemJavaVersion);
            System.out.println("CPU cores : " +  systemJavaCores);
            System.out.println("Free memory (bytes): " + systemFreeMemory);
            
            // Maximum amount of memory the JVM will attempt to use
            System.out.println("Maximum memory (bytes): " + (maxMemory == Long.MAX_VALUE ? "no limit" : maxMemory));
        }
        
        //--[OS-Informations]--
        if(osDisks==true){
            //---
            System.out.println(Space);
            //---
            File[] roots = File.listRoots(); // Get a list of all filesystem roots on this system
            // For each filesystem root, print some info
            ConverterBytesToOctets convBytesToOctets = new ConverterBytesToOctets();
            for (File root : roots) {
                /*
                String rootAbsolutePath = root.getAbsolutePath();
                System.out.println("" + convBytesToOctets.getFormattedFileSize( rootAbsolutePath ) + "");
                */
                System.out.println("File system root: " + root.getAbsolutePath());
                System.out.println("Total space (bytes): " + root.getTotalSpace());
                System.out.println("Free space (bytes): " + root.getFreeSpace());
                System.out.println("Usable space (bytes): " + root.getUsableSpace());
            }
        }
        
        System.out.println(Space);
        System.out.println("End Checking");
        System.out.println(Space);

        // systemFullInformations.add("");
        return systemFullInformations;
    }
}
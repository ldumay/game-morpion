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

    public String systemArch = System.getProperty("os.arch");
    public String systemName = System.getProperty("os.name");
    public String systemVersion = System.getProperty("os.version");
    public String systemJavaVersion = System.getProperty("java.version");
    
    public int systemJavaCores = Runtime.getRuntime().availableProcessors();
    public long systemMaxMemory = Runtime.getRuntime().maxMemory(); // This will return Long.MAX_VALUE if there is no preset limit
    public long systemTotalMemory = Runtime.getRuntime().totalMemory(); //Total memory currently in use by the JVM - Total memory (bytes)
    public long systemFreeMemory = Runtime.getRuntime().freeMemory(); // Total amount of free memory available to the JVM (bytes)
    
    public File[] systemRoots;
    
    public boolean osInfo;
    public boolean osDisks;
    
    public ArrayList systemFullInformations;
    
    private String Space = "# - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - #";
    
    public infoSystem(boolean osInfo, boolean osDisks) {
        
        this.osInfo = osInfo;
        this.osDisks = osDisks;
        //--
        System.out.println(Space);
        System.out.println("Start Checking");
        
        //--[OS-Informations]--
        if(osInfo==true){
            //---
            System.out.println(Space);
            //--
            this.systemArch = systemArch;
            this.systemName = systemName;
            this.systemVersion = systemVersion;
            this.systemJavaVersion = systemJavaVersion;
            this.systemJavaCores = systemJavaCores;
            this.systemMaxMemory = systemMaxMemory;
            this.systemTotalMemory = systemTotalMemory;
            this.systemFreeMemory = systemFreeMemory;
            //--
            System.out.println("Systeme Arch : " + systemArch);
            System.out.println("Systeme Name : " + systemName);
            System.out.println("Version : " + systemVersion);
            System.out.println("Java Version : " + systemJavaVersion);
            System.out.println("CPU cores : " +  systemJavaCores);
            System.out.println("Free memory (bytes): " + systemFreeMemory);
            //--
            // Maximum amount of memory the JVM will attempt to use
            System.out.println("Maximum memory (bytes): " + (systemMaxMemory == Long.MAX_VALUE ? "no limit" : systemMaxMemory));
        }
        
        //--[OS-Informations]--
        if(osDisks==true){            
             //---
            System.out.println(Space);
            //---
            systemRoots = File.listRoots(); // Get a list of all filesystem roots on this system
            // For each filesystem root, print some info
            ConverterBytesToOctets convBytesToOctets = new ConverterBytesToOctets();
            for (File root : systemRoots) {
                /*
                String rootAbsolutePath = root.getAbsolutePath();
                System.out.println("" + convBytesToOctets.getFormattedFileSize( rootAbsolutePath ) + "");
                */
                System.out.println("File system root: " + root.getAbsolutePath());
                System.out.println("Total space (bytes): " + root.getTotalSpace()); // (bytes)
                System.out.println("Free space (bytes): " + root.getFreeSpace()); // (bytes)
                System.out.println("Usable space (bytes): " + root.getUsableSpace()); // (bytes)
            }
        }
        System.out.println(Space);
        System.out.println("End Checking");
        System.out.println(Space);

        // systemFullInformatisystemFullInformationsons.add("");
        this.systemFullInformations = new ArrayList(); //{Space, SystemArch, SystemName, SystemVersion, SystemJavaVersion}
        this.systemFullInformations.add(systemArch);
        this.systemFullInformations.add(systemName);
        this.systemFullInformations.add(systemVersion);
        this.systemFullInformations.add(systemJavaVersion);
        this.systemFullInformations.add(systemJavaCores);
        this.systemFullInformations.add(systemMaxMemory);
        this.systemFullInformations.add(systemTotalMemory);
        this.systemFullInformations.add(systemFreeMemory);
        this.systemFullInformations.add(systemRoots);
    }

    public String getSystemArch() { return systemArch; }
    public String getSystemName() { return systemName; }
    public String getSystemVersion() { return systemVersion; }
    public String getSystemJavaVersion() { return systemJavaVersion; }
    public int getSystemJavaCores() { return systemJavaCores; }
    public long getSystemMaxMemory() { return systemMaxMemory; }
    public long getSystemTotalMemory() { return systemTotalMemory; }
    public long getSystemFreeMemory() { return systemFreeMemory; }
    public File[] getSystemRoots() { return systemRoots; }
    public boolean getOsInfo() { return osInfo; }
    public boolean getOsDisks() { return osDisks; }
    public ArrayList getSystemFullInformations() { return systemFullInformations; }
    public String getSpace() { return Space; }
}
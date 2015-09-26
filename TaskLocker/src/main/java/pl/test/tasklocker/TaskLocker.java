/*
 * Licence: CC BY-SA 4.0
 * 
 */

package pl.test.tasklocker;

import java.io.IOException;
import java.util.prefs.Preferences;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * @author hiroSzymon
 */

public class TaskLocker {
    
    //JNI C code
    /*native int WindowsArch(); 
        static {
            System.loadLibrary("arch");  
        }*/
        
    public static void main(String args[]){
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } 
        catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {}
              
        
        
        Preferences p = Preferences.userRoot();
        String ps="";
        //if("-d".equals(args[0])) p.put("TaskLockerInstalled", "true");

        
        
        if(args.length == 0) ps="explorer.exe";
        else ps=args[0];
        
        if(p.get("TaskLockerInstalled", "false").equals("true")){
            
            try {
                Runtime.getRuntime().exec("taskkill /F /IM "+ps);
            } catch (IOException ex) {
                System.err.println("No process!!!"+ex);
            }
            
            WindowInstalled windowInstalled = new WindowInstalled();
            windowInstalled.setVisible(true);
            
        }else{
            
            WindowNotInstalled windowNotInstalled = new WindowNotInstalled();
            windowNotInstalled.setVisible(true);
            
        }
            
    }      
}

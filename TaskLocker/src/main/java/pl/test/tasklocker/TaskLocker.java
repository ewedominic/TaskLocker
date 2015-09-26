/*
 * Licence: CC BY-SA 4.0
 * 
 * 
 */
package pl.test.tasklocker;

import java.io.IOException;
import java.util.prefs.Preferences;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author hiroSzymon
 */
public class TaskLocker {
    public static void main(String args[]){
        
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } 
        catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {}
              
        Preferences p = Preferences.userRoot();
        if(p.get("TaskLockerInstalled", "false").equals("true")){
            try {
                Runtime.getRuntime().exec("taskkill /F /IM explorer.exe");
            } catch (IOException ex) {
                System.err.println("No process!!!"+ex);
            }
        }
        Window okno = new Window();
        okno.setVisible(true);
         /**/
    }      
}

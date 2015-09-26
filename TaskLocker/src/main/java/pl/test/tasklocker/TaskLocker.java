/*
 * Licence: CC BY-SA 4.0
 * 
 * 
 */
package pl.test.tasklocker;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hiroSzymon
 */
public class TaskLocker {
    public static void main(String args[]){
        try {
            Runtime.getRuntime().exec("taskkill /F /IM explorer.exe");
            
        } catch (IOException ex) {
            Logger.getLogger(TaskLocker.class.getName()).log(Level.SEVERE, null, ex);
        }
    }      
}

/*
 * Licence: CC BY-SA 4.0
 * 
 */
package pl.test.tasklocker;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

/**
 * @author hiroSzymon
 */

@SuppressWarnings("serial")
public class WindowNotInstalled extends javax.swing.JFrame {

    public WindowNotInstalled() {
        initComponents();
    }
    Preferences p = Preferences.userRoot();
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JButton Install = new javax.swing.JButton();
        javax.swing.JButton Uninstall = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Task Locker");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Install.setText("Install");
        Install.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InstallActionPerformed(evt);
            }
        });

        Uninstall.setText("Uninstall");
        Uninstall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UninstallActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(Install)
                .addGap(35, 35, 35)
                .addComponent(Uninstall)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(154, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Install)
                    .addComponent(Uninstall))
                .addGap(123, 123, 123))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void UninstallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UninstallActionPerformed
        p.remove("TaskLockerInstalled");
        try {
            Runtime.getRuntime().exec("REG ADD \"HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion\\Winlogon\" /v Shell /t REG_SZ /d explorer.exe /f");
        } catch (IOException ex) {
            System.err.println("Admin rights! "+ex);
        }
    }//GEN-LAST:event_UninstallActionPerformed

    private void InstallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InstallActionPerformed
        p.put("TaskLockerInstalled","true"); 
        try {
            PrintWriter writer = new PrintWriter("TaskLocker.bat", "US-ASCII");
            writer.println("start javaw.exe -jar TaskLocker-4e-12.jar");
            writer.println("exit");
            writer.close();
            p.flush();
            Runtime.getRuntime().exec("REG DELETE \"HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion\\Winlogon\" /v Shell /f");
            Runtime.getRuntime().exec("Something.bat  \"REG ADD \"HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\Run\" /v TaskLocker /t REG_SZ /d "+System.getProperty("user.dir")+"\\TaskLocker.bat /f\" -Verb runAs");
            System.err.println("REG ADD \"HKEY_LOCAL_MACHINE\\SOFTWARE\\Microsoft\\Windows\\CurrentVersion\\Run\" /v TaskLocker /t REG_SZ /d "+System.getProperty("user.dir")+"\\TaskLocker.bat /f");
        } catch (IOException | BackingStoreException ex) {
            System.err.println("Admin rights! "+ex);
        }
    }//GEN-LAST:event_InstallActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

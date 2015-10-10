/*
 * Licence: CC BY-SA 4.0
 * 
 */
package pl.test.tasklocker;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.Preferences;
import javax.imageio.ImageIO;

/**
 * @author hiroSzymon
 */

@SuppressWarnings("serial")
public class WindowNotInstalled extends javax.swing.JFrame {
Image img;
    public WindowNotInstalled() {
        File plik = new File(".\\icon.png");
        try {
            img = ImageIO.read(plik);
        } catch (IOException ex) {
            Logger.getLogger(WindowNotInstalled.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
    }
    Preferences p = Preferences.userRoot();
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JButton Install = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Task Locker");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(img);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                actionOnClose(evt);
            }
        });

        Install.setText("Install");
        Install.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InstallActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Install, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Install, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InstallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InstallActionPerformed
        p.put("TaskLockerInstalled","true");
        System.out.println(44);
        WindowInstalled windowInstalled = new WindowInstalled();
        this.setVisible(false);
        this.dispose();
        windowInstalled.setVisible(true);
    }//GEN-LAST:event_InstallActionPerformed

    private void actionOnClose(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_actionOnClose
       System.out.println(666);
       System.exit(0);
    }//GEN-LAST:event_actionOnClose

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

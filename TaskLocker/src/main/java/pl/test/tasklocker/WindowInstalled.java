/*
 * Licence: CC BY-SA 4.0
 * 
 */
package pl.test.tasklocker;

import java.net.URI;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.prefs.Preferences;

/**
 * @author hiroSzymon
 */

@SuppressWarnings("serial")
public class WindowInstalled extends javax.swing.JFrame {
  
    Thread thread = new Thread(){
    @Override
    public void run(){
      if(!(check1.isSelected()&&check2.isSelected()&&check3.isSelected())) try {
          thread.sleep(100);
          run();
      } catch (InterruptedException ex) {
          Logger.getLogger(WindowInstalled.class.getName()).log(Level.SEVERE, null, ex);
      } 
      else {
          try {
              Runtime.getRuntime().exec("explorer.exe");
          } catch (IOException ex) {
              Logger.getLogger(WindowInstalled.class.getName()).log(Level.SEVERE, null, ex);
          }
          System.exit(0);
      }
        }
     };
    
    public WindowInstalled() {
        initComponents();
        thread.start();
    }
    Preferences p = Preferences.userRoot();
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JButton Emergency = new javax.swing.JButton();
        javax.swing.JButton Uninstall = new javax.swing.JButton();
        javax.swing.JSeparator jSeparator1 = new javax.swing.JSeparator();
        javax.swing.JLabel headerToDo = new javax.swing.JLabel();
        javax.swing.JLabel number1 = new javax.swing.JLabel();
        javax.swing.JTextField task1 = new javax.swing.JTextField();
        check1 = new javax.swing.JCheckBox();
        javax.swing.JLabel number2 = new javax.swing.JLabel();
        javax.swing.JTextField task2 = new javax.swing.JTextField();
        check2 = new javax.swing.JCheckBox();
        javax.swing.JLabel number3 = new javax.swing.JLabel();
        javax.swing.JTextField task3 = new javax.swing.JTextField();
        check3 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Task Locker");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        Emergency.setText("Emergency");
        Emergency.setPreferredSize(new java.awt.Dimension(97, 25));
        Emergency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmergencyActionPerformed(evt);
            }
        });

        Uninstall.setText("Uninstall");
        Uninstall.setMaximumSize(new java.awt.Dimension(111, 25));
        Uninstall.setMinimumSize(new java.awt.Dimension(111, 25));
        Uninstall.setPreferredSize(new java.awt.Dimension(111, 25));
        Uninstall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UninstallActionPerformed(evt);
            }
        });

        headerToDo.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        headerToDo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerToDo.setText("To Do List");

        number1.setText("1.");

        task1.setText("Task to do...");

        check1.setText("Done!");

        number2.setText("2.");

        task2.setText("Task to do...");

        check2.setText("Done!");

        number3.setText("3.");

        task3.setText("Task to do...");

        check3.setText("Done!");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(number2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(task2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(check2))
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Emergency, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Uninstall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(number1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(task1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(check1))
                    .addComponent(headerToDo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(number3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(task3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(check3)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(headerToDo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(task1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number1)
                    .addComponent(check1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(task2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number2)
                    .addComponent(check2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(task3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number3)
                    .addComponent(check3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 159, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 3, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Emergency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Uninstall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

    private void EmergencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmergencyActionPerformed
        try {
            Desktop.getDesktop().browse(new URI("http://www.google.com"));
            } catch (IOException | URISyntaxException  ex) {
            System.err.println("Fuckbrowser!"+ex);
            }
        
            /*try {
            String[] paf = {"\"", "C:\\Program Files(x86)\\Mozilla Firefox\\firefox.exe","%ProgramFiles%\\Mozilla Firefox\\firefox.exe" };
            if (System.getenv("ProgramFiles(X86)") !=(null)){
            Runtime.getRuntime().exec(paf[0]+paf[1]+paf[0]);
            }
            else{
            Runtime.getRuntime().exec(paf[0]+paf[2]+paf[0]);
            }
            
            } catch (IOException ex) {
            System.err.println("Admin rights! "+ex);
            }*/
    }//GEN-LAST:event_EmergencyActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    javax.swing.JCheckBox check1;
    javax.swing.JCheckBox check2;
    javax.swing.JCheckBox check3;
    // End of variables declaration//GEN-END:variables
}

package continentalconquest;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x13360866
 */
public class AfricaQuizGUI extends javax.swing.JFrame {
    private Image image;

    /**
     * Creates new form AfricaQuizGUI
     */
    public AfricaQuizGUI() {
        initComponents();
      /*  CustomCursor();*/
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    /*
     public void CustomCursor()
    {
        Toolkit toolkit = Toolkit.getDefaultToolkit();  
        Image img = toolkit.getImage("CustomCursor.png");
        Point point = new Point(0,  0);
        Cursor cursor = toolkit.createCustomCursor(img,point,"Cursor");
        
        setCursor(cursor);
    } */
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        BackBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Algeriabtn = new javax.swing.JButton();
        Nigeriabtn = new javax.swing.JButton();
        Sudanbtn = new javax.swing.JButton();
        Congobtn = new javax.swing.JButton();
        Egyptbtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();
        Background1 = new javax.swing.JLabel();
        MinB = new javax.swing.JLabel();
        CloseB = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(620, 540));
        getContentPane().setLayout(null);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(10, 70, 750, 10);

        BackBtn.setText("Go Back");
        BackBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });
        getContentPane().add(BackBtn);
        BackBtn.setBounds(10, 460, 90, 40);

        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 70, 4, 540);

        Algeriabtn.setFont(new java.awt.Font("Old English Text MT", 0, 24)); // NOI18N
        Algeriabtn.setForeground(new java.awt.Color(51, 51, 255));
        Algeriabtn.setText("Algeria");
        Algeriabtn.setContentAreaFilled(false);
        Algeriabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlgeriabtnActionPerformed(evt);
            }
        });
        getContentPane().add(Algeriabtn);
        Algeriabtn.setBounds(260, 90, 130, 40);

        Nigeriabtn.setFont(new java.awt.Font("Old English Text MT", 0, 24)); // NOI18N
        Nigeriabtn.setForeground(new java.awt.Color(51, 51, 255));
        Nigeriabtn.setText("Nigeria");
        Nigeriabtn.setContentAreaFilled(false);
        Nigeriabtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NigeriabtnActionPerformed(evt);
            }
        });
        getContentPane().add(Nigeriabtn);
        Nigeriabtn.setBounds(300, 210, 140, 30);

        Sudanbtn.setFont(new java.awt.Font("Old English Text MT", 0, 24)); // NOI18N
        Sudanbtn.setForeground(new java.awt.Color(51, 51, 255));
        Sudanbtn.setText("Sudan");
        Sudanbtn.setContentAreaFilled(false);
        Sudanbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SudanbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Sudanbtn);
        Sudanbtn.setBounds(470, 180, 110, 30);

        Congobtn.setFont(new java.awt.Font("Old English Text MT", 0, 24)); // NOI18N
        Congobtn.setForeground(new java.awt.Color(51, 51, 255));
        Congobtn.setText("Congo");
        Congobtn.setContentAreaFilled(false);
        Congobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CongobtnActionPerformed(evt);
            }
        });
        getContentPane().add(Congobtn);
        Congobtn.setBounds(440, 300, 110, 30);

        Egyptbtn.setFont(new java.awt.Font("Old English Text MT", 0, 24)); // NOI18N
        Egyptbtn.setForeground(new java.awt.Color(51, 51, 255));
        Egyptbtn.setText("Egypt");
        Egyptbtn.setContentAreaFilled(false);
        Egyptbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EgyptbtnActionPerformed(evt);
            }
        });
        getContentPane().add(Egyptbtn);
        Egyptbtn.setBounds(470, 100, 100, 33);

        jLabel5.setFont(new java.awt.Font("Old English Text MT", 0, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 255));
        jLabel5.setText("Africa ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(220, 20, 200, 50);

        Background.setFont(new java.awt.Font("Old English Text MT", 3, 18)); // NOI18N
        Background.setForeground(new java.awt.Color(255, 255, 255));
        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/continentalconquest/Background.png"))); // NOI18N
        getContentPane().add(Background);
        Background.setBounds(140, 70, 480, 440);

        Background1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/continentalconquest/OtherFrame.png"))); // NOI18N
        getContentPane().add(Background1);
        Background1.setBounds(0, 0, 620, 540);

        MinB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinBMouseClicked(evt);
            }
        });
        getContentPane().add(MinB);
        MinB.setBounds(570, 0, 20, 20);

        CloseB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseBMouseClicked(evt);
            }
        });
        getContentPane().add(CloseB);
        CloseB.setBounds(600, 0, 20, 20);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AlgeriabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlgeriabtnActionPerformed
        // TODO add your handling code here:
        AlgeriaQuizGUI Algeria = new AlgeriaQuizGUI();
        Algeria.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_AlgeriabtnActionPerformed

    private void SudanbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SudanbtnActionPerformed
        // TODO add your handling code here:
        SudanQuizGUI Sudan = new SudanQuizGUI();
        Sudan.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_SudanbtnActionPerformed

    private void CongobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CongobtnActionPerformed
        // TODO add your handling code here:
        CongoQuizGUI Congo = new CongoQuizGUI();
        Congo.setVisible(true); 
        this.dispose();
        
    }//GEN-LAST:event_CongobtnActionPerformed

    private void NigeriabtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NigeriabtnActionPerformed
        // TODO add your handling code here:
        NigeriaQuizGUI Nigeria = new NigeriaQuizGUI();
        Nigeria.setVisible(true); 
        this.dispose();
        
    }//GEN-LAST:event_NigeriabtnActionPerformed

    private void EgyptbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EgyptbtnActionPerformed
        // TODO add your handling code here:
        EgyptQuizGUI Egypt = new EgyptQuizGUI();
        Egypt.setVisible(true); 
        this.dispose();
    }//GEN-LAST:event_EgyptbtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        WorldMapGUI newGUI = null;
        try {
            newGUI = new WorldMapGUI();
        } catch (MalformedURLException ex) {
            Logger.getLogger(AfricaQuizGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        newGUI.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BackBtnActionPerformed

    private void MinBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinBMouseClicked
        this.setState(StartGUI.ICONIFIED);
    }//GEN-LAST:event_MinBMouseClicked

    private void CloseBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseBMouseClicked
        System.exit(0);
    }//GEN-LAST:event_CloseBMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AfricaQuizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AfricaQuizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AfricaQuizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AfricaQuizGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AfricaQuizGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Algeriabtn;
    private javax.swing.JButton BackBtn;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Background1;
    private javax.swing.JLabel CloseB;
    private javax.swing.JButton Congobtn;
    private javax.swing.JButton Egyptbtn;
    private javax.swing.JLabel MinB;
    private javax.swing.JButton Nigeriabtn;
    private javax.swing.JButton Sudanbtn;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

  
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package continentalconquest;

import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;
import java.net.MalformedURLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author x13532883
 */
public class SaudiArabiaFrame extends javax.swing.JFrame {
    String question;
    int count;
    int count2;
    private static final String VOICENAME = "kevin16";

    /**
     * Creates new form SaudiArabiaFrame
     */
    public SaudiArabiaFrame() {
        initComponents();
        question="";
        count = 0;
        count2 =0;
         yBtn.setVisible(false);
        nBtn.setVisible(false);
try {

            Class.forName("com.mysql.jdbc.Driver");
            String connectionUrl = "jdbc:mysql://localhost:3307/jdbcTest?user=root&password=password";
            Connection conn = DriverManager.getConnection(connectionUrl);
            Statement st = (Statement) conn.createStatement();
            String find = "select quest,answer,wrongAns,wrongAns2,wrongAns3,q_sel,score from Question where country = 'saudi arabia' and q_sel = 'N' order by rand() limit 1;";
            ResultSet rs = st.executeQuery(find);

            /* https://www.youtube.com/watch?v=MY4FavUyFNQ */

            while(rs.next()){
                question = questionlbl.getText();
                questionlbl.setText("\n"+rs.getString("quest"));
                Statement st2 = conn.createStatement();
                st2.executeUpdate("update Question set q_sel = 'Y' where quest = '"+rs.getString("quest")+"'");

                String[] solutionArray = {rs.getString("answer"),rs.getString("wrongAns"),rs.getString("wrongAns2"),rs.getString("wrongAns3")};

                String [] arr = solutionArray;
                Random rgen = new Random();
                int N = arr.length;
                /*
                * fisher yates shuffle
                *
                * 9/3/2015
                *
                * @reference http://algs4.cs.princeton.edu/11model/Knuth.java.html
                * @author sean trant 13332576
                */

                for (int i = 0; i < N; i++) {
                    // choose index uniformly in [i, N-1]
                    int r = i + (int) (Math.random() * (N - i));
                    Object swap = arr[r];
                    arr[r] = arr[i];
                    arr[i] = (String)swap;

                    answer1.setText(arr[0]);
                   answer2.setText(arr[1]);
                    answer3.setText(arr[2]);
                    answer4.setText(arr[3]);
                }

            }

        } catch (Exception ex) {
            System.out.println("AGGHHHH!!!!!");
        }             
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        voiceBtn = new javax.swing.JButton();
        yBtn = new javax.swing.JButton();
        nBtn = new javax.swing.JButton();
        Scorelbl1 = new javax.swing.JLabel();
        Japanlbl = new javax.swing.JLabel();
        jButtonback = new javax.swing.JButton();
        questionlbl = new javax.swing.JLabel();
        answer1 = new javax.swing.JButton();
        answer2 = new javax.swing.JButton();
        answer3 = new javax.swing.JButton();
        answer4 = new javax.swing.JButton();
        bgimage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(428, 579));
        getContentPane().setLayout(null);

        voiceBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/continentalconquest/voice button.png"))); // NOI18N
        voiceBtn.setContentAreaFilled(false);
        voiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voiceBtnActionPerformed(evt);
            }
        });
        getContentPane().add(voiceBtn);
        voiceBtn.setBounds(320, 10, 80, 70);

        yBtn.setBackground(new java.awt.Color(255, 255, 255));
        yBtn.setFont(new java.awt.Font("Old English Text MT", 0, 18)); // NOI18N
        yBtn.setText("Yes");
        yBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        yBtn.setContentAreaFilled(false);
        yBtn.setOpaque(true);
        yBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yBtnActionPerformed(evt);
            }
        });
        getContentPane().add(yBtn);
        yBtn.setBounds(20, 270, 180, 70);

        nBtn.setBackground(new java.awt.Color(255, 255, 255));
        nBtn.setFont(new java.awt.Font("Old English Text MT", 0, 18)); // NOI18N
        nBtn.setText("No");
        nBtn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        nBtn.setContentAreaFilled(false);
        nBtn.setOpaque(true);
        nBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nBtnActionPerformed(evt);
            }
        });
        getContentPane().add(nBtn);
        nBtn.setBounds(250, 270, 180, 70);

        Scorelbl1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Scorelbl1.setToolTipText("");
        getContentPane().add(Scorelbl1);
        Scorelbl1.setBounds(20, 540, 410, 20);

        Japanlbl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        getContentPane().add(Japanlbl);
        Japanlbl.setBounds(160, 20, 210, 30);

        jButtonback.setText("BACK");
        jButtonback.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jButtonback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonbackActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonback);
        jButtonback.setBounds(10, 11, 90, 40);

        questionlbl.setFont(new java.awt.Font("Old English Text MT", 0, 24)); // NOI18N
        questionlbl.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        getContentPane().add(questionlbl);
        questionlbl.setBounds(40, 90, 370, 220);

        answer1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        answer1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer1ActionPerformed(evt);
            }
        });
        getContentPane().add(answer1);
        answer1.setBounds(40, 360, 130, 50);

        answer2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        answer2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer2ActionPerformed(evt);
            }
        });
        getContentPane().add(answer2);
        answer2.setBounds(280, 360, 130, 50);

        answer3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        answer3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer3ActionPerformed(evt);
            }
        });
        getContentPane().add(answer3);
        answer3.setBounds(40, 470, 130, 50);

        answer4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        answer4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answer4ActionPerformed(evt);
            }
        });
        getContentPane().add(answer4);
        answer4.setBounds(280, 470, 130, 50);

        bgimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/continentalconquest/saudiarabiaflag.jpg"))); // NOI18N
        getContentPane().add(bgimage);
        bgimage.setBounds(0, 0, 430, 580);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonbackActionPerformed
        // TODO add your handling code here:
        AsiaFrame start = null;
        try {
            start = new AsiaFrame();
        } catch (MalformedURLException ex) {
            Logger.getLogger(SaudiArabiaFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        start.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonbackActionPerformed

    private void answer1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer1ActionPerformed
        // TODO add your handling code here:
         if(count2==4){
                    Scorelbl1.setVisible(true);
                    answer1.setVisible(false);
                    answer2.setVisible(false);
                    answer3.setVisible(false);
                    answer4.setVisible(false);
                    if(count<4){
                        Japanlbl.setText("Retreat!");
                        questionlbl.setText("");
                        Scorelbl1.setText("You got "+count+" questions correct. Don't worry, try again?");
                        yBtn.setVisible(true);
                        nBtn.setVisible(true);
                    }
                    else if(count==4){
                        Japanlbl.setText("Saudi Arabia conquered");
                        questionlbl.setText("");
                        Scorelbl1.setText("You got all"+count+" questions correct.Well done!");
                    }
                    
                 } 
        try {

Class.forName("com.mysql.jdbc.Driver");
String connectionUrl = "jdbc:mysql://localhost:3307/jdbcTest?user=root&password=password";
Connection conn = DriverManager.getConnection(connectionUrl);
Statement st = (Statement) conn.createStatement();
String find = "select quest,answer,wrongAns,wrongAns2,wrongAns3,q_sel from Question where country = 'saudi arabia' and q_sel = 'N' order by rand() limit 1;"; 
ResultSet rs = st.executeQuery(find);

/* https://www.youtube.com/watch?v=MY4FavUyFNQ */ 

while(rs.next()){
question = questionlbl.getText();
questionlbl.setText("\n"+rs.getString("quest")); 
Statement st2 = conn.createStatement();
st2.executeUpdate("update Question set q_sel = 'Y' where quest = '"+rs.getString("quest")+"'");

String[] solutionArray = {rs.getString("answer"),rs.getString("wrongAns"),rs.getString("wrongAns2"),rs.getString("wrongAns3")};

String [] arr = solutionArray;
Random rgen = new Random();
int N = arr.length;
/*
* fisher yates shuffle
*
* 9/3/2015
*
* @reference http://algs4.cs.princeton.edu/11model/Knuth.java.html
* @author sean trant 13332576
*/ 
for (int i = 0; i < N; i++) {
// choose index uniformly in [i, N-1]
int r = i + (int) (Math.random() * (N - i));
Object swap = arr[r];
arr[r] = arr[i];
arr[i] = (String)swap;

answer1.setText(arr[0]);
answer2.setText(arr[1]);
answer3.setText(arr[2]);
answer4.setText(arr[3]); 
}

if(arr[0].equals(rs.getString("answer"))){
 Statement st3 = (Statement) conn.createStatement();
                    st3.executeUpdate("update Player set score = score+1 where p_sel='Y'");
                    count++;
                    Scorelbl1.setText("Your last answer was correct!");
                    } 
                 else{
                     Scorelbl1.setText("AHH, your last answer was incorrect.");
                 }
}

} catch (Exception ex) {
System.out.println("AGGHHHH!!!!!"); 
}
    }//GEN-LAST:event_answer1ActionPerformed

    private void answer2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer2ActionPerformed
        // TODO add your handling code here:
              if(count2==4){
                    Scorelbl1.setVisible(true);
                    answer1.setVisible(false);
                    answer2.setVisible(false);
                    answer3.setVisible(false);
                    answer4.setVisible(false);
                    if(count<4){
                        Japanlbl.setText("Retreat!");
                        questionlbl.setText("");
                        Scorelbl1.setText("You got "+count+" questions correct. Don't worry, try again?");
                        yBtn.setVisible(true);
                        nBtn.setVisible(true);
                    }
                    else if(count==4){
                        Japanlbl.setText("Saudi Arabia conquered");
                        questionlbl.setText("");
                        Scorelbl1.setText("You got all"+count+" questions correct.Well done!");
                    }
                    
                 } 
                try {

Class.forName("com.mysql.jdbc.Driver");
String connectionUrl = "jdbc:mysql://localhost:3307/jdbcTest?user=root&password=password";
Connection conn = DriverManager.getConnection(connectionUrl);
Statement st = (Statement) conn.createStatement();
String find = "select quest,answer,wrongAns,wrongAns2,wrongAns3,q_sel from Question where country = 'saudi arabia' and q_sel = 'N' order by rand() limit 1;"; 
ResultSet rs = st.executeQuery(find);

/* https://www.youtube.com/watch?v=MY4FavUyFNQ */ 

while(rs.next()){
question = questionlbl.getText();
questionlbl.setText("\n"+rs.getString("quest")); 
Statement st2 = conn.createStatement();
st2.executeUpdate("update Question set q_sel = 'Y' where quest = '"+rs.getString("quest")+"'");

String[] solutionArray = {rs.getString("answer"),rs.getString("wrongAns"),rs.getString("wrongAns2"),rs.getString("wrongAns3")};

String [] arr = solutionArray;
Random rgen = new Random();
int N = arr.length;
/*
* fisher yates shuffle
*
* 9/3/2015
*
* @reference http://algs4.cs.princeton.edu/11model/Knuth.java.html
* @author sean trant 13332576
*/ 
for (int i = 0; i < N; i++) {
// choose index uniformly in [i, N-1]
int r = i + (int) (Math.random() * (N - i));
Object swap = arr[r];
arr[r] = arr[i];
arr[i] = (String)swap;

answer1.setText(arr[0]);
answer2.setText(arr[1]);
answer3.setText(arr[2]);
answer4.setText(arr[3]); 
}

if(arr[1].equals(rs.getString("answer"))){
 Statement st3 = (Statement) conn.createStatement();
                    st3.executeUpdate("update Player set score = score+1 where p_sel='Y'");
                    count++;
                    Scorelbl1.setText("Your last answer was correct!");
                    } 
                 else{
                     Scorelbl1.setText("AHH, your last answer was incorrect.");
                 }
}

} catch (Exception ex) {
System.out.println("AGGHHHH!!!!!"); 
}
    }//GEN-LAST:event_answer2ActionPerformed

    private void answer3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer3ActionPerformed
        // TODO add your handling code here:
              if(count2==4){
                    Scorelbl1.setVisible(true);
                    answer1.setVisible(false);
                    answer2.setVisible(false);
                    answer3.setVisible(false);
                    answer4.setVisible(false);
                    if(count<4){
                        Japanlbl.setText("Retreat!");
                        questionlbl.setText("");
                        Scorelbl1.setText("You got "+count+" questions correct. Don't worry, try again?");
                        yBtn.setVisible(true);
                        nBtn.setVisible(true);
                    }
                    else if(count==4){
                        Japanlbl.setText("Saudi Arabia conquered");
                        questionlbl.setText("");
                        Scorelbl1.setText("You got all"+count+" questions correct.Well done!");
                    }
                    
                 } 
                try {

Class.forName("com.mysql.jdbc.Driver");
String connectionUrl = "jdbc:mysql://localhost:3307/jdbcTest?user=root&password=password";
Connection conn = DriverManager.getConnection(connectionUrl);
Statement st = (Statement) conn.createStatement();
String find = "select quest,answer,wrongAns,wrongAns2,wrongAns3,q_sel from Question where country = 'saudi arabia' and q_sel = 'N' order by rand() limit 1;"; 
ResultSet rs = st.executeQuery(find);

/* https://www.youtube.com/watch?v=MY4FavUyFNQ */ 

while(rs.next()){
question = questionlbl.getText();
questionlbl.setText("\n"+rs.getString("quest")); 
Statement st2 = conn.createStatement();
st2.executeUpdate("update Question set q_sel = 'Y' where quest = '"+rs.getString("quest")+"'");

String[] solutionArray = {rs.getString("answer"),rs.getString("wrongAns"),rs.getString("wrongAns2"),rs.getString("wrongAns3")};

String [] arr = solutionArray;
Random rgen = new Random();
int N = arr.length;
/*
* fisher yates shuffle
*
* 9/3/2015
*
* @reference http://algs4.cs.princeton.edu/11model/Knuth.java.html
* @author sean trant 13332576
*/ 
for (int i = 0; i < N; i++) {
// choose index uniformly in [i, N-1]
int r = i + (int) (Math.random() * (N - i));
Object swap = arr[r];
arr[r] = arr[i];
arr[i] = (String)swap;

answer1.setText(arr[0]);
answer2.setText(arr[1]);
answer3.setText(arr[2]);
answer4.setText(arr[3]); 
}

if(arr[2].equals(rs.getString("answer"))){
 Statement st3 = (Statement) conn.createStatement();
                    st3.executeUpdate("update Player set score = score+1 where p_sel='Y'");
                    count++;
                    Scorelbl1.setText("Your last answer was correct!");
                    } 
                 else{
                     Scorelbl1.setText("AHH, your last answer was incorrect.");
                 }
}

} catch (Exception ex) {
System.out.println("AGGHHHH!!!!!"); 
}
    }//GEN-LAST:event_answer3ActionPerformed

    private void answer4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answer4ActionPerformed
        // TODO add your handling code here:
              if(count2==4){
                    Scorelbl1.setVisible(true);
                    answer1.setVisible(false);
                    answer2.setVisible(false);
                    answer3.setVisible(false);
                    answer4.setVisible(false);
                    if(count<4){
                        Japanlbl.setText("Retreat!");
                        questionlbl.setText("");
                        Scorelbl1.setText("You got "+count+" questions correct. Don't worry, try again?");
                        yBtn.setVisible(true);
                        nBtn.setVisible(true);
                    }
                    else if(count==4){
                        Japanlbl.setText("Saudi Arabia conquered");
                        questionlbl.setText("");
                        Scorelbl1.setText("You got all"+count+" questions correct.Well done!");
                    }
                    
                 } 
                try {

Class.forName("com.mysql.jdbc.Driver");
String connectionUrl = "jdbc:mysql://localhost:3307/jdbcTest?user=root&password=password";
Connection conn = DriverManager.getConnection(connectionUrl);
Statement st = (Statement) conn.createStatement();
String find = "select quest,answer,wrongAns,wrongAns2,wrongAns3,q_sel from Question where country = 'saudi arabia' and q_sel = 'N' order by rand() limit 1;"; 
ResultSet rs = st.executeQuery(find);

/* https://www.youtube.com/watch?v=MY4FavUyFNQ */ 

while(rs.next()){
question = questionlbl.getText();
questionlbl.setText("\n"+rs.getString("quest")); 
Statement st2 = conn.createStatement();
st2.executeUpdate("update Question set q_sel = 'Y' where quest = '"+rs.getString("quest")+"'");

String[] solutionArray = {rs.getString("answer"),rs.getString("wrongAns"),rs.getString("wrongAns2"),rs.getString("wrongAns3")};

String [] arr = solutionArray;
Random rgen = new Random();
int N = arr.length;
/*
* fisher yates shuffle
*
* 9/3/2015
*
* @reference http://algs4.cs.princeton.edu/11model/Knuth.java.html
* @author sean trant 13332576
*/ 
for (int i = 0; i < N; i++) {
// choose index uniformly in [i, N-1]
int r = i + (int) (Math.random() * (N - i));
Object swap = arr[r];
arr[r] = arr[i];
arr[i] = (String)swap;

answer1.setText(arr[0]);
answer2.setText(arr[1]);
answer3.setText(arr[2]);
answer4.setText(arr[3]); 
}

if(arr[3].equals(rs.getString("answer"))){
 Statement st3 = (Statement) conn.createStatement();
                    st3.executeUpdate("update Player set score = score+1 where p_sel='Y'");
                    count++;
                    Scorelbl1.setText("Your last answer was correct!");
                    } 
                 else{
                     Scorelbl1.setText("AHH, your last answer was incorrect.");
                 }
}

} catch (Exception ex) {
System.out.println("AGGHHHH!!!!!"); 
}
    }//GEN-LAST:event_answer4ActionPerformed

    private void yBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yBtnActionPerformed
        // TODO add your handling code here:
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String connectionUrl = "jdbc:mysql://localhost:3307/jdbcTest?user=root&password=password";
            Connection conn = DriverManager.getConnection(connectionUrl);

            Statement st = (Statement) conn.createStatement();

            /* https://www.youtube.com/watch?v=ZJuhRSgY0LY */
            String update = "update Question set q_sel = 'N';";
            st.executeUpdate(update);
            /* */
            try {
                Japanlbl.setText("Saudi Arabia Quiz");
                answer1.setVisible(true);
                answer2.setVisible(true);
                answer3.setVisible(true);
                answer4.setVisible(true);
                count2=0;
                count=0;
                questionlbl.setVisible(true);
                Scorelbl1.setVisible(false);
                yBtn.setVisible(false);
                nBtn.setVisible(false);
                String find = "select quest,answer,wronganswer,wronganswer2,wronganswer3,q_sel from Question where country = 'saudi arabia' and q_sel = 'N' order by rand() limit 1;";
                ResultSet rs = st.executeQuery(find);

                /* https://www.youtube.com/watch?v=MY4FavUyFNQ */

                while(rs.next()){
                    question = questionlbl.getText();
                    questionlbl.setText("\n"+rs.getString("quest"));
                    Statement st2 = conn.createStatement();
                    st2.executeUpdate("update Question set q_sel = 'Y' where quest = '"+rs.getString("quest")+"'");

                    String[] solutionArray = {rs.getString("answer"),rs.getString("wronganswer"),rs.getString("wronganswer2"),rs.getString("wronganswer3")};
                    String [] arr = solutionArray;
                    Random rgen = new Random();
                    int N = arr.length;
                    /*
                    * fisher yates shuffle
                    *
                    * 9/3/2015
                    *
                    * @reference http://algs4.cs.princeton.edu/11model/Knuth.java.html
                    * @author sean trant 13332576
                    */

                    for (int i = 0; i < N; i++) {
                        // choose index uniformly in [i, N-1]
                        int r = i + (int) (Math.random() * (N - i));
                        Object swap = arr[r];
                        arr[r] = arr[i];
                        arr[i] = (String)swap;

                        answer1.setText(arr[0]);
                        answer2.setText(arr[1]);
                        answer3.setText(arr[2]);
                        answer4.setText(arr[3]);
                    }

                }

            } catch (Exception ex) {
                System.out.println("AGGHHHH!!!!!");
            }

        } catch (Exception ex) {
            System.out.println("AGGHHHH!!!!!");
        }
    }//GEN-LAST:event_yBtnActionPerformed

    private void nBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nBtnActionPerformed
        // TODO add your handling code here:
        EuropeGUI europe =null;
        try {
            europe = new EuropeGUI();
        } catch (MalformedURLException ex) {
            Logger.getLogger(AustraliaGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        europe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_nBtnActionPerformed

    private void voiceBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voiceBtnActionPerformed
        // TODO add your handling code here:
        Voice voice;
        VoiceManager vm = VoiceManager.getInstance();
        voice = vm.getVoice(VOICENAME);
        voice.allocate();
        try{
            voice.speak(questionlbl.getText());
            voice.speak("Answer, one");
            voice.speak(answer1.getText());
            voice.speak("Answer, two");
            voice.speak(answer2.getText());
            voice.speak("Answer, three");
            voice.speak(answer3.getText());
            voice.speak("Answer, four");
            voice.speak(answer4.getText());
        }
        catch(Exception e){

        }
    }//GEN-LAST:event_voiceBtnActionPerformed

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
            java.util.logging.Logger.getLogger(SaudiArabiaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaudiArabiaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaudiArabiaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaudiArabiaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SaudiArabiaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Japanlbl;
    private javax.swing.JLabel Scorelbl1;
    private javax.swing.JButton answer1;
    private javax.swing.JButton answer2;
    private javax.swing.JButton answer3;
    private javax.swing.JButton answer4;
    private javax.swing.JLabel bgimage;
    private javax.swing.JButton jButtonback;
    private javax.swing.JButton nBtn;
    private javax.swing.JLabel questionlbl;
    private javax.swing.JButton voiceBtn;
    private javax.swing.JButton yBtn;
    // End of variables declaration//GEN-END:variables
}

/*
 * Copyright (c) Shawn M. Crawford All Rights Reserved.
 */
package ui;

import generator.PasswordGenerator;
import javax.swing.JOptionPane;

/**
 *
 * @author Shawn M. Crawford
 */
public class SolarJetmanPasswordGeneratorUI extends javax.swing.JFrame {

    /**
     * Creates new form SolarJetmanPasswordGeneratorUI
     */
    public SolarJetmanPasswordGeneratorUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonGeneratePassword = new javax.swing.JButton();
        comboBoxLives = new javax.swing.JComboBox();
        comboBoxLevel = new javax.swing.JComboBox();
        comboBoxMapType = new javax.swing.JComboBox();
        comboBoxPod = new javax.swing.JComboBox();
        checkBoxShields = new javax.swing.JCheckBox();
        checkBoxThrusters = new javax.swing.JCheckBox();
        textFieldPassword = new javax.swing.JTextField();
        labelLives = new javax.swing.JLabel();
        labelScore = new javax.swing.JLabel();
        labelLevel = new javax.swing.JLabel();
        labelMapType = new javax.swing.JLabel();
        labelPod = new javax.swing.JLabel();
        labelPassword = new javax.swing.JLabel();
        textFieldScore = new javax.swing.JTextField();
        buttonAbout = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Solar Jetman Password Generator");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        buttonGeneratePassword.setText("Generate");
        buttonGeneratePassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGeneratePasswordActionPerformed(evt);
            }
        });

        comboBoxLives.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15" }));

        comboBoxLevel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Level 1: Zandor - Preludon", "Level 2: Zandor - Mexomorf", "Level 3: Zandor - Omebru", "Level 4: Frobof - Corso qwero", "Level 5: Frobof - Bokky", "Level 6: Frobof - Lemonte", "Level 7: Mugrim - Chorlton", "Level 8: Mugrim - Shishkebab", "Level 9: Mugrim - Zlaz torduz", "Level 10: Shobas - Shammy gen", "Level 11: Shobas - Shankoo", "Level 12: Shobas - Miplezur", "Level 13: Xexorm - Urownd", "Level 14: Xexorm - Dryn kup leez - Debug", "Level 15: Unknown - Debug", "Level 16: Unknown - Debug", "Level 17: Unknown - Debug", "Level 18: Unknown - Debug", "Level 19: Unknown - Debug", "Level 20: Unknown - Debug", "Level 21: Unknown - Debug", "Level 22: Unknown - Debug", "Level 23: Unknown - Debug", "Level 24: Unknown - Debug", "Level 25: Unknown - Debug", "Level 26: Unknown - Debug", "Level 27: Unknown - Debug", "Level 28: Warp Zone 5, 6, 7", "Level 29: Warp Zone 9, 10", "Level 30: Unknown - Debug", "Level 31: Unknown - Debug", "Level 32: Unknown - Debug", "Level 33: Unknown - Debug", "Level 34: Unknown - Debug", "Level 35: Unknown - Debug", "Level 36: Unknown - Debug", "Level 37: Unknown - Debug", "Level 38: Unknown - Debug", "Level 39: Unknown - Debug", "Level 40: Unknown - Debug", "Level 41: Unknown - Debug", "Level 42: Unknown - Debug", "Level 43: Unknown - Debug", "Level 44: Unknown - Debug", "Level 45: Unknown - Debug", "Level 46: Unknown - Debug", "Level 47: Unknown - Debug", "Level 48: Unknown - Debug", "Level 49: Unknown - Debug", "Level 50: Unknown - Debug", "Level 51: Unknown - Debug", "Level 52: Unknown - Debug", "Level 53: Unknown - Debug", "Level 54: Unknown - Debug", "Level 55: Unknown - Debug", "Level 56: Unknown - Debug", "Level 57: Unknown - Debug", "Level 58: Unknown - Debug", "Level 59: Unknown - Debug", "Level 60: Unknown - Debug", "Level 61: Unknown - Debug", "Level 62: Unknown - Debug", "Level 63: Unknown - Debug", "Level 64: Unknown - Debug" }));

        comboBoxMapType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "None", "Mapping Device", "Super Mapping Device", "Invalid" }));

        comboBoxPod.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Standard", "Nippon Sports Jetpod", "Italian Racing Jetpod", "Invalid" }));

        checkBoxShields.setText("Shields");

        checkBoxThrusters.setText("Double Strength Thrusters");
        checkBoxThrusters.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxThrustersActionPerformed(evt);
            }
        });

        labelLives.setText("Lives:");

        labelScore.setText("Score:");

        labelLevel.setText("Level:");

        labelMapType.setText("Map Type:");

        labelPod.setText("Pod:");

        labelPassword.setText("Password:");

        textFieldScore.setText("0");

        buttonAbout.setText("About");
        buttonAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAboutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(buttonAbout)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(buttonGeneratePassword))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(labelMapType)
                                                .addComponent(labelLevel)
                                                .addComponent(labelLives))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(comboBoxMapType, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(comboBoxPod, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(comboBoxLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(comboBoxLives, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(labelScore)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(textFieldScore, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addComponent(labelPod)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(checkBoxShields)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(checkBoxThrusters)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelPassword)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelLevel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMapType)
                    .addComponent(comboBoxMapType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPod)
                    .addComponent(comboBoxPod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelLives)
                    .addComponent(comboBoxLives, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFieldScore, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelScore))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkBoxShields)
                    .addComponent(checkBoxThrusters))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPassword)
                    .addComponent(textFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonGeneratePassword)
                    .addComponent(buttonAbout))
                .addGap(0, 8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonGeneratePasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGeneratePasswordActionPerformed

        String score = textFieldScore.getText();
        PasswordGenerator passwordGenerator = new PasswordGenerator();

        if (passwordGenerator.isValidScore(score)) {

            // Lives
            passwordGenerator.handleLives(Integer.parseInt(comboBoxLives.getSelectedItem().toString()));

            // Score
            passwordGenerator.handleScore(score);

            // Pod
            passwordGenerator.handlePod(comboBoxPod.getSelectedIndex());

            // Shields
            passwordGenerator.handleShields(checkBoxShields.isSelected());

            // Double Strength Thrusters
            passwordGenerator.handleThrusters(checkBoxThrusters.isSelected());

            // Level
            passwordGenerator.handleLevel(comboBoxLevel.getSelectedIndex());

            // Map Type
            passwordGenerator.handleMap(comboBoxMapType.getSelectedIndex());

            textFieldPassword.setText(passwordGenerator.generateCode());
            
        } else {
            System.out.println("Score was invalid.");
            JOptionPane.showMessageDialog(this,
                "Score should be between 0 and 999999.",
                "Invalid score",
                JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonGeneratePasswordActionPerformed

    private void checkBoxThrustersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxThrustersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkBoxThrustersActionPerformed

    private void buttonAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAboutActionPerformed
        JOptionPane.showMessageDialog(this,
            "NES Solar Jetman Password Generator by Shawn M. Crawford",
            "About",
            JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_buttonAboutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /**
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new SolarJetmanPasswordGeneratorUI().setVisible(true);

            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAbout;
    private javax.swing.JButton buttonGeneratePassword;
    private javax.swing.JCheckBox checkBoxShields;
    private javax.swing.JCheckBox checkBoxThrusters;
    private javax.swing.JComboBox comboBoxLevel;
    private javax.swing.JComboBox comboBoxLives;
    private javax.swing.JComboBox comboBoxMapType;
    private javax.swing.JComboBox comboBoxPod;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelLevel;
    private javax.swing.JLabel labelLives;
    private javax.swing.JLabel labelMapType;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JLabel labelPod;
    private javax.swing.JLabel labelScore;
    private javax.swing.JTextField textFieldPassword;
    private javax.swing.JTextField textFieldScore;
    // End of variables declaration//GEN-END:variables

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author usmck
 */
public class WelcomePanel extends javax.swing.JPanel {


    private javax.swing.JLabel welcomeLabel;

    public WelcomePanel() {
        initComponents();
    }

    private void initComponents() {
        welcomeLabel = new javax.swing.JLabel();

        


        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setText("Welcome to the Meaghan Paige Inventory Tracker!");
        this.add(welcomeLabel);
    }
}

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

    private javax.swing.JButton createReportButton;
    private javax.swing.JButton addBoutiqueButton;
    private javax.swing.JLabel welcomeLabel;
    
        public WelcomePanel() {
        initComponents();
    }

    private void initComponents() {

        welcomeLabel = new javax.swing.JLabel();
        createReportButton = new javax.swing.JButton();
        addBoutiqueButton = new javax.swing.JButton();

        welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcomeLabel.setText("Welcome to the Meaghan Paige Inventory Tracker!");

        createReportButton.setText("Create Report");
        createReportButton.setToolTipText("Creates an updated report from the database.");

        addBoutiqueButton.setText("Add Boutique");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(welcomeLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(createReportButton)
                                                        .addComponent(addBoutiqueButton))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(welcomeLabel)
                                .addGap(18, 18, 18)
                                .addComponent(createReportButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addBoutiqueButton)
                                .addContainerGap(279, Short.MAX_VALUE))
        );
    }
}

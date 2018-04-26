/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

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
        this.add(welcomeLabel);
        ImageIcon WelcomePageImage = new ImageIcon(this.getClass().getResource("/Images/welcomePageImg1.jpg"));
        this.welcomeLabel.setIcon(WelcomePageImage);
               
    }//End initComponents

        
}   

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.*;


public class MainTabbedPane extends JFrame{
    
    JPanel welcomePanel = new WelcomePanel(); // these panels should be separate classes that we create here
    JPanel importPanel = new JPanel();
     
    JLabel importLabel = new JLabel("Import");
    
    JTabbedPane mainTabbedPane = new JTabbedPane();
    
    public MainTabbedPane(){

        importPanel.add(importLabel);
        
        mainTabbedPane.add("Welcome Panel", welcomePanel);
        mainTabbedPane.add("Import Panel", importLabel);
        add(mainTabbedPane);
    }
    
}

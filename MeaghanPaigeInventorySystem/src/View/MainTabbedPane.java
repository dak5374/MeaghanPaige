/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.*;


public class MainTabbedPane extends JFrame{
    
    JPanel welcomePanel = new WelcomePanel();
    JPanel importPanel = new ImportPanel();
     
    
    JTabbedPane mainTabbedPane = new JTabbedPane();
    
    public MainTabbedPane(){
;
        
        mainTabbedPane.add("Welcome Panel", welcomePanel);
        mainTabbedPane.add("Import Panel", importPanel);
        add(mainTabbedPane);
    }
    
}

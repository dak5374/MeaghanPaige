package Control;

import javax.swing.UIManager.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.UIManager;

public class MeaghanPaigeInventorySystem {

    public static void main(String[] args) {
        
        
        try {
    for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
        if ("Nimbus".equals(info.getName())) {
            UIManager.setLookAndFeel(info.getClassName());
            break;
        }
    }
} catch (Exception e) {
    
}
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dim = toolkit.getScreenSize();
        MainTabbedPane mTP = new MainTabbedPane();
        mTP.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        if (dim.width < 1601 && dim.height < 900) {
        mTP.setSize(dim.width,dim.height);
        
        } else {
            mTP.setSize(1600, 900);
        }
        mTP.setVisible(true);

    }
    
}

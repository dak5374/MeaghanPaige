package Control;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class MeaghanPaigeInventorySystem {

    public static void main(String[] args) {

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

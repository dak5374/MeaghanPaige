package Control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import View.MainTabbedPane;
import javax.swing.JFrame;

public class MeaghanPaigeInventorySystem {

    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        MainTabbedPane mTP = new MainTabbedPane();
        mTP.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mTP.setSize(600, 400);
        mTP.setVisible(true);

        try {

            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
        } catch (ClassNotFoundException cnfex) {

            System.out.println("Problem in loading or "
                    + "registering MS Access JDBC driver");
            cnfex.printStackTrace();
        }

        try {

            String msAccDB = "IST440MeaghanPaige.accdb";
            String dbURL = "jdbc:ucanaccess://src/Control/" + msAccDB;
            System.out.println("not connected");
            connection = DriverManager.getConnection(dbURL);
            System.out.println("connected");
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM CLIENT");
            System.out.println("CLIENT ID\t\tName\t\t\tAddress\t\t\t\t\tCity");
            System.out.println("==\t\t\t================\t===\t=======");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt(1) + "\t\t\t"
                        + resultSet.getString(2) + "\t\t"
                        + resultSet.getString(3) + "\t"
                        + resultSet.getString(4));
            }
        } catch (SQLException sqlex) {
            System.out.println("line 52");
            sqlex.printStackTrace();
        } finally {
        }
            try {
                if (null != connection) {

                    resultSet.close();
                    statement.close();

                    connection.close();
                }
            } catch (SQLException sqlex) {
                System.out.println("line 67");
                sqlex.printStackTrace();
                
            }
        }
    }

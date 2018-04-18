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

            String msAccDB = "IST440-Meaghan Paige.accdb";
            String dbURL = "jdbc:ucanaccess://" + msAccDB;
            connection = DriverManager.getConnection(dbURL);
            statement = connection.createStatement();
//            resultSet = statement.executeQuery("SELECT * FROM PLAYER");
//            System.out.println("ID\tName\t\t\tAge\tMatches");
//            System.out.println("==\t================\t===\t=======");
//            while (resultSet.next()) {
//                System.out.println(resultSet.getInt(1) + "\t"
//                        + resultSet.getString(2) + "\t"
//                        + resultSet.getString(3) + "\t"
//                        + resultSet.getString(4));
//            }
        } catch (SQLException sqlex) {
            sqlex.printStackTrace();
        } finally {
        }
            try {
                if (null != connection) {

                    // cleanup resources, once after processing
                    resultSet.close();
                    statement.close();

                    // and then finally close connection
                    connection.close();
                }
            } catch (SQLException sqlex) {
                sqlex.printStackTrace();
            }
        }
    }

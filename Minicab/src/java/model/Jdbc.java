/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.sun.rowset.internal.Row;
import java.sql.Connection;
import java.sql.Date;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Time;
import static java.sql.Types.NULL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author me-aydin
 */
public class Jdbc {

    Connection connection = null;
    Statement statement = null;
    ResultSet rs = null;
    //String query = null;

    public Jdbc(String query) {
        //this.query = query;
    }

    public Jdbc() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void connect(Connection con) {
        connection = con;
    }

    private ArrayList rsToList() throws SQLException {
        ArrayList aList = new ArrayList();

        int cols = rs.getMetaData().getColumnCount();
        while (rs.next()) {
            String[] s = new String[cols];
            for (int i = 1; i <= cols; i++) {
                s[i - 1] = rs.getString(i);
            }
            aList.add(s);
        } // while    
        return aList;
    } //rsToList

    private String makeTable(ArrayList list) {
        StringBuilder b = new StringBuilder();
        String[] row;
        b.append("<table border=\"3\">");
        for (Object s : list) {
            b.append("<tr>");
            row = (String[]) s;
            for (String row1 : row) {
                b.append("<td>");
                b.append(row1);
                b.append("</td>");
            }
            b.append("</tr>\n");
        } // for
        b.append("</table>");
        return b.toString();
    }//makeHtmlTable

    private void select(String query) {
        //Statement statement = null;

        try {
            statement = connection.createStatement();
            rs = statement.executeQuery(query);
            //statement.close();
        } catch (SQLException e) {
            System.out.println("way way" + e);
            //results = e.toString();
        }
    }

    public String retrieve(String query) throws SQLException {
        String results = "";
        select(query);
//        try {
//          
//            if (rs==null)
//                System.out.println("rs is null");
//            else
//                results = makeTable(rsToList());
//        } catch (SQLException ex) {
//            Logger.getLogger(Jdbc.class.getName()).log(Level.SEVERE, null, ex);
//        }
        return makeTable(rsToList());//results;
    }

    public boolean exists(String user) {
        boolean bool = false;
        try {
            select("select username from users where username='" + user + "'");
            if (rs.next()) {
                System.out.println("TRUE");
                bool = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Jdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bool;
    }

    public boolean existsForlogin(String user, String password) {
        boolean bool = false;
        try {

            select("select * from users where username='" + user + "'" + " AND password='" + password + "'");
            if (rs.next()) {
                System.out.println("TRUE");
                bool = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Jdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return bool;
    }

    public String role(String user, String password) {
        String userRole = "";
        try {

            select("select * from users where username='" + user + "'" + " AND password='" + password + "'" + " AND role='admin'");
            if (rs.next()) {
                System.out.println("TRUE");
                userRole = "admin";
                return userRole;
            }
            select("select * from users where username='" + user + "'" + " AND password='" + password + "'" + " AND role='driver'");
            if (rs.next()) {
                System.out.println("TRUE");
                userRole = "driver";
                return userRole;
            }
            select("select * from users where username='" + user + "'" + " AND password='" + password + "'" + " AND role='customer'");
            if (rs.next()) {
                System.out.println("TRUE");
                userRole = "customer";
                return userRole;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Jdbc.class.getName()).log(Level.SEVERE, null, ex);
        }

        return userRole;
    }

    public void insert(String[] str) {
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement("INSERT INTO Users VALUES (?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, str[0].trim());
            ps.setString(2, str[1]);
            ps.setString(3, str[2].toLowerCase());
            ps.executeUpdate();
            ps.close();
            System.out.println("1 row added.");
        } catch (SQLException ex) {
            Logger.getLogger(Jdbc.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
//    public void driverDetails(String[] str){
//        Statement stmtName = null;
//        String query="SELECT * from DRIVERS";
//        try{
////            driverName = connection.prepareStatement("SELECT NAME from USERNAME.DRIVERS", PreparedStatement.RETURN_GENERATED_KEYS);
//            stmtName = connection.createStatement();
//            ResultSet rs = stmtName.executeQuery(query);
//            while(rs.next()){
//                String driverName = rs.getString("NAME"); 
//            }
//       
//        }catch (SQLException ex) {
//            Logger.getLogger(Jdbc.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//    }

    /**
     *
     * @param str
     */
    public void registerCustomer(String[] str) {
        PreparedStatement ps = null;
        PreparedStatement ps2 = null;
        try {
            ps = connection.prepareStatement("INSERT INTO Users VALUES (?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, str[5].trim());
            ps.setString(2, str[6]);
            ps.setString(3, "customer");
            ps.executeUpdate();
            ps2 = connection.prepareStatement("INSERT INTO customer VALUES (?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
            ps2.setString(1, str[0]);
            ps2.setString(2, str[1] + ", " + str[2] + ", " + str[3] + ", " + str[4]);
            ps2.setInt(3, 8);
            ps2.executeUpdate();

            ps2.close();
            ps.close();
            
            System.out.println("1 row added.");
        } catch (SQLException ex) {
            Logger.getLogger(Jdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(String[] str) {
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement("Update Users Set password=? where username=?", PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, str[1].trim());
            ps.setString(2, str[0].trim());
            ps.executeUpdate();

            ps.close();
            System.out.println("1 rows updated.");
        } catch (SQLException ex) {
            Logger.getLogger(Jdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete(String user) {

        String query = "DELETE FROM Users "
                + "WHERE username = '" + user.trim() + "'";

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException e) {
            System.out.println("way way" + e);
            //results = e.toString();
        }
    }

    public void closeAll() {
        try {
            rs.close();
            statement.close();
            //connection.close();                                         
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws SQLException {
        String str = "select * from users";

        String insert = "INSERT INTO `Users` (`username`, `password`) VALUES ('meaydin', 'meaydin')";
        String update = "UPDATE `Users` SET `password`='eaydin' WHERE `username`='meaydin' ";
        String db = "MyDB";

        Jdbc jdbc = new Jdbc(str);
        Connection conn = null;
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
//Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/MiniCabDatabase", "username", "password");
//conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db.trim(), "root", "");
        } catch (ClassNotFoundException | SQLException e) {

        }
        jdbc.connect(conn);
//        String[] users = {"george", "benim", "benim"};
//        System.out.println(jdbc.retrieve(str));
//        if (!jdbc.exists(users[0])) {
//            jdbc.insert(users);
//        } else {
//            jdbc.update(users);
//            System.out.println("user name exists, change to another");
//        }
//        jdbc.delete("aydinme");

        System.out.println(jdbc.retrieve(str));
        jdbc.closeAll();
    }

    public void login(String username, String password) throws SQLException {
        String str = "select * from users";
        String insert = "INSERT INTO `Users` (`username`, `password`) VALUES ('meaydin', 'meaydin')";
        String update = "UPDATE `Users` SET `password`='eaydin' WHERE `username`='meaydin' ";
        String db = "MyDB";

        Jdbc jdbc = new Jdbc(str);
        Connection conn = null;
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
//Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/MiniCabDatabase", "username", "password");
//conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/"+db.trim(), "root", "");
        } catch (ClassNotFoundException | SQLException e) {

        }
        jdbc.connect(conn);
        jdbc.delete("aydinme");

        System.out.println(jdbc.retrieve(str));
        jdbc.closeAll();

    }

    public String retrieve(String[] query) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
} //class


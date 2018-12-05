/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

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
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.netbeans.saas.google.GoogleMapService;
import org.netbeans.saas.RestResponse;

/**
 *
 * @author me-aydin
 */
public class Jdbc {

    Connection connection = null;
    Statement statement = null;
    ResultSet rs = null;
    int driverNumber = 1;
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
        ArrayList aList2 = new ArrayList();

        int cols = rs.getMetaData().getColumnCount();
        String columnName = rs.getMetaData().getColumnName(cols);
        while (rs.next()) {
            String[] s = new String[cols];
            for (int i = 1; i <= cols; i++) {
                s[i - 1] = rs.getString(i);
            }
            aList.add(s);

        } // while  
        return aList;
    } //rsToList

//    private ArrayList getColumnNames() throws SQLException {
//        ArrayList aList = new ArrayList();
//        int cols = rs.getMetaData().getColumnCount();
//        String columnName = rs.getMetaData().getColumnName(cols);
//        return columnName;
//    } //rsToList
    private String makeTable(ArrayList list) {
        StringBuilder b = new StringBuilder();
        String[] row;

        b.append("<table width=\'40%\'>");
        b.append("<tr>");
        b.append("<th>USER ID   </th>");
        b.append("<th>USERNAME  </th>");
        b.append("<th>ROLE  </th>");
        b.append("</tr>");
        for (Object s : list) {

            b.append("<tr>");
            row = (String[]) s;
            for (String row1 : row) {
                b.append("<td>");
                b.append(row1);
                b.append("</td>");
                b.append("<br>");
            }
            b.append("</tr>\n");
        } // for
        b.append("</table>");
        return b.toString();
    }//makeHtmlTable
    private String makeInvoice(ArrayList list) {
        StringBuilder b = new StringBuilder();
        String[] row;

        b.append("<table width=\'50%\' border=\'1\'>");
        b.append("<tr>");
        b.append("<th>INVOICE ID   </th>");
        b.append("<th>CUSTOMER NAME </th>");
        b.append("<th>CUSTOMER ID   </th>");
        b.append("<th>ADDRESS   </th>");
        b.append("<th>DESTINATION   </th>");
        b.append("<th>DATE  </th>");
        b.append("<th>TIME  </th>");
        b.append("<th>COST  </th>");
        b.append("</tr>");
        for (Object s : list) {

            b.append("<tr>");
            row = (String[]) s;
            for (String row1 : row) {
                b.append("<td>");
                b.append(row1);
                b.append("</td>");
                b.append("<br>");
            }
            b.append("</tr>\n");
        } // for
        b.append("</table>");
        return b.toString();
    }//makeHtmlTable

    private String assignDriver(ArrayList list) {
        StringBuilder b = new StringBuilder();
        String[] row;
//        int driverNumber = 1;
        b.append("<table width=\'50%\' border=\'1\'>");
        b.append("<tr>");
        b.append("<th>DRIVER NO.   </th>");
        b.append("<th>DRIVER NAME   </th>");
        b.append("</tr>");
        for (Object s : list) {
            row = (String[]) s;
            b.append("<tr>");
            b.append("<td>");
            b.append(driverNumber++);
            b.append("</td>");
            for (String row1 : row) {
                b.append("<td>");
                b.append(row1);
                b.append("</td>");
            }
            b.append("</tr>\n");
        }
        b.append("</table>");
        return b.toString();
    }

    private String displayDetails(ArrayList list) {
        StringBuilder b = new StringBuilder();
        String[] row;
        b.append("<table>");
        for (Object s : list) {

            row = (String[]) s;
            for (String row1 : row) {
                b.append("<tr>");
                b.append("<td>");
                b.append(row1);
                b.append("<br>");
                b.append("</td>");
                b.append("</tr>");
            }
        }
        b.append("</table>");
        return b.toString();
    }

    private String assignDemand(ArrayList list) {
        StringBuilder b = new StringBuilder();
        String[] row;

//        String[] driverrow;
        b.append("<table width=\'50%\' border=\'1\'>");
        b.append("<tr>");
        b.append("<th>DEMAND ID   </th>");
        b.append("<th>CUSTOMER NAME   </th>");
        b.append("<th>DESTINATION  </th>");
        b.append("<th>DATE  </th>");
        b.append("<th>TIME  </th>");
        b.append("<th>STATUS  </th>");
        b.append("<th>DRIVER  </th>");
        b.append("</tr>");
        for (Object s : list) {
            row = (String[]) s;
            b.append("<tr>");
            for (String row1 : row) {
                b.append("<td>");
                b.append(row1);
                b.append("</td>");
            }

            b.append("<td>");
            b.append("<select name=\'assignDriverSelect\'>");
            b.append("<option value=driverNumber>");
            b.append(driverNumber);
            b.append("</option>");
//            b.append("<option value=\'2\'>2</option>");
//            b.append("<option value=\'3\'>3</option>");
            b.append("</select>");
            b.append("</td>");
            b.append("</tr>\n");
        }
        b.append("</table>");
        return b.toString();
    }

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
        return displayDetails(rsToList());
    }
    
    public String tblretrieve(String query) throws SQLException {
        String results = "";
        select(query);
        return makeTable(rsToList());//results;
    }

    public String assignretrieve(String query) throws SQLException {
        String results = "";
        select(query);
        return assignDemand(rsToList());//results;
    }

    public String driverretrieve(String query) throws SQLException {
        String results = "";
        select(query);

        return assignDriver(rsToList());//results;
    }
    public String invoiceretrieve(String query) throws SQLException {
        String results = "";
        select(query);
//        return makeTable(rsToList());//results;
        return makeInvoice(rsToList());
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

            select("select * from users where username='" + user + "'" + " AND password='" + password + "'" + " AND roles='admin'");
            if (rs.next()) {
                System.out.println("TRUE");
                userRole = "admin";
                return userRole;
            }
            select("select * from users where username='" + user + "'" + " AND password='" + password + "'" + " AND roles='driver'");
            if (rs.next()) {
                System.out.println("TRUE");
                userRole = "driver";
                return userRole;
            }
            select("select * from users where username='" + user + "'" + " AND password='" + password + "'" + " AND roles='customer'");
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
            ps = connection.prepareStatement("INSERT INTO Users(USERNAME,PASSWORD,ROLES) VALUES (?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
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

    public void insertDriver(String[] str) {
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement("INSERT INTO DRIVERS(\"NAME\", REGISTRATION,USERS_ID) "
                    + "VALUES(?,?,(SELECT ID FROM USERS WHERE USERNAME='" + str[2] + "'))", PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, str[0].trim()); //name
            ps.setString(2, str[1]); //registration
            ps.executeUpdate();
            ps.close();

            System.out.println("1 row added.");
        } catch (SQLException ex) {
            Logger.getLogger(Jdbc.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void insertAllocation(String[] str) {
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement("UPDATE DEMANDS set DRIVER_ID=? where ID=?", PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setInt(1, Integer.parseInt(str[0]));//str[0] -> value of the select option
            ps.setInt(2, Integer.parseInt(str[1]));
            ps.executeUpdate();
            ps.close();
            System.out.println("1 row updated.");
        } catch (SQLException ex) {
            Logger.getLogger(Jdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @param str
     */
    public void registerCustomer(String[] str) {
        PreparedStatement ps = null;
        PreparedStatement ps2 = null;
        try {
            ps = connection.prepareStatement("INSERT INTO Users(USERNAME,PASSWORD,ROLES) VALUES (?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, str[6].trim());
            ps.setString(2, str[7]);
            ps.setString(3, "customer");
            ps.executeUpdate();
            ps2 = connection.prepareStatement("INSERT INTO CUSTOMERS(NAME,"
                    + "ADDRESS,USER_ID,EMAIL) VALUES (?,?,(SELECT ID from Users where "
                    + "USERNAME='" + str[6] + "'),?)", PreparedStatement.RETURN_GENERATED_KEYS);

            ps2.setString(1, str[0]);
            ps2.setString(2, str[2] + ", " + str[3] + ", " + str[4] + ", " + str[5] + ", ");
            ps2.setString(3, str[1]);//email
            ps2.executeUpdate();
            ps2.close();
            ps.close();

            System.out.println("1 row added.");
        } catch (SQLException ex) {
            Logger.getLogger(Jdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void requestCab(UserObject userobject, Journey journey) {
        PreparedStatement ps = null;
        String O = "Outstanding";
        try {
//            ps = connection.prepareStatement("INSERT INTO Demands(CUSTOMER_NAME,"
//                    + "CUSTOMER_ID,ADDRESS,DESTINATION,DEMANDS_DATE,DEMANDS_TIME,"
//                    + "STATUS) VALUES (?,(SELECT ID from CUSTOMERS where"
//                    + " USER_ID=(SELECT ID from USERS where USERNAME='"+str[0]+"')),"
//                    + "?,?,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
            ps = connection.prepareStatement("INSERT INTO Demands(CUSTOMER_NAME,"
                    + "CUSTOMER_ID,ADDRESS,DESTINATION,DEMANDS_DATE,DEMANDS_TIME,"
                    + "STATUS,COST) VALUES ((SELECT NAME from CUSTOMERS where "
                    + "USER_ID =(SELECT ID from USERS where USERNAME='" + userobject.username + "')),"
                    + "(SELECT ID from CUSTOMERS where"
                    + " USER_ID=(SELECT ID from USERS where USERNAME='" + userobject.username + "')),"
                    + "?,?,?,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
            ps.setString(1, journey.pickUpPoint); //address
            ps.setString(2, journey.destination); //destination
            ps.setString(3, journey.date); //str[3]
            ps.setString(4, journey.time); //str[4]
            ps.setString(5, O); //status
            ps.setString(6, journey.cost); //status
            ps.executeUpdate();
            ps.close();

            System.out.println("1 row added.");
        } catch (SQLException ex) {
            Logger.getLogger(Jdbc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public double retrieve2(String query) throws SQLException {
        String results = "";
        select(query);
        return displayDetailsV(rsToList());
    }

    private double displayDetailsV(ArrayList list) {
        StringBuilder b = new StringBuilder();
        String[] row;
        double total = 0;
        b.append("<table>");
        for (Object s : list) {

            row = (String[]) s;
            for (String row1 : row) {
                total += Double.parseDouble(row1);
                b.append(row1);

            }
        }

        return total;
    }

//    public void storePrice(String[] str) {
//        PreparedStatement ps = null;
//        try {
//            String a = "1";
//            ps = connection.prepareStatement("INSERT INTO CALCULATIONS"
//                    + "(Destination1, Destination2, Price) VALUES(?,?,?)");
////        
//            ps.setString(1, str[0]);
//            ps.setString(2, str[1]);
//            ps.setInt(3, Integer.parseInt(str[2]));
////            ps.setInt(3, str[2]);
//            ps.executeUpdate();
//            ps.close();
//        } catch (SQLException ex) {
//            Logger.getLogger(Jdbc.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
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

    public void delete(String[] user) {
        //if role=customer do this...
        String query = "DELETE FROM CUSTOMERS where CUSTOMERS.USER_ID ="
                + "(SELECT ID FROM USERS WHERE USERNAME='" + user[0] + "')";
        String query2 = "DELETE FROM USERS where USERNAME='" + user[0] + "';";

        String driverQ = "DELETE FROM DRIVERS where DRIVERS.USERS_ID ="
                + "(SELECT ID FROM USERS WHERE USERNAME='" + user[0] + "')";
        try {
            if (user[2] == "customer") {
                statement = connection.createStatement();
                statement.executeUpdate(query);
            } else {
                statement = connection.createStatement();
                statement.executeUpdate(driverQ);
            }
            statement.executeUpdate(query2);
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
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/AlphaCab", "group10", "groupten");
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
            conn = DriverManager.getConnection("jdbc:derby://localhost:1527/AlphaCab", "group10", "groupten");
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

    public void map() {
        try {
            String address = "16 Network Circle, Menlo Park";
            java.lang.Integer zoom = 15;
            String iframe = "false";

            RestResponse result = GoogleMapService.getGoogleMap(address, zoom, iframe);
            //TODO - Uncomment the print Statement below to print result.
            //System.out.println("The SaasService returned: "+result.getDataAsString());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static double calculateFee(double distance) {
        double rate = 2.00;
        double fee = distance * rate;
        if (distance < 5) {
            fee = 10;
        } else {
            fee = (10 + (distance - 5) * rate);
        }

        DecimalFormat f = new DecimalFormat("##.00");
        fee = Double.parseDouble(f.format(fee));
        return fee;
    }

}

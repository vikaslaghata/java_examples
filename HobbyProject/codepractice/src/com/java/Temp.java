import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Temp {

    private static Connection conn = null;
    private static Statement stmt = null;
    
    public static void main(String[] args) {
    	String email  = "vikas@abc.com";
    	System.out.println("Creating new user with email = "+email);
    	//openConnection();
    	
    	insertCustomer(123,"vikas@abc.com","abcd1234");
    	
    	//closeConnection();
    	
    }
   
    public static boolean insertCustomer(Integer customerNumber, String email, String password) {

        try {
            openConnection();
            System.out.println("Creating new user with email = "+email);
            StringBuffer insertCustomerSQL = new StringBuffer();
            insertCustomerSQL
                .append("INSERT INTO epm_eis_bud2.customer(customer_number, customer_password, customer_email) values(?, ?, ?)");
            PreparedStatement preparedStmt = conn.prepareStatement(insertCustomerSQL.toString());

            preparedStmt.setInt(1, customerNumber);
            preparedStmt.setString(2, password);
            preparedStmt.setString(3, email);

            System.out.println("insertCustomerSQL=" +preparedStmt.toString());
            preparedStmt.executeUpdate();
            return true;
        } catch (SQLException e) {
        	System.out.println("___________________________ "+ e);
            return false;
        } finally {
            closeConnection();
        }

    }
    
 
    public boolean checkCustomerEmailAuthorisation (String email) throws Exception {
        try {
            this.openConnection();            
	    	StringBuffer readCustomerSQL = new StringBuffer();            
	        readCustomerSQL.append("SELECT 1 FROM epm_eis_bud2.customer where customer_email=? ");
	        PreparedStatement preparedStmt = conn.prepareStatement(readCustomerSQL.toString());
	        preparedStmt.setString(1, email);
	        
	        ResultSet rs = preparedStmt.executeQuery();
	        System.out.println("readCustomerSQL=" + readCustomerSQL.toString()+" result= "+rs);
	        return rs.next();
	    } catch (SQLException e) {			
            throw new Exception("Exception: " + e.getMessage());
        } finally {
            this.closeConnection();
        }
    }

    private static void openConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            //conn = DriverManager.getConnection("jdbc:h2:" + "./Database/my", "root", "mypassword");
            conn = DriverManager.getConnection("jdbc:mysql://ec2-54-93-101-84.eu-central-1.compute.amazonaws.com:3306/","epm_eis_bud2","N#yD8PPo4ope");

            //System.out.println("Database Created ");

            StringBuffer createTableSQL = new StringBuffer();
            createTableSQL.append("CREATE TABLE IF NOT EXISTS epm_eis_bud2.customer");
            createTableSQL.append("( customer_number INTEGER PRIMARY KEY, ");
            createTableSQL.append(" customer_password VARCHAR(80), ");
            createTableSQL.append(" customer_email VARCHAR(50)) ");

            System.out.println("createTableSQL=" + createTableSQL.toString());
            

            stmt = conn.createStatement();

            stmt.executeUpdate(createTableSQL.toString());
            System.out.println("Database connected");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void closeConnection() {
        try {
            conn.close();
            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        stmt = null;
        conn = null;
    }

}

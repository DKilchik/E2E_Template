package core.utilities.db;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DatabaseQuery {

    private Connection connection;
    // TODO implement reading url value from config
    private String url = "jdbc:sqlite:/home/dmitry/InStatProjects/E2E_Template/samples/sample";
    private Statement stmt;
    private ResultSet rs;
    private List<Map<String, ?>> result = new ArrayList<Map<String, ?>>();


    public DatabaseQuery(String query) {
        this.connection = null;
        try {
            // get DB connection
            connection = DriverManager.getConnection(url);
            connection.setAutoCommit(false);

            // TODO Implement logger
            System.out.println("Connection to SQLite has been established.");

            //statement object
            stmt = connection.createStatement();

            //get query result as ResultSet object
            rs = stmt.executeQuery( query );

            // get column count
            ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();
            // iteration to add all entities to result array
            while (rs.next()) {
                Map<String, Object> row = new HashMap<String, Object>();
                for (int i = 1; i <= columns; i++) {
                    row.put(md.getColumnLabel(i).toUpperCase(), rs.getObject(i));
                }
                result.add(row);
            }

        } catch (SQLException e){
            System.out.println(e.getMessage());

        } finally {
            try {
                if (!stmt.isClosed()){
                    stmt.close();
                }
                if (connection != null){
                    connection.close();
                }
            } catch (SQLException | NullPointerException ex){
                System.out.println("Finalization doesn't work");
                System.out.println(ex.getMessage());

            }
        }

    }


    public List getResult() {
        return result;
    }

}

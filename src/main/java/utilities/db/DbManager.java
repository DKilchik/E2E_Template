package utilities.db;

import utilities.configuration.Configuration;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DbManager {

    private Connection connection;
    private String url = Configuration.getDatabaseURI();
    private Statement stmt;
    private ResultSet rs;
    private List<Map<String, ?>> result = new ArrayList<Map<String, ?>>();


    public DbManager() throws IOException {
        this.connection = null;

    }

    public List getQuery(String query) {
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
        return result;
    }

}

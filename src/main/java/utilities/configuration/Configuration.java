package utilities.configuration;


import utilities.cfgreader.ConfigReader;

import java.io.IOException;

public class Configuration {

    public static String projectPath = System.getProperty("user.dir");

    public static String getDatabaseURI() throws IOException {
        String databaseURI = new ConfigReader().getPropValue("DB");
        return "jdbc:sqlite:" + projectPath + databaseURI;
    }
}

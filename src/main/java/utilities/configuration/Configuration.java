package utilities.configuration;


import utilities.cfgreader.ConfigReader;

import java.io.IOException;
import java.time.Duration;

public class Configuration {

    public static String projectPath = System.getProperty("user.dir");
    public static Duration defaultTimeout = Duration.ofSeconds(20);

    public static String getDatabaseURI() throws IOException {
        String databaseURI = new ConfigReader().getPropValue("DB");
        return "jdbc:sqlite:" + projectPath + databaseURI;
    }
}

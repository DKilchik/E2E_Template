package unittests.configuration;

import org.testng.annotations.Test;
import utilities.configuration.Configuration;

import java.io.IOException;

import static org.testng.Assert.*;

public class ConfigurationTest {

    @Test
    public void testProjectPath(){
        assertTrue(Configuration.projectPath.contains("E2E_Template"));
    }

    @Test
    public void testDbProp() throws IOException {
        String dbURL = Configuration.getDatabaseURI();
        assertTrue(dbURL.contains("sample"));
    }
}
package core.utilities.cfgreader;

import org.testng.annotations.Test;

import java.io.IOException;

import static org.testng.Assert.*;

public class ConfigReaderTest {

    @Test
    public void testGetPropValue() throws IOException {
        String prop = new ConfigReader().getPropValue("test");
        assertEquals(prop, "test");
    }
}
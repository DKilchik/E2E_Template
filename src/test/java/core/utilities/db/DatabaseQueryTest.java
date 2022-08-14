package core.utilities.db;

import java.io.IOException;
import java.util.List;


public class DatabaseQueryTest {

    @org.testng.annotations.Test
    public void testGetResult() throws IOException {
        List result = new DatabaseQuery("Select * FROM test").getResult();
        assert(!result.isEmpty());
    }
}
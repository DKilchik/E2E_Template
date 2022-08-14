package unittests.db;

import utilities.db.DbManager;

import java.io.IOException;
import java.util.List;


public class DbManagerTest {

    @org.testng.annotations.Test
    public void testGetResult() throws IOException {
        List result = new DbManager().getQuery("Select * FROM test");
        assert(!result.isEmpty());
    }
}
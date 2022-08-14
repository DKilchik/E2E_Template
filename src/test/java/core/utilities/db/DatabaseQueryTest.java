package core.utilities.db;

import java.util.List;


public class DatabaseQueryTest {

    @org.testng.annotations.Test
    public void testGetResult() {
        List result = new DatabaseQuery("Select * FROM test").getResult();
        assert(!result.isEmpty());
    }
}
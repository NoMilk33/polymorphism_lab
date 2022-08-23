package accounts;

import accounts.Current;
import org.junit.jupiter.api.BeforeEach;

public class CurrentTest {

    private Current current;

    @BeforeEach
    public void setUp(){
        current = new Current("Everyday",12345,true);
    }
}
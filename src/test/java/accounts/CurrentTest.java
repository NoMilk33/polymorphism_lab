package accounts;

import accounts.Current;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CurrentTest {

    private Current current;

    @BeforeEach
    public void setUp(){
        current = new Current("Everyday",12345,true);
    }

    @Test
    public void canDepositCash__noArgument(){
        String expected = "Thanks for paying in a deposit!";
        String actual = current.depositCash();
        assertEquals(expected, actual);
    }

    @Test
    public void canDepositCash__withArgument(){
        String expected = "We heard you! You want to deposit ten pounds.";
        String actual = current.depositCash("deposit ten pounds");
        assertEquals(expected, actual);
    }
}
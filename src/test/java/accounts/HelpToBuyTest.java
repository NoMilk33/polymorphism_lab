package accounts;

import org.junit.jupiter.api.BeforeEach;

public class HelpToBuyTest {

    private HelpToBuy helpToBuy;

    @BeforeEach
    public void setUp(){
        helpToBuy = new HelpToBuy("House Savings",300);
    }
}

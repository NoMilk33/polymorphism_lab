package bankingarms;

import org.junit.jupiter.api.BeforeEach;

public class BankingArmTest {

        private BankingArm bankingArm;

        @BeforeEach
        public void setup(){
            bankingArm = new BankingArm("Test BankingArm");
        }
}

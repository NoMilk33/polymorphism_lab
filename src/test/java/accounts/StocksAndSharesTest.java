package accounts;

import org.junit.jupiter.api.BeforeEach;

public class StocksAndSharesTest {

    private StocksAndShares stocksAndShares;

    @BeforeEach
    public void setUp(){
        stocksAndShares = new StocksAndShares("Crypto Fund",1.9);
    }
}

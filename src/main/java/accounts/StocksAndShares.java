package accounts;

public class StocksAndShares extends Account {

    private float portfolioBeta;

    public StocksAndShares (String name, float portfolioBeta){
        super(name);
        this.portfolioBeta = portfolioBeta;
    }
}

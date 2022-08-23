package accounts;

public class StocksAndShares extends Account {

    private double portfolioBeta;

    public StocksAndShares (String name, double portfolioBeta){
        super(name);
        this.portfolioBeta = portfolioBeta;
    }

    public String buyShares(){ // String vs Void
        return "You've just bought shares";
    }
}

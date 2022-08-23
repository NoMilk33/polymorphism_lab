package accounts;

import interfaces.IInvest;

public  class StocksAndShares extends Account implements IInvest {

    private double portfolioBeta;

    public String invest(int investment){
        return this.name + ("is investing %s pounds.",investment);
    }

    public StocksAndShares (String name, double portfolioBeta){
        super(name);
        this.portfolioBeta = portfolioBeta;
    }

    public String buyShares(){ // String vs Void
        return "You've just bought shares";
    }
}

package accounts;

public abstract class Account {

    protected String name;

    private int id;

    private int balance;

    public Account(String name, int id){ // what should I include in here
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public Account(String name) {
    }

    //    getters
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public int getBalance(){
        return balance;
    }

//    setters

    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    @Override //creating
    public String depositCash(){ //if void method, what changes
        return "Thanks for paying in a deposit!";
    }

    public String depositCash(String message){
        return String.format("We heard you! You want to %s.", message); //"Deposit ten pounds"
    }

    public abstract String withdrawCash(); // created abstract method, but need to go over this again
}

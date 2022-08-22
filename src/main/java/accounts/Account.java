package accounts;

public abstract class Account {

    private String name;
    private int id;
    private float balance;

//    constructor
    public Account (String name, int id, float balance){
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

//    getters

    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public float getBalance(){
        return balance;
    }

//    setters

    public void setName(String name){
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setBalance(float balance){
        this.balance = balance;
    }

    public void depositCash(){
        balance =+ ();
    }

    public void withdrawCash(){
        balance +- ();
    }
}

package divisions;

public class Division {

    private String name;
    private ArrayList<Account> accounts;

    public Division (String name){
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public ArrayList<Account> getAccounts(){
        return accounts;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAccounts(ArrayList<Account> accounts){
        this.accounts = accounts;
    }

    public void addAccount(Account account){
        this.accounts.add(account);
    }

    public void countAccount(){
        return this.accounts.size();
    }
}

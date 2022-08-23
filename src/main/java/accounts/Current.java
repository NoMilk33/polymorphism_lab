package accounts;

public class Current extends Account {

    private boolean empty;

    public Current(String name, int id, boolean empty){
        super(name);
        this.empty = empty;
    }

    public String payInterest(){
        return "You've been paid interest";
    }

}


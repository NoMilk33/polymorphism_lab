package accounts;

public class Current extends Account{

    private boolean empty;

    public Current(String name, boolean empty){
        super(name);
        this.empty = empty;
    }

}

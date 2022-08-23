package accounts;

public class Current extends Account {

    private boolean empty;

    public Current(String name, int id, boolean empty){
        super(name);
        this.empty = empty;
    }


}


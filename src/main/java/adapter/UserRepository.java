package adapter;

public class UserRepository {

    private final OldDatabase db;

    public UserRepository(OldDatabase db){
        this.db = db;
    }

    public void createUser(String username){
        this.db.runQuery("some query");
    }
}

package adapter;

public class NewDatabaseToOldDatabaseAdapter implements OldDatabase{

    private final NewDatabase newDatabase;

    public NewDatabaseToOldDatabaseAdapter(NewDatabase newDatabase){
        this.newDatabase = newDatabase;
    }

    @Override
    public void runQuery(String sql) {
        this.newDatabase.executeQuery(sql);
    }
}

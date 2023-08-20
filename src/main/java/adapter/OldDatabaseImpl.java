package adapter;

public class OldDatabaseImpl implements OldDatabase {
    @Override
    public void runQuery(String sql) {
        System.out.println("OldDatabase - ran query");
    }
}

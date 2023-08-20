package adapter;

public class NewDatabaseImpl implements NewDatabase{
    @Override
    public void executeQuery(String query) {
        System.out.println("NewDatabase - executed query");
    }
}

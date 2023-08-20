package adapter;

public class Main {
    public static void main(String[] args) {
        NewDatabase newDb = new NewDatabaseImpl();
        OldDatabase oldDb = new OldDatabaseImpl();
        OldDatabase adapted = new NewDatabaseToOldDatabaseAdapter(newDb);
        UserRepository repositoryWithAdapted = new UserRepository(adapted);
        UserRepository repositoryWithOld = new UserRepository(oldDb);
        repositoryWithOld.createUser("test");
        repositoryWithAdapted.createUser("test");
    }
}

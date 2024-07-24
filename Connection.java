public class Connection {
    private static Connection singleInstance = null;

    private Connection()
    {

    }

    public static Connection getInstance()
    {
        if(singleInstance == null) singleInstance = new Connection();
        return singleInstance;
    }
}

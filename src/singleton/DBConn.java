package singleton;

public class DBConn {
    private String dbURL;
    private String dbUser;
    private String dbPassword;

    private static DBConn instance;
    private DBConn() {
        // private constructor
    }

    public static DBConn getInstance() {
        if (instance == null) {
            instance = new DBConn();
        }
        return instance;
    }
}

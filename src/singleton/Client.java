package singleton;

public class Client {
    public static void main(String[] args) {
        DBConn dbConn1 = DBConn.getInstance();
        System.out.println("Connected to database db1:" + dbConn1);
        DBConn dbConn2 = DBConn.getInstance();
        System.out.println("Connected to database db2:" + dbConn2);
    }
}

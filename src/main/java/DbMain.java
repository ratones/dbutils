import adapters.OracleDatabaseAdapter;

public class DbMain {
    public static void main(String[] args) {
        var adt = new OracleDatabaseAdapter().withQuery("").getDbObject().orElse("not found");
        System.out.println(adt);
    }
}

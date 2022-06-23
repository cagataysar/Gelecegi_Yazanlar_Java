public class OracleDBConnection extends DbConnection{

    public void openConnection() {
        System.out.println("Oracle bağlantısı açıldı");
    }

    public void closeConnection() {
        System.out.println("Oracle bağlantısı kapandı");
    }

    public void executeQuery(String sql) {
        System.out.println("Oracle komutları çalıştırıldı");
    }
}

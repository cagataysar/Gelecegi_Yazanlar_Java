public class MySQLConnection extends DbConnection{

    public void openConnection() {
        System.out.println("MySQL bağlantısı açıldı");
    }

    public void closeConnection() {
        System.out.println("MySQL bağlantısı kapandı");
    }

    public void executeQuery(String sql) {
        System.out.println("MySQL komutları çalıştırıldı");
    }
}

public class MsSQLConnection extends DbConnection{

    public void openConnection() {
        System.out.println("MsSQL bağlantısı açıldı");
    }

    public void closeConnection() {
        System.out.println("MsSQL bağlantısı kapandı");
    }

    public void executeQuery(String sql) {
        System.out.println("MsSQL komutları çalıştırıldı");
    }
}

public class DbConnection {

    public void openConnection() {
        System.out.println("Veritabanı bağlantısı açıldı");
    }

    public void closeConnection() {
        System.out.println("Veritabanı bağlantısı kapandı");
    }

    public void executeQuery(String sql) {
        System.out.println("SQL komutları çalıştırıldı");
    }


}

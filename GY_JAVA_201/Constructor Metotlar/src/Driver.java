public class Driver {

    int x;

    public Driver() {
        System.out.println("Constructor");
        x = 20;
    }

    public static void main(String[] args) {
        /*Driver driver = new Driver();
        System.out.println(driver.x);*/

        Student student = new Student("Ahmet", "Çalışkan", 12);
        System.out.println(student.name);
        System.out.println(student.surname);
        System.out.println(student.age);

        Student student1 = new Student();
        System.out.println(student1.name);
        System.out.println(student1.surname);
        System.out.println(student1.age);
    }
}

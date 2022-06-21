public class Student {

    public int number;
    public String name;
    public String surname;
    private int age;

    public void setAge(int y) {
        if (y > 0) {
            age = y;
        } else {
            System.out.println("Age error!");
        }
    }

    public void printInfo() {
        System.out.println("Name : " +name);
        System.out.println("Surname : " +surname);
        System.out.println("Age : " +age);
        System.out.println("Number : " +number);
    }

}

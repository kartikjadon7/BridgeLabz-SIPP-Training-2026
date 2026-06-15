class Student {
    static String college = "ABC College";
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();

        System.out.println(s1.college);
        System.out.println(s2.college);
    }
}
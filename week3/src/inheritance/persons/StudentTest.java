package inheritance.persons;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("I like numbers in Java - aren't they int-eresting?!");
        student.setName("Yasin");
        student.setAge(23);
        student.setAddress("Lüdinghausen");

        student.introduce();

    }
}

package persons;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student("I like numbers in Java - aren't they int-eresting?!");
        student.setName("Yasin");
        student.setAge(35);
        student.setAddress("Lüdinghausen");


        // Part II Expose a public method tellJoke() which prints out the joke
        // student.introduce();
        // student.tellJoke();

        // Part III (Bonus)
        student.introduce();

    }
}

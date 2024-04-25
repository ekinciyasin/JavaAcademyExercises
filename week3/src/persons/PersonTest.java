package persons;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Yasin");
        person.setAge(35);
        person.setAddress("Lüdinghausen");
        person.introduce();
    }
}

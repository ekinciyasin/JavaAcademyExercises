package persons;

public class Student extends Person {
    private String joke;

    public Student(String joke) {
        this.joke = joke;
    }

    // Part III (Bonus) Override introduce method
    @Override
    public void introduce() {
        super.introduce(); // Call the introduce method of the superclass (Person)
        tellJoke(); // Tell the joke
    }

    public void tellJoke(){
        System.out.println(joke);
    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }
}

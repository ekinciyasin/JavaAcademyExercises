package OOPBasics.calculator;

public class Calculator {
    private int value;

    public Calculator() {
        this.value = 0;
    }

    public void plus (int number){
        value += number;
    }

    public void multiply (int number){
        value *= number;
    }

    public void divide(int number){
        value /= number;
    }
    public int getResult(){
        return value;
    }
}

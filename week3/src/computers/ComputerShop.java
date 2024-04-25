package computers;


import java.util.ArrayList;

public class ComputerShop {
    private ArrayList<Computer> computers;

    public ComputerShop(ArrayList<Computer> computerList) {
        this.computers = computerList;
    }

    public double calculateTotalProfit() {
        double totalProfit = 0;
        for (Computer computer : computers) {
            totalProfit += computer.calculateProfit();
        }
        return totalProfit;
    }
}

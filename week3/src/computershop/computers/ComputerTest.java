package computershop.computers;

import java.util.ArrayList;

public class ComputerTest {
    public static void main(String[] args) {
        Computer computer1 = new Computer();
        Computer computer2 = new Computer("Lenovo", 15.6, true);
        Computer computer3 = new Computer("Acer", 3000, 8, 512, 4, 13.3, "Laptop", false);

        System.out.println("Computer1 " + computer1);
        System.out.println("Computer2 " +computer2);
        System.out.println("Computer3 " +computer3);

    //  Part II: Perform a memory upgrade and calculate profit
        computer3.setRamSizeGB(computer3.getRamSizeGB() * 2);
        System.out.println("computer with doubled ram" + computer3);

    // Part III: Calculate the potential profit within the Shop
        createComputersForComputerShop();

    }

    private static void createComputersForComputerShop() {
        Computer computer1 = new Computer("MSI", 3000, 16, 1000, 4, 14, "Laptop", true);
        computer1.setPurchasePrice(800);
        computer1.setSellingPrice(1200);

        Computer computer2 = new Computer("HP", 2500, 8, 500, 4, 15.6, "Desktop", true);
        computer2.setPurchasePrice(700);
        computer2.setSellingPrice(1100);

        Computer computer3 = new Computer("Dell", 3500, 32, 2000, 6, 13.3, "Laptop", true);
        computer3.setPurchasePrice(1000);
        computer3.setSellingPrice(1500);

        Computer computer4 = new Computer("Lenovo", 2800, 16, 1000, 4, 14, "Desktop", true);
        computer4.setPurchasePrice(750);
        computer4.setSellingPrice(1150);

        Computer computer5 = new Computer("Acer", 3200, 8, 500, 4, 15.6, "Laptop", true);
        computer5.setPurchasePrice(850);
        computer5.setSellingPrice(1300);

        ArrayList<Computer> computerList = new ArrayList<>();
        computerList.add(computer1);
        computerList.add(computer2);
        computerList.add(computer3);
        computerList.add(computer4);
        computerList.add(computer5);

        ComputerShop shop = new ComputerShop(computerList);

        double totalProfit = shop.calculateTotalProfit();

        // Print the result
        System.out.println("The Potential profit: €" + totalProfit);
    }
}
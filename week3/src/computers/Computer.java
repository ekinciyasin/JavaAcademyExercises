package computers;

public class Computer {

    private String manufacturerName;
    private int processorSpeedMHz;
    private int ramSizeGB;
    private int hardDriveSizeGB;
    private int numberOfUSBPorts;
    private double screenSizeInches;
    private String computerType;
    private boolean isPreinstalledOperatingSystem;
    private double purchasePrice;
    private double sellingPrice;

    public Computer() {
    }

    public Computer(String manufacturerName, double screenSizeInches, boolean isPreinstalledOperatingSystem) {
        this.manufacturerName = manufacturerName;
        this.screenSizeInches = screenSizeInches;
        this.isPreinstalledOperatingSystem = isPreinstalledOperatingSystem;
    }

    public Computer(String manufacturerName, int processorSpeedMHz, int ramSizeGB, int hardDriveSizeGB, int numberOfUSBPorts, double screenSizeInches, String computerType, boolean isPreinstalledOperatingSystem) {
        this.manufacturerName = manufacturerName;
        this.processorSpeedMHz = processorSpeedMHz;
        this.ramSizeGB = ramSizeGB;
        this.hardDriveSizeGB = hardDriveSizeGB;
        this.numberOfUSBPorts = numberOfUSBPorts;
        this.screenSizeInches = screenSizeInches;
        this.computerType = computerType;
        this.isPreinstalledOperatingSystem = isPreinstalledOperatingSystem;
    }

    public double calculateProfit(){
        return this.sellingPrice - this.purchasePrice;
    }

    @Override
    public String toString() {
        return "Computer: " + "\n" +
                "   manufacturerName='" + manufacturerName + "\n" +
                "   processorSpeedMHz=" + processorSpeedMHz +"\n" +
                "   ramSizeGB=" + ramSizeGB +"\n" +
                "   hardDriveSizeGB=" + hardDriveSizeGB +"\n" +
                "   numberOfUSBPorts=" + numberOfUSBPorts +"\n" +
                "   screenSizeInches=" + screenSizeInches +"\n" +
                "   computerType='" + computerType + '\'' +"\n" +
                "   isPreinstalledOperatingSystem=" + isPreinstalledOperatingSystem;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getProcessorSpeedMHz() {
        return processorSpeedMHz;
    }

    public void setProcessorSpeedMHz(int processorSpeedMHz) {
        this.processorSpeedMHz = processorSpeedMHz;
    }

    public int getRamSizeGB() {
        return ramSizeGB;
    }

    public void setRamSizeGB(int ramSizeGB) {
        this.ramSizeGB = ramSizeGB;
    }

    public int getHardDriveSizeGB() {
        return hardDriveSizeGB;
    }

    public void setHardDriveSizeGB(int hardDriveSizeGB) {
        this.hardDriveSizeGB = hardDriveSizeGB;
    }

    public int getNumberOfUSBPorts() {
        return numberOfUSBPorts;
    }

    public void setNumberOfUSBPorts(int numberOfUSBPorts) {
        this.numberOfUSBPorts = numberOfUSBPorts;
    }

    public double getScreenSizeInches() {
        return screenSizeInches;
    }

    public void setScreenSizeInches(double screenSizeInches) {
        this.screenSizeInches = screenSizeInches;
    }

    public String getComputerType() {
        return computerType;
    }

    public void setComputerType(String computerType) {
        this.computerType = computerType;
    }

    public boolean isPreinstalledOperatingSystem() {
        return isPreinstalledOperatingSystem;
    }

    public void setPreinstalledOperatingSystem(boolean preinstalledOperatingSystem) {
        isPreinstalledOperatingSystem = preinstalledOperatingSystem;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purschasePrice) {
        this.purchasePrice = purschasePrice;
    }
}

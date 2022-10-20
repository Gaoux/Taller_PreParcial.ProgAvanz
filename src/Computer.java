public class Computer {
    private static Long nextId= 0L;
    private String brand;
    private int RAM;
    private int SSD;
    private Processor processor = new Processor();
    private String  lockerAdress;
    private final Long id;


    public Computer() {
        this.id = getNextId();
    }

    public Computer(String brand, int RAM) {
        this.brand = brand;
        this.RAM = RAM;
        this.id = getNextId();
    }

    public Computer(String brand, int RAM, int SSD, Processor processor) {

        this.brand = brand;
        this.RAM = RAM;
        this.SSD = SSD;
        this.processor = processor;
        this.id = getNextId();
    }


    public static String compareProcessor(Computer computer1, Computer computer2){
    float efficiency1 = computer1.getProcessor().getNucleusCant()  *
            computer1.getProcessor().getClockFrequency();
    float efficiency2 = computer2.getProcessor().getNucleusCant()  *
            computer2.getProcessor().getClockFrequency();

    String message;
     if(efficiency1 > efficiency2)
          message = "Procesor #1 is better.";
    else if( efficiency1 < efficiency2)
          message = "Processor #2 is better.";
    else
          message = "Both processor are the same.";

    return message;
    }

    public static Long getNextId() {
        return nextId++;
    }

    public static void setNextId(Long nextId) {
        Computer.nextId = nextId;
    }

    public String getLockerAdress() {
        return lockerAdress;
    }

    public void setLockerAdress(String lockerAdress) {
        this.lockerAdress = lockerAdress;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getSSD() {
        return SSD;
    }

    public void setSSD(int SSD) {
        this.SSD = SSD;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }
}

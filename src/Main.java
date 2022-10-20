public class Main {

    public static void main(String[] args) {




    }

    static Computer createComputer(String brand,
                                   int RAM, int SSD,
                                   Processor processor){
        if(processor.getClockFrequency() <= 0)
        throw new IllegalArgumentException(" Clock frequency most be greater than 0");


return new Computer(brand, RAM, SSD, processor);
    }


}
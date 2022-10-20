public class Processor {

private float clockFrequency;
private int nucleusCant;
private int year;
private String architectureType;


public Processor(){
}
    public Processor( float clockFrequency, int nucleusCant,
     int year, String architectureType) {

    this.year = year;
    this.nucleusCant = nucleusCant;
    setClockFrequency(clockFrequency);
    this.architectureType = architectureType;

    }

    public String imprimir() {
        return "Processor" +
                "clockFrequency=" + clockFrequency +
                ", nucleusCant=" + nucleusCant +
                ", year=" + year +
                ", architectureType='" + architectureType;
    }

    public float getClockFrequency() {
        return clockFrequency;
    }
    public void setClockFrequency(float clockFrequency) {
        if( clockFrequency <= 0)
            throw new IllegalArgumentException(" Clock frequency most be greater than 0");

        this.clockFrequency = clockFrequency;
    }

    public int getNucleusCant() {
        return nucleusCant;
    }

    public void setNucleusCant(int nucleusCant) {
        this.nucleusCant = nucleusCant;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getArchitectureType() {
        return architectureType;
    }

    public void setArchitectureType(String architectureType) {
        this.architectureType = architectureType;
    }
}

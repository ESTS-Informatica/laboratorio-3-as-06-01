
/**
 * Write a description of class Van here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Van extends GroundTransportation
{
    private int numberOfPackages;
    public Van(String licensePlate, int numberOfPackages){
        super(licensePlate);
        this.numberOfPackages = numberOfPackages;
    }
    
    public int getNumberOfPackages() {
        return numberOfPackages;
    }

    public void setNumberOfPackages(int numberOfPackages) {
        this.numberOfPackages = numberOfPackages;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append(String.format("\n%15s: %s\n", "Matrícula", getLicensePlate())); 
        sb.append(String.format("%15s: %d\n", "Número de Pacotes", getNumberOfPackages()));
     
        return sb.toString();
    }
}

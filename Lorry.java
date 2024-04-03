
/**
 * Write a description of class Lorry here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lorry extends GroundTransportation
{
    private int numberOfPallets;
    private int numberOfTrailers;
    public Lorry(String licensePlate, int numberOfPallets, int trailers){
        super(licensePlate);
        this.numberOfPallets = numberOfPallets;
        this.numberOfTrailers = trailers;
    }
    
    public int getNumberOfPallets() {
        return numberOfPallets;
    }

    public void setNumberOfPallets(int numberOfPallets) {
        this.numberOfPallets = numberOfPallets;
    }

    public int getNumberOfTrailers() {
        return numberOfTrailers;
    }

    public void setTrailers(int numberOfTrailers) {
        this.numberOfTrailers = numberOfTrailers;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append(String.format("\n%15s: %s\n", "Matrícula", getLicensePlate())); 
        sb.append(String.format("\n%15s: %d\n", "Número de Paletes", getNumberOfPallets()));  
        sb.append(String.format("%15s: %s\n", "Número de Atrelados", getNumberOfTrailers()));
     
        return sb.toString();
    }
}

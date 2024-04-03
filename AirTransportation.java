
/**
 * Write a description of class AirTransportation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AirTransportation extends Transport
{
    private String name;
    private int numberOfContainers;
    private int price;
    private static final double FEE = 4.0;
    public AirTransportation(String name, int numberOfContainers){
        super();
        this.name = name;
        this.numberOfContainers = numberOfContainers;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfContainers() {
        return numberOfContainers;
    }

    public void setNumberOfContainers(int numberOfContainers) {
        this.numberOfContainers = numberOfContainers;
    }
    
    @Override
    public double getPriceWithFees(){
        return this.price * (1.0 + (FEE * 0.01)); 
    }
    
    @Override
    public String getTransportType(){
        return "Transporte aéreo";
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append(String.format("\n%15s: %s\n", "Nome", getName())); 
        sb.append(String.format("\n%15s: %s\n", "Tipo de transporte", getTransportType()));  
        sb.append(String.format("%15s: %4.2f%%\n", "Honorarios", this.FEE));
        sb.append(String.format("%15s: %4.2f%%\n", "Número de containers", getNumberOfContainers()));
        sb.append(String.format("%15s: %4.2f€\n", "Preço Final", getPriceWithFees()));
     
        return sb.toString();
    }
}


/**
 * Write a description of class GroundTransportation here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GroundTransportation extends Transport
{
    private String licensePlate;
    private int price;
    private static final double FEE = 3.0;
    public GroundTransportation(String licensePlate)
    {
        super();
        this.licensePlate = licensePlate;
    }
    
     public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }
    
    @Override
    public double getPriceWithFees(){
        return this.price * (1.0 + (FEE * 0.01)); 
    }
    
    @Override
    public String getTransportType(){
        return "Transporte terrestre";
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();

        sb.append(String.format("\n%15s: %s\n", "Matrícula", getLicensePlate())); 
        sb.append(String.format("\n%15s: %s\n", "Tipo de transporte", getTransportType()));  
        sb.append(String.format("%15s: %4.2f%%\n", "Honorarios", this.FEE));
        sb.append(String.format("%15s: %4.2f€\n", "Preço Final", getPriceWithFees()));
     
        return sb.toString();
    }
}

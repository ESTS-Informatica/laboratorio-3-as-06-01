

/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
     public static void main(String[] args) {
        ShippingCompany company = new ShippingCompany("RELIABLE-MOVING");
        GroundTransportation groundTransport = new GroundTransportation("123ABC");
        AirTransportation airTransport1 = new AirTransportation("Boeing 747", 3);
        AirTransportation airTransport2 = new AirTransportation("Airbus A380", 5);
        Lorry lorry = new Lorry("456DEF", 10, 2);
        Van van = new Van("789GHI", 20);
//        ArrayList<Transport> transport = new ArrayList<>();
        company.add(groundTransport);
        company.add(airTransport1);
        company.add(airTransport2);
        company.add(lorry);
        company.add(van);
        System.out.println(company.toString());
    }
}

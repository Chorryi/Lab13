
/**
 * Abstract class Parking - write a description of the class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Parking extends Airport
{
    public String getTotalParking()
    {
        return "600 Spots";
    }
    
    abstract String getAbleParking();
    abstract String getTakenParking();
    abstract String getElevators();
}

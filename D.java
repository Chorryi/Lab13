/**
 * Write a description of class D here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class D extends Parking implements Premium
{
    public String getTotalParking()
    {
        return "600 Spots";
    }
    
    abstract String getAbleParking();
    abstract String getTakenParking();
    abstract String getElevators();
}



public abstract class Terminals extends Airport
{
    public String getPlanes()
    {
        return "Planes";
    }
    
    public String getGates()
    {
        return "Gates";
    }
    
    abstract String getSchedule();
    abstract String getRestruants();
    abstract String getBathrooms();
}

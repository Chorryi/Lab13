
/**
 * Write a description of class C here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class C extends Lobby implements Lounge
{
    public String getTickets()
    {
        return "Tickets";
    }
    
    public String getLuggage()
    {
        return "Luggage";
    }
    
    public String getConcession()
    {
        return "Concession Stands are to the right";
    }
    
    public String getBathrooms()
    {
        return "Bathrooms are to the left";
    }
    
    public int getSeats()
    {
        return 50;
    }
    
    public String getDrinks()
    {
        return "test";
    }
}

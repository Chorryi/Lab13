public abstract class Lobby extends Airport
{
    public String getTickets()
    {
        return "Tickets";
    }
    
    public String getLuggage()
    {
        return "Luggage";
    }
    
    abstract String getConcession();
    abstract String getBathrooms();
}

public class InvalidHumanIDException extends Exception
{
    public InvalidHumanIDException()
    {
        super("Human ID must be positive!");
    }
}

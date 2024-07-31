
public class Logger
{
    private static Logger obj=new Logger();
    int value=0;
    private Logger()
    {
        
    }
    public static Logger getInstanceOfLogger()
    {
        return obj;
    }
    int  increamentvalue()
    {
       return ++value;
    }


}

/**
 *
 * @author art
 */
public class Relogio
{
    private int hour, minutes, seconds;

    public Relogio( int hour, int minutes, int seconds )
    {
        this.hour = hour;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    
    public void soma()
    {
        if ( seconds == 59 && minutes == 59 && hour == 23 )
        {
            seconds = 0;
            minutes = 0;
            hour = 0;
        }
        
        else if ( seconds == 59 && minutes == 59 )
        {
            seconds = 0;
            minutes = 0;
            hour ++;
        }
        
        else if ( seconds == 59 )
        {
            seconds = 0;
            minutes++;
        }
        
        else
        {
            seconds++;
        }
    }
    
    public void diminui()
    {
        if ( seconds == 0 && minutes == 0 && hour == 0 )
        {
            seconds = 0;
            minutes = 0;
            hour = 0;
        }
        
        else if ( seconds == 0 && minutes == 0 )
        {
            minutes = 59;
            seconds = 59;
            hour --;
        }
        
        else if ( seconds == 0 )
        {
            seconds = 59;
            minutes--;
        }
        
        else
        {
            seconds--;
        }
    }

    public String imprime()
    {
        return String.format("%02d", hour ) + ":" + String.format("%02d", minutes ) + ":" + String.format("%02d", seconds );
    }
    
    
    
    public static void main( String[] args ) throws Exception
    {
//        Relogio relogio = new Relogio( 23, 59, 50 );
//        
//        while ( true )
//        {
//            Thread.sleep( 1000 );
//            relogio.soma();
//            
//            System.out.println( relogio.imprime() );
//        }
        
        Relogio relogio = new Relogio( 1, 2, 3 );
        
        while ( true )
        {
            Thread.sleep( 1000 );
            relogio.diminui();
            
            System.out.println( relogio.imprime() );
        }
        
        
    }
}

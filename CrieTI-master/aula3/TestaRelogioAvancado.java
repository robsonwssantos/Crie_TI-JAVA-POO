/**
 *
 * @author art
 */
public class TestaRelogioAvancado
{
    public static void main( String[] args ) throws Exception
    {
        if ( Entrada.leiaBoolean( "O que você quer ver?", "Relógio", "Contagem Regressiva" ) )
        {
            Relogio relogio = new Relogio( Entrada.leiaInt( "hora" ), Entrada.leiaInt( "minuto" ), Entrada.leiaInt( "segundo" ) );

            while ( true )
            {
                Thread.sleep( 1000 );
                relogio.soma();

                System.out.println( relogio.imprime() );
            }
        }
        
        else
        {
            Relogio relogio = new Relogio( Entrada.leiaInt( "hora" ), Entrada.leiaInt( "minuto" ), Entrada.leiaInt( "segundo" ) );

            while ( true )
            {
                Thread.sleep( 1000 );
                relogio.diminui();

                System.out.println( relogio.imprime() );
            }
        }
    }
}

/**
 *
 * @author art
 */
public class TestaRelogio
{
    public static void main( String[] args )
    {
        //relógio incrementa
        Relogio relogio = new Relogio( 23, 59, 50 );
        relogio.soma();
        System.out.println( relogio.imprime() );
        relogio.soma();
        System.out.println( relogio.imprime() );
        relogio.soma();
        System.out.println( relogio.imprime() );
        relogio.soma();
        System.out.println( relogio.imprime() );
        relogio.soma();
        System.out.println( relogio.imprime() );
        relogio.soma();
        System.out.println( relogio.imprime() );
        relogio.soma();
        System.out.println( relogio.imprime() );
        relogio.soma();
        System.out.println( relogio.imprime() );
        
        //relógio regressivo
        relogio.diminui();
        System.out.println( relogio.imprime() );
        relogio.diminui();
        System.out.println( relogio.imprime() );
        relogio.diminui();
        System.out.println( relogio.imprime() );
        relogio.diminui();
        System.out.println( relogio.imprime() );
    }
}

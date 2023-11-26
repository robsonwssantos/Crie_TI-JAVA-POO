/**
 *
 * @author artur
 */
public class Fibonacci
{
    public static void main( String[] args ) 
    {
        int qtd = Entrada.leiaInt( "Quantos números deseja imprimir?" );
        
        if ( qtd < 2 )
        {
            System.out.println( "é necessário informar um número maior que 2" );
        }
        
        else
        {
            int num0 = 0;
            int num1 = 1;
        
            System.out.println( num0 );
            System.out.println( num1 );

            for ( int i = 0; i < ( qtd - 2); i++ )
            {
                int proximoValor = num0 + num1;

                num0 = num1;
                num1 = proximoValor;

                System.out.println( proximoValor );
            }
        }
        
        System.exit( 0 );
    }
}

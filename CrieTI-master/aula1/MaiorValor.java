/**
 *
 * @author artur
 */
public class MaiorValor
{
    public static void main( String[] args )
    {
        int vetor [] = new int [10];
        
        for ( int i = 0; i < vetor.length; i++ )
        {
            vetor[i] = Entrada.leiaInt( "Digite um número:" );
        }
        
        int menorIndex = 0;
        int maiorIndex = 0;
        
        for ( int i = 0; i < vetor.length; i++ )
        {
            if ( vetor[i] > vetor[maiorIndex] )
            {
                maiorIndex = i;
            }
            
            if ( vetor[i] < vetor[menorIndex] )
            {
                menorIndex = i;
            }
        }
        
        int maiorNumero = vetor[maiorIndex];
        int menorNumero = vetor[menorIndex];
        
        if ( ! ( maiorNumero < 10 ) )
        {
            System.out.println( "O número maior não é menor que 10" );
        }
        
        
        System.out.println( "Maior: " + vetor[maiorIndex] );
        System.out.println( "Maior Index: " + maiorIndex );
        System.out.println( "Menor: " + vetor[menorIndex] );
        System.out.println( "Menor Index: " + menorIndex );
        
        System.exit( 0 );
    }
}

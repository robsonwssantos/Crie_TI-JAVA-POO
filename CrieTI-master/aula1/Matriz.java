/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author artur
 */
public class Matriz
{
    public static final int NUMERO_MENOR_PERMITIDO = 2;
    public static final int TAMANHO_DO_VETOR = 15;
    
    public static void main( String[] args )
    {
        int vetor [] = new int[TAMANHO_DO_VETOR];
        int matriz [][] = new int[3][5];
        
        for ( int i = 0; i < vetor.length; i++ )
        {
            int valor = 0;
            
            while ( valor < NUMERO_MENOR_PERMITIDO )
            {
                valor = Entrada.leiaInt( "Digite um valor?" );
            }
            
            vetor[i] = valor;
        }
        
        int contadorGlobal = 0;
        
        for ( int i = 0; i < matriz.length; i++ )
        {
            for ( int j = 0; j < matriz[i].length; j++ )
            {
                matriz[i][j] = vetor[contadorGlobal++];
            }
        }
        
        for ( int i = 0; i < matriz.length; i++ )
        {
            System.out.println( "" );
            
            for ( int j = 0; j < matriz[i].length; j++ )
            {
                System.out.print( " " + matriz[i][j] + "" );
            }
        }
        
        System.exit( 0 );
    }
}

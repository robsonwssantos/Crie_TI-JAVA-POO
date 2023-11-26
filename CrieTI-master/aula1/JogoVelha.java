/**
 *
 * @author artur
 */
public class JogoVelha
{

    private static int cont = 0;
    private static boolean vencedor = false;

    public static void main( String[] args )
    {
        char matriz_jogo[][] = new char[3][3];
        int linha;
        int coluna;
        String nome1;
        String nome2;

        for ( int i = 0; i < matriz_jogo.length; i++ )
        {
            for ( int j = 0; j < matriz_jogo.length; j++ )
            {
                matriz_jogo[i][j] = ' ';
            }
        }
        nome1 = Entrada.leiaString( "Nome do Jogador 1:  " );
        nome2 = Entrada.leiaString( "Nome do Jogador 2:  " );

        while ( vencedor != true && cont != 9 )
        {

            System.out.println( nome1 + " Sua Vez" );
            linha = Entrada.leiaInt( "Linha:  " );
            coluna = Entrada.leiaInt( "Coluna:  " );
            linha--;
            coluna--;
            boolean valida = false;
            for ( int i = 0; i < matriz_jogo.length; i++ )
            {
                for ( int j = 0; j < matriz_jogo.length; j++ )
                {
                    if ( ( linha == i && coluna == j ) )
                    {
                        if ( matriz_jogo[i][j] == ' ' )
                        {
                            matriz_jogo[i][j] = 'O';
                            valida = true;
                        }
                    }
                }
            }
            if ( valida )
            {
                imprimeMatriz( matriz_jogo );
                verificaVencedor( 'O', matriz_jogo, nome1 );
            }
            else
            {
                System.out.println( "\t\tJogada Invalida\n\t\tPerde a Vez " );
            }
            if ( !vencedor )
            {
                System.out.println( nome2 + " Sua Vez" );
                linha = Entrada.leiaInt( "Linha:  " );
                coluna = Entrada.leiaInt( "Coluna:  " );
                valida = false;
                linha--;
                coluna--;
                for ( int i = 0; i < matriz_jogo.length; i++ )
                {
                    for ( int j = 0; j < matriz_jogo.length; j++ )
                    {
                        if ( ( linha == i && coluna == j ) )
                        {
                            if ( matriz_jogo[i][j] == ' ' )
                            {
                                matriz_jogo[i][j] = 'X';
                                valida = true;
                            }
                        }
                    }
                }
                if ( valida )
                {
                    imprimeMatriz( matriz_jogo );
                    verificaVencedor( 'X', matriz_jogo, nome2 );
                }
                else
                {
                    System.out.println( "\t\tJogada Invalida\n\t\tPerde a Vez " );
                }
            }
        }
        System.exit( 0 );
    }

    public static void imprimeMatriz( char mat[][] )
    {
        for ( int i = 0; i < mat.length; i++ )
        {
            for ( int j = 0; j < mat.length; j++ )
            {
                if ( ( j == 0 && i != 2 ) )
                {
                    if ( mat[i][j] != ' ' )
                    {
                        System.out.print( "_" + mat[i][j] + "_" );
                    }
                    else
                    {
                        System.out.print( "___" );
                    }

                }
                else if ( ( i == 2 && j != 2 ) )
                {
                    if ( mat[i][j] != ' ' )
                    {
                        System.out.print( " " + mat[i][j] + " |" );
                    }
                    else
                    {
                        System.out.print( "   |" );
                    }

                }
                else if ( ( i != 2 ) )
                {
                    if ( mat[i][j] != ' ' )
                    {
                        System.out.print( "|_" + mat[i][j] + "_" );
                    }
                    else
                    {
                        System.out.print( "|___" );
                    }

                }
                else if ( i == 2 && j == 2 && mat[i][j] != ' ' )
                {
                    System.out.println( " " + mat[i][j] + " " );
                }

            }
            System.out.println( "" );
        }
        cont++;
        if ( cont == 10 )
        {
            System.out.println( "\t\tEMPATE TECNICO" );
        }
    }

    public static void verificaVencedor( char O, char matriz_jogo[][], String nome )
    {
        for ( int i = 0; i < matriz_jogo.length; i++ )
        {
            for ( int j = 0; j < matriz_jogo.length; j++ )
            {
                if ( matriz_jogo[i][0] == O && matriz_jogo[i][1] == O && matriz_jogo[i][2] == O
                     || matriz_jogo[0][j] == O && matriz_jogo[1][j] == O && matriz_jogo[2][j] == O
                     || matriz_jogo[0][0] == O && matriz_jogo[1][1] == O && matriz_jogo[2][2] == O
                     || matriz_jogo[0][2] == O && matriz_jogo[1][1] == O && matriz_jogo[2][0] == O )
                {
                    vencedor = true;
                }
            }
        }
        if ( vencedor )
        {
            System.out.println( "\t\t" + nome + "\n\t\tVENCEDOR" );
            imprimeMatriz( matriz_jogo );
        }
    }
}

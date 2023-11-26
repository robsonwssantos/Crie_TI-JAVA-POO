
/**
 *
 * @author artur
 */
public class Start
{
    public static void main( String[] args )
    {
        Dicionario aurelio = new Dicionario();
        
        while ( true )
        {            
            int opcao = Entrada.leiaInt( "[1] – Cadastrar Palavra\n" +
                                         "[2] – Listar as palavras cadastradas\n" +
                                         "[3] – Listar palavra exata\n" +
                                         "[4] – Listar as palavras semelhantes\n" +
                                         "[5] – Alterar o significado de uma palavra\n" +
                                         "[6] – Sair" );
            
            if ( opcao == 1 )
            {
                String nomePalavra = null;
                
                while ( ! aurelio.validaPalavra( nomePalavra ) )
                {
                    nomePalavra = Entrada.leiaString( "Insira uma nova palavra" );
                }
                
                Palavra palavra = new Palavra();
                palavra.setPalavra(  nomePalavra );
                palavra.setSignificado( Entrada.leiaString( "Insira um significado" ) );
                
                aurelio.addPalavra( palavra );
            }
            
            else if ( opcao == 2 )
            {
                aurelio.listaPalavras();
            }
            
            else if ( opcao == 3 )
            {
                aurelio.listaPalavraExata( Entrada.leiaString( "Qual palavra deseja procurar?" ) );
            }
            
            else if ( opcao == 4 )
            {
                aurelio.listaPalavraSemelhante( Entrada.leiaString( "Qual palavra deseja procurar?" ) );
            }
            
            else if ( opcao == 5 )
            {
                aurelio.alteraSignificado();
            }
            
            else if ( opcao == 6 )
            {
                System.out.println( "Tchau!!" );
                System.exit( 0 );
            }
        }
        
    }
            
}

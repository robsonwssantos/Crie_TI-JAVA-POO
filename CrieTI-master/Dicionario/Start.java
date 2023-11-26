
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import util.Entrada;



/**
 *
 * @author artur
 */
public class Start
{
    public static void main( String[] args ) throws IOException 
    {
        Dicionario aurelio = new Dicionario();
        
        Path path = Path.of( "arquivo.txt" );
        
        if ( Files.exists( path ) )
        {
            List<String> linhas  = Files.readAllLines( path );
                
            for ( String linha : linhas )
            {
                // 1;banana;fruta amarela 
                String pTemp [] = linha.split( ";" );
                
                Palavra p = new Palavra( pTemp[1], pTemp[2] );
                p.setCodigo( Integer.parseInt( pTemp[0] ) );
                
                String.valueOf( 1 );
                
                aurelio.addPalavra( p );
            }
        }
        
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
                
                Palavra palavra = new Palavra( nomePalavra );
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
                String palavrasFormatadasParaSalvar = aurelio.formatarParaSalvar();
                
                Files.write( Path.of( "arquivo.txt" ), 
                                palavrasFormatadasParaSalvar.getBytes(),
                                StandardOpenOption.CREATE,
                                StandardOpenOption.TRUNCATE_EXISTING );

                System.out.println( "Tchau!!" );
                System.exit( 0 );
            }
        }
        
    }
            
}

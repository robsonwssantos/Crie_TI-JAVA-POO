
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.JOptionPane;



/**
 *
 * @author art
 */
public class Start
{
    public static void main( String[] args ) throws Exception
    {
        ControlaProduto controlaProdutos = new ControlaProduto();
        ControlaCompra controlaCompra = new ControlaCompra( controlaProdutos );
        
        Files.readString( Path.of( "banco.txt" ) );
        
        
        while ( true )
        {            
            int opcao = Entrada.leiaInt( "[1] – Cadastrar Produtos\n" +
                                         "[2] – Listar produtos cadastrados\n" +
                                         "[3] – Efetuar uma compra\n" +
                                         "[4] – Listar as compras\n" +
                                         "[5] – Listar compras de um dia\n" +
                                         "[6] – Sair" );
            
            if ( opcao == 1 )
            {
                controlaProdutos.addProduto();
            }
            
            else if ( opcao == 2 )
            {
                controlaProdutos.listarProdutos();
            }
            
            else if ( opcao == 3 )
            {
                controlaCompra.adiconarCompra( controlaCompra.criarCompra() );
            }
            
            else if ( opcao == 4 )
            {
                //exemplo de mensagem com o JOptionPane
                ArrayList<Compra> compras = controlaCompra.getCompras();
                
                String msg = "";
                
                if ( ! compras.isEmpty() )
                {
                    for ( Compra c : compras )
                    {
                        msg += "\n-------------------------------------\n";
                        msg += c;
                        msg += "\n-------------------------------------\n";
                    }
                }
                
                else
                {
                    msg += "Sem compras efetudas";
                }
                
                JOptionPane.showMessageDialog( null, msg );
            }
            
            else if ( opcao == 5 )
            {
                ArrayList<Compra> compras = controlaCompra.getCompras( Entrada.leiaString( "Qual é da data" ) );
                
                if ( ! compras.isEmpty() )
                {
                    for ( Compra c : compras )
                    {
                        System.out.println( "\n-------------------------------------\n");
                        System.out.println( c );
                        System.out.println( "\n-------------------------------------\n");
                    }
                }
                
                else
                {
                    System.out.println( "Sem compras efetudas para a data digitada" );
                }
            }
            
            else if ( opcao == 6 )
            {
                Files.write( Path.of( "banco.txt"), "teste\n\nteste\nteste2".getBytes(), 
                                                    StandardOpenOption.CREATE,
                                                    StandardOpenOption.TRUNCATE_EXISTING );
                System.out.println( "Tchau!!" );
                System.exit( 0 );
            }
        }
    }
}

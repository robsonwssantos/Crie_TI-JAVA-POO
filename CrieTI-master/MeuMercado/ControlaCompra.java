
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author art
 */
public class ControlaCompra
{
    private ArrayList<Compra> compras = new ArrayList<Compra>();
    private ControlaProduto controlaProdutos;

    public ControlaCompra( ControlaProduto controlaProduto )
    {
        this.controlaProdutos = controlaProduto;
    }
    
    public Compra criarCompra()
    {
        Usuario u = new Usuario();
        u.setNome( Entrada.leiaString( "Insira o nome do cliente:" ) );
        u.setCpf(  Entrada.leiaString( "Insira o cpf do cliente:" ) );
        
        Compra c = new Compra();
        c.setData( Entrada.leiaString( "Qual é data da compra:" ) );
        c.setCliente( u );

        boolean sair = false;
        
        while ( ! sair )
        {
            int codigo = Entrada.leiaInt( "DIGITE O CÓDIGO DO PRODUTO OU \"0\" PARA SAIR:\n" + controlaProdutos.getProdutosFormatados() );

            if ( codigo != 0 )
            {
                if ( controlaProdutos.validaProduto( codigo ) )
                {
                    c.addProduto( controlaProdutos.getProduto( codigo ) );
                }

                else
                {
                    JOptionPane.showMessageDialog( null, "Produto inválido!");
                }
            }
            
            else
            {
                if ( c.getProdutos().isEmpty() )
                {
                    JOptionPane.showMessageDialog( null, "É precisso adionar ao menos um produto");
                }
                
                else
                {
                    sair = true;
                }
            }
        }
        
        return c;
    }
    
    public void adiconarCompra( Compra c )
    {
        this.compras.add( c );
    }
    
    public ArrayList<Compra> getCompras()
    {
        return compras;
    }
    
    public ArrayList<Compra> getCompras( String d )
    {
        ArrayList lista = new ArrayList();
        
        for ( Compra c : compras )
        {
            if ( c.getData().equals( d ) )
            {
                
            }
        }
        
        return lista;
    }
}

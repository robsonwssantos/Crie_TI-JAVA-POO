
import java.util.ArrayList;

/**
 *
 * @author art
 */
public class ControlaProduto
{
    private ArrayList<Produto> produtos = new ArrayList();
    
    public void addProduto()
    {
        Produto p = new Produto();
        p.setCodigo(  produtos.size() + 1 );
        p.setNome( Entrada.leiaString( "Insira o nome do produto" ) );
        p.setValor( Entrada.leiaDouble( "Insira o valor do produto" ) );
        
        this.addProduto( p );
    }
    
    public void addProduto( Produto p )
    {
        produtos.add( p );
    }
    
    public ArrayList<Produto> getProdutos()
    {
        return produtos;
    }
    
    public Produto getProduto( int codigo )
    {
        for ( Produto produto : produtos )
        {
            if ( produto.getCodigo() == codigo )
            {
                return produto;
            }
        }
        
        return null;
    }
    
    public String getProdutosFormatados()
    {
        String resultado = "";
        
        for ( Produto p : produtos )
        {
            resultado += p.toString() + "\n" ;
        }
        
        return resultado;
    }
    
    public boolean validaProduto( int codigo )
    {
        for ( Produto produto : produtos )
        {
            if ( produto.getCodigo() == codigo )
            {
                return true;
            }
        }
        
        return false;
    }
    
    public void listarProdutos()
    {
        System.out.println( getProdutosFormatados() );
    }
}

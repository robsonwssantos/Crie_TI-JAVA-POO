
import util.Entrada;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author artur
 */
public class Dicionario
{
    private ArrayList<Palavra> palavras = new ArrayList();

    public void addPalavra( Palavra x )
    {
        x.setCodigo( this.palavras.size() + 1 );

        this.palavras.add( x );
    }
    
    public boolean validaPalavra( String nomePalavra )
    {
        if ( nomePalavra == null )
        {
            return false;
        }
        
        boolean encontrou = false;
        
        for ( Palavra p : this.palavras )
        {
            if ( p != null && p.getPalavra().equals( nomePalavra ) )
            {
                encontrou = true;
            }
        }
        
        return !encontrou;
    }

    public void listaPalavras()
    {
        boolean encontrou = false;
        
        for ( Palavra p : this.palavras )
        {
            if ( p != null )
            {
                System.out.println( "##########################" );
                System.out.println( p );
                System.out.println( "##########################" );
                encontrou = true;
            }
        }
        
        if ( ! encontrou )
        {
            System.out.println( "Dicionário vazio" );
        }
    }
    
    public void listaPalavraExata( String palavraAProcurar )
    {
        boolean encontrou = false;
        
        String mensagem = "";
        
        for ( Palavra p : this.palavras )
        {
            if ( p != null && p.getPalavra().equals( palavraAProcurar ) )
            {
                mensagem += "##########################\n";
                mensagem += p.getCodigo() + " - " + p.getPalavra() + "\n";
                mensagem += p.getSignificado() + "\n";
                mensagem += "##########################\n";
                
                encontrou = true;
            }
        }
        
        if ( ! encontrou )
        {
            JOptionPane.showMessageDialog( null,  "A palavra '" + 
                                                  palavraAProcurar + 
                                                  "' não existe no dicionário" );
        }
        
        else
        {
            JOptionPane.showMessageDialog( null, mensagem );
        }
    }
    
    public void listaPalavraSemelhante( String palavraAProcurar )
    {
        boolean encontrou = false;
        
        for ( Palavra p : this.palavras )
        {
            if ( p != null && p.getPalavra().contains( palavraAProcurar ) )
            {
                System.out.println( "##########################" );
                System.out.println( p.getCodigo() + " - " + p.getPalavra() );
                System.out.println( p.getSignificado() );
                System.out.println( "##########################" );
                
                encontrou = true;
            }
        }
        
        if ( ! encontrou )
        {
            System.out.println( "Nenhuma palavra contém '" + palavraAProcurar + "'." );
        }
    }
    
    public void alteraSignificado()
    {
        int codigo = Entrada.leiaInt( "Qual código da palavra?" );
        
        Palavra selecionada = null;
        
        for ( Palavra p : this.palavras )
        {
            if ( p != null && p.getCodigo() == codigo )
            {
                selecionada = p;
            }
        }
        
        if ( selecionada != null )
        {
            String mensagem = "Você selecionou a seguinte palavra:\n" +
                              "Código: " + selecionada.getCodigo() + "\n" +
                              "Palavra: " + selecionada.getPalavra() + "\n" +
                              "Significado: " + selecionada.getSignificado()+ "\n\n" +
                              "Qual é o novo significado?";
                              
            selecionada.setSignificado( Entrada.leiaString( mensagem ) );
            
            
            JOptionPane.showMessageDialog( null, "Novo significado: " + selecionada.getSignificado() );
        }
        
        else
        {
            JOptionPane.showMessageDialog( null, "Código inválido" );
        }
    }
    
    public String formatarParaSalvar()
    {
        String palavrasSalvar = "";
        
        for ( Palavra p : palavras )
        {
            palavrasSalvar += p.getCodigo() + ";" + 
                              p.getPalavra() + ";" + 
                              p.getSignificado() + "\n";
        }
        
        return palavrasSalvar;
    }
}

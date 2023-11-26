/**
 *
 * @author artur
 */
public class Dicionario
{
    private Palavra palavras[] = new Palavra[10];
    private int i = 0;
    
    public void addPalavra( Palavra x )
    {
        if ( this.i < 10 )
        {
            x.setCodigo( i );

            this.palavras[this.i] = x;
            this.i++;
        }
        
        else
        {
            System.out.println( "Dicionário cheio!" );
        }
    }
    
    public boolean validaPalavra( String nomePalavra )
    {
        if ( nomePalavra == null )
        {
            return false;
        }
        
        boolean encontrou = false;
        
        for ( int i = 0; i < 10; i++ )
        {
            Palavra p = this.palavras[i];
            
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
        
        for ( int i = 0; i < 10; i++ )
        {
            Palavra p = this.palavras[i];
            
            if ( p != null )
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
            System.out.println( "Dicionário vazio" );
        }
    }
    
    public void listaPalavraExata( String palavraAProcurar )
    {
        boolean encontrou = false;
        
        for ( int i = 0; i < 10; i++ )
        {
            Palavra p = this.palavras[i];
            
            if ( p != null && p.getPalavra().equals( palavraAProcurar ) )
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
            System.out.println( "A palavra '" + palavraAProcurar + "' não existe no dicionário" );
        }
    }
    
    public void listaPalavraSemelhante( String palavraAProcurar )
    {
        boolean encontrou = false;
        
        for ( int i = 0; i < 10; i++ )
        {
            Palavra p = this.palavras[i];
            
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
        
        for ( int i = 0; i < 10; i++ )
        {
            Palavra p = this.palavras[i];
            
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
            
            System.out.println( "Novo significado: " + selecionada.getSignificado() );
        }
        
        else
        {
            System.out.println( "Código inválido" );
        }
        
    }

}

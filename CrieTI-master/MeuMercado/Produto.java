/**
 *
 * @author art
 */
public class Produto
{
    private double valor;
    private String nome;
    private int codigo;

    public double getValor()
    {
        return valor;
    }

    public void setValor( double valor )
    {
        this.valor = valor;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome( String nome )
    {
        this.nome = nome;
    }

    public int getCodigo()
    {
        return codigo;
    }

    public void setCodigo( int codigo )
    {
        this.codigo = codigo;
    }

    @Override
    public String toString()
    {
        return this.getCodigo() + " - " + this.getNome() + " (" + this.getValor() + ")";
    }
    
    
}

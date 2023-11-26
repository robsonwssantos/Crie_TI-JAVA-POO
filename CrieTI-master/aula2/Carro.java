
/**
 *
 * @author artur
 */
public class Carro
{
    public String marca;
    public String cor;
    public String modelo;
    public int quantidadePortas;
    public double potencia;
    public double velocidade;
    public double velocidadeMaxima;
    
    public void definirMarca( String marca )
    {
        this.marca = marca;
    }
    
    public void definirMarcaModelo( String marca, String modelo )
    {
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public void imprimeNome()
    {
        System.out.println( this.obterNome() );
    }
    
    public String obterNome()
    {
        return this.modelo + " " + this.marca;
    }
}

/**
 *
 * @author artur
 */
public class Funcionario
{
    private String nome;
    private String cargo;
    private String empresa;
    private double salario;

    public String getNome()
    {
        return nome;
    }

    public void setNome( String nome )
    {
        this.nome = nome;
    }

    public String getCargo()
    {
        return cargo;
    }

    public void setCargo( String cargo )
    {
        this.cargo = cargo;
    }

    public String getEmpresa()
    {
        return empresa;
    }

    public void setEmpresa( String empresa )
    {
        this.empresa = empresa;
    }

    public double getSalario()
    {
        return salario;
    }

    public void setSalario( double salario )
    {
        this.salario = salario;
    }

    public void aumento( double valor )
    {
        double percentual = ( valor / 100 ) + 1;
        
        this.salario *= percentual;
    }
    
    public void promocao( String  novoCargo, double aumento )
    {
        this.aumento( aumento );
        this.setCargo( novoCargo );
    }
}

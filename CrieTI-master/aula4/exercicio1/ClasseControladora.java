/**
 *
 * @author artur
 */
public class ClasseControladora
{
    private Funcionario funcionarios [] = new Funcionario[ 10 ];
    private int i = 0;
    
    public void adicionarFuncionario( Funcionario funcionario )
    {
        if ( i < 10 )
        {
            this.funcionarios[i] = funcionario;
            i++;
        }
        else
        {
            System.out.println( "Vetor está cheio" );
        }
    }
    
    public double getSalarioMensal( String empresa )
    {
        double salarioMensal = 0;
        
        for ( int i = 0; i < 10; i++ )
        {
            Funcionario funcionario = this.funcionarios[i];
            
            if ( funcionario != null && funcionario.getEmpresa().equals( empresa ) )
            {
                salarioMensal += funcionario.getSalario();
            }
        }
        
        return salarioMensal;
    }
    
    public double getSalarioAnual( String empresa )
    {
        return this.getSalarioMensal( empresa ) * 12;
    }
 
    public Funcionario getFuncionario( String nomeFuncionario )
    {
        Funcionario funcionario = null;
        
        for ( int i = 0; i < 10; i++ )
        {
            Funcionario temporario = this.funcionarios[i];
            
            if ( temporario != null && temporario.getNome().equals( nomeFuncionario ) )
            {
                funcionario = temporario;
            }
        }
           
        return funcionario;
    }
}

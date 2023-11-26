/**
 *
 * @author artur
 */
public class Conta
{
    //constantes
    public static String CONTA_CORRENTE = "CC";
    public static String CONTA_SALARIO  = "CS";
    public static String CONTA_POUPANCA = "CP";
    
    //metodo estático, pertence a classe
    public static void transferir( Conta contaTransferir, Conta contaReber, double valor )
    {
        if ( contaTransferir.sacar( valor ) )
        {
            contaReber.depositar( valor );
        }
        
        else
        {
            System.out.println( "Problemas ao transferir, verifique seu saldo e limite" );
        }
    }
    
    public int codigo;
    public String nomeDonoConta;
    public String tipoConta;
    public double saldo;
    public double limite;
    
    public void depositar( double valor )
    {
        this.saldo += valor; 
    }
    
    public boolean sacar( double valor )
    {
        if ( valor > limite )
        {
            System.out.println( "Valor é maior que o seu limite!" );
            return false;
        }
        
        else 
        {
            if ( valor < this.saldo )
            {
                this.saldo -= valor; 

                System.out.println( "Saque concluído com sucesso!" );
                return true;
            }

            else
            {
                System.out.println( "Saldo insuficiente para o saque!" );
                return false;
            }
        }
    }
    
    public void transferir( Conta contaReceber, double valor )
    {
        if ( this.sacar( valor ) )
        {
            contaReceber.depositar( valor );
        }
        
        else
        {
            System.out.println( "Problemas ao transferir, verifique seu saldo e limite" );
        }
    }
    
    public void imprimirLimite()
    {
        System.out.println( "Limite: " + this.limite );
    }
    
    public void imprimirTipoConta()
    {
        System.out.println( "Tipo: " + this.tipoConta );
    }
    
    public void imprimirDonoConta()
    {
        System.out.println( "Dono: " + nomeDonoConta );
    }
    
    public void imprimirSaldo()
    {
        System.out.println( "Saldo do " + this.nomeDonoConta + " é " + this.saldo );
    }
}

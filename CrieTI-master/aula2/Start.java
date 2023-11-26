/**
 *
 * @author artur
 */
public class Start
{
    public static void main( String[] args )
    {
        Conta conta1 = new Conta();
        conta1.tipoConta = Conta.CONTA_CORRENTE;
        conta1.codigo = 01;
        conta1.limite = 2000;
        conta1.nomeDonoConta = "Artur Tomasi";
        conta1.saldo = 1000;
        
        Conta conta2 = new Conta();
        conta2.tipoConta = Conta.CONTA_CORRENTE;
        conta2.codigo = 02;
        conta2.limite = 2000;
        conta2.nomeDonoConta = "Juca bala";
        conta2.saldo = 2000;
        
        
        conta2.transferir( conta1, 500 );
        
        conta1.imprimirSaldo();
        conta2.imprimirSaldo();
        
        conta1.transferir( conta2, 2000 );

        conta1.imprimirSaldo();
        conta2.imprimirSaldo();


        //exemplo num vetor
        Conta contas[] = new Conta[2];
        contas[0] = conta1;
        contas[1] = conta2;
        
        int codigoTransferir = Entrada.leiaInt( "Qual código da sua conta?");
        int codigoReceber = Entrada.leiaInt( "Qual código da conta destino?");
        int valor = Entrada.leiaInt( "Qual valor?");
        
        Conta contaTransferir = null;
        Conta contaReceber = null;
        
        for ( int i = 0; i < contas.length; i++ )
        {
            if ( contas[i].codigo == codigoTransferir )
            {
                contaTransferir = contas[i];
            }
            
            if ( contas[i].codigo == codigoReceber )
            {
                contaReceber = contas[i];
            }
        }
        
        contaTransferir.transferir( contaReceber, valor );
    }
}

/**
 *
 * @author artur
 */
public class Start
{
    public static void main( String[] args )
    {
        ClasseControladora controladora = new ClasseControladora();
    
        System.out.println( "MENU:" );
        System.out.println( "1 - Adicionar funcionar" );
        System.out.println( "2 - Listar salário mensal por empresa" );
        System.out.println( "3 - Listar salário anual por empresa" );
        System.out.println( "4 - Promover funcionário" );
        System.out.println( "5 - Imprime funcionário" );
        System.out.println( "6 - Sair" );
        
        while ( true )
        {
            int opcao = Entrada.leiaInt( "Opção do menu");
            
            if ( opcao == 1 )
            {
                Funcionario funcionario = new Funcionario();
                funcionario.setNome( Entrada.leiaString( "Insira nome") );
                funcionario.setEmpresa(  Entrada.leiaString( "Insira empresa") );
                funcionario.setCargo(Entrada.leiaString( "Insira cargo") );
                funcionario.setSalario( Entrada.leiaDouble( "Insira salario") );

                controladora.adicionarFuncionario( funcionario );
            }
            
            else if ( opcao == 2 )
            {
                
                System.out.println( "Salário da empresa: " + controladora.getSalarioMensal( Entrada.leiaString( "Qual empresa?" ) ) );
            }
            
            else if ( opcao == 3 )
            {
                System.out.println( "Salário da empresa: " + controladora.getSalarioAnual( Entrada.leiaString( "Qual empresa?" ) ) );
            }
            
            else if ( opcao == 4 )
            {
                String nome = Entrada.leiaString( "Insira o nome do funcionário" );
                
                Funcionario funcionario = controladora.getFuncionario( nome );
                
                if ( funcionario != null )
                {
                    
                    funcionario.promocao( Entrada.leiaString( "Insira o nova Cargo"), Entrada.leiaDouble( "Insira o percentual" ) );
                }
                
                else
                {
                    System.out.println( "Funcionário não encontrado" );
                }
            }
            
            else if ( opcao == 5 )
            {
                String nome = Entrada.leiaString( "Insira o nome do funcionário" );
                
                Funcionario funcionario = controladora.getFuncionario( nome );
                
                if ( funcionario != null )
                {
                    System.out.println( funcionario.getNome() );
                    System.out.println( funcionario.getEmpresa() );
                    System.out.println( funcionario.getCargo() );
                    System.out.println( funcionario.getSalario() );
                }
                
                else
                {
                    System.out.println( "Funcionário não encontrado" );
                }
            }
            
            else if ( opcao == 6 )
            {
                System.out.println( "tchau" );
                System.exit( 0 );
            }
        }
    }
}

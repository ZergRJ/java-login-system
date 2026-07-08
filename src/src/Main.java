import java.sql.SQLException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws SQLException {

        int opcao;
        Scanner ler = new Scanner(System.in);

        do {
            System.out.println("===== MENU =====");
            System.out.println("1 - Cadastrar usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("3 - Efetuar login");
            System.out.println("4 - Alterar senha");
            System.out.println("5 - Buscar Usuario");
            System.out.println("6 - Excluir Usuario");
            System.out.println("7 - Alterar Nome");
            System.out.println("8 - Sair");
            System.out.println("Escolha uma opção:");

            opcao = ler.nextInt();
            ler.nextLine();

            switch (opcao) {
                case 1:
                    Usuario usuario = Cadastro.cadastrar(ler);
                    UsuarioDAO.salvar(usuario);
                    break;

                case 2:
                    System.out.println("=========================");
                    System.out.println("USUÁRIOS CADASTRADOS");
                    System.out.println("=========================");

                    UsuarioDAO.listar();
                    break;

                case 3:
                    LoginNovo.loginNovo(ler);
                    break;

                case 4:
                    AlterarSenhaBanco.alterarSenhaBanco(ler);
                    break;

                case 5:
                    BuscarUsuarioBanco.buscarPorNome(ler);
                    break;

                case 6:
                    ExcluirUsuarioBanco.excluir(ler);
                    break;

                case 7:
                    AlterarNomeBanco.alterarNome(ler);
                    break;

                case 8:
                    System.out.println("Saindo");
                    break;

                default:
                    System.out.println("Selecione uma opção válida.");
            }

        } while (opcao != 8);
    }
}
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarSenhaBanco {
    public static void alterarSenhaBanco(Scanner ler) throws SQLException {

        System.out.println("Digite seu nome: ");
        String nome = ler.nextLine();

        Usuario usuario = UsuarioDAO.buscarPorNome(nome);

        if (usuario == null) {
            System.out.println("Usuario não encontrado");
            return;
        }

        System.out.println("Digite sua senha: ");
        String novaSenha = ler.nextLine();

        UsuarioDAO.alterarSenha(usuario.getId(), novaSenha);
    }
}

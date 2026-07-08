import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirUsuarioBanco {

    public static void excluir(Scanner ler) throws SQLException {

        System.out.println("Digite o nome do usuário:");
        String nome = ler.nextLine();

        Usuario usuario = UsuarioDAO.buscarPorNome(nome);

        if (usuario == null) {
            System.out.println("Usuário não encontrado.");
            return;
        }

        UsuarioDAO.excluir(usuario.getId());
    }
}
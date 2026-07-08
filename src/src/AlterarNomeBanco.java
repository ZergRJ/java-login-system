import java.sql.SQLException;
import java.util.Scanner;

public class AlterarNomeBanco {

    public static void alterarNome (Scanner ler) throws SQLException {

        System.out.println("Digite o nome do usuario");
        String nome = ler.nextLine();

        Usuario usuario = UsuarioDAO.buscarPorNome(nome);

        if (usuario == null) {
            System.out.println("Usuario não encontrado");
            return;
        }

        System.out.println("Digite seu novo nome: ");
        String novoNome = ler.nextLine();

        UsuarioDAO.alterarNome(usuario.getId(), novoNome);
    }
}

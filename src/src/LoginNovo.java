import java.sql.SQLException;
import java.util.Scanner;

public class LoginNovo {

    public static void loginNovo(Scanner ler) throws SQLException {

        System.out.println("Digite seu nome:");
        String nome = ler.nextLine();

        Usuario usuario = UsuarioDAO.buscarPorNome(nome);
        if (usuario == null) {
            System.out.println("Usuario nao encontrado");
            return;
        }

        System.out.println("Digite sua senha: ");
        String senha = ler.nextLine();

        if (usuario.getSenha().equals(senha)) {

            System.out.println("Login realizado com sucesso!");

        } else {

            System.out.println("Senha incorreta.");

        }
    }
}

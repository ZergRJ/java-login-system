import java.util.Scanner;

public class Cadastro {

    public static Usuario cadastrar(Scanner ler) {
        System.out.println("Digite seu nome: ");
        String nome = ler.nextLine();
        System.out.println("Digite sua senha: ");
        String senha = ler.nextLine();

        Usuario usuario = new Usuario(nome, senha);
        return usuario;
    }
}


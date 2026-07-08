import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    public static void salvar(Usuario usuario) {

        try {

            // 1. Abre a conexão com o banco
            Connection conexao = ConexaoBanco.conectar();

            // 2. Comando SQL
            String sql = "INSERT INTO usuarios (nome, senha) VALUES (?, ?)";

            // 3. Prepara o comando SQL
            PreparedStatement statement = conexao.prepareStatement(sql);

            // 4. Substitui os ? pelos valores do objeto Usuario
            statement.setString(1, usuario.getNome());
            statement.setString(2, usuario.getSenha());

            // 5. Executa o INSERT
            statement.executeUpdate();

            System.out.println("Usuário cadastrado com sucesso!");

            // 6. Fecha os recursos
            statement.close();
            conexao.close();

        } catch (SQLException e) {
            System.out.println("Erro ao salvar usuário: " + e.getMessage());
        }
    }

    public static void listar() throws SQLException {

        Connection conexao = ConexaoBanco.conectar();

        String sql = "SELECT id, nome, senha FROM usuarios";

        PreparedStatement statement = conexao.prepareStatement(sql);

        ResultSet resultado = statement.executeQuery();

        while (resultado.next()) {

            int id = resultado.getInt("id");
            String nome = resultado.getString("nome");
            String senha = resultado.getString("senha");

            Usuario usuario = new Usuario(id, nome, senha);
            usuario.imprimirResumo();
        }

            resultado.close();
            statement.close();
            conexao.close();

    }

    public static Usuario buscarPorNome(String nome) throws SQLException {

        Connection conexao = ConexaoBanco.conectar();

        String sql = "SELECT id, nome, senha FROM usuarios Where nome = ?";

        PreparedStatement statement = conexao.prepareStatement(sql);

        statement.setString(1, nome);

        ResultSet resultado = statement.executeQuery();

        if (resultado.next()) {
            int id = resultado.getInt("id");
            String nomeBanco = resultado.getString("nome");
            String senha = resultado.getString("senha");

            Usuario usuario = new Usuario(id, nomeBanco, senha);

            resultado.close();
            statement.close();
            conexao.close();

            return usuario;
        }

        resultado.close();
        statement.close();
        conexao.close();

        return null;
    }

    public static void alterarSenha(int id, String novaSenha) throws SQLException {
        Connection conexao = ConexaoBanco.conectar();
        String sql = "UPDATE usuarios SET senha = ? WHERE id = ?";
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.setString(1, novaSenha);
        statement.setInt(2, id);
        statement.executeUpdate();
        statement.close();
        conexao.close();
    }

    public static void alterarNome(int id, String novoNome) throws SQLException {
        Connection conexao = ConexaoBanco.conectar();
        String sql = "UPDATE usuarios SET nome = ? WHERE id = ?";
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.setString(1, novoNome);
        statement.setInt(2, id);
        statement.executeUpdate();
        statement.close();
        conexao.close();
    }

    public static void excluir(int id) throws SQLException {
        Connection conexao = ConexaoBanco.conectar();
        String sql = "DELETE FROM usuarios WHERE id = ?";
        PreparedStatement statement = conexao.prepareStatement(sql);
        statement.setInt(1, id);
        statement.executeUpdate();
        statement.close();
        conexao.close();
    }
}


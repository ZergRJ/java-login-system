import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConexaoBanco {

    public static Connection conectar() throws SQLException {

        Properties propriedades = new Properties();

        try {
            FileInputStream arquivo = new FileInputStream("config.properties");
            propriedades.load(arquivo);
            arquivo.close();

            String url = propriedades.getProperty("db.url");
            String usuario = propriedades.getProperty("db.user");
            String senha = propriedades.getProperty("db.password");

            return DriverManager.getConnection(url, usuario, senha);

        } catch (IOException e) {
            throw new SQLException("Erro ao carregar o arquivo config.properties", e);
        }
    }
}
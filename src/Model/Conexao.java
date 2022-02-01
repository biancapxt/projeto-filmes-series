package Model;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {

    private final String driver = "com.mysql.jdbc.Driver";
    private Connection conexao;
    private Statement statement;
    private ResultSet resultset;
    private final String url = "jdbc:mysql://localhost:3306/bdsistemafilmes";
    private final String user = "root";
    private final String senha = "";

    public void conectar() {

        try {
            Class.forName(driver);
            conexao = (Connection) DriverManager.getConnection(url, user, senha);
            statement = (Statement) conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
            System.out.println("Conectado com sucesso");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Erro ao conectar.");
        }
    }

    public void desconectar() {
        try {
            conexao.close();
            System.out.println("Desconectado com sucesso.");
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void executarSQL(String SQL) {
        try {
            statement.execute(SQL);
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public ResultSet Pesquisar(String SQL){
        try {
            resultset = statement.executeQuery(SQL);
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultset;
    }
    
}

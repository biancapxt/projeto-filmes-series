package Controller;

import Model.Conexao;
import Model.Serie;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class c_Serie {

    public static void Salvar(String nome, String genero, int temporadas, int assistido) {

        Serie s = new Serie(0, nome, genero, temporadas, assistido);

        String SQL = "INSERT INTO `serie` (`id`, `nome`, `genero`, `temporadas`, `assistido`) VALUES (null, '" + s.getNome() + "', '" + s.getGenero() + "', '" + s.getTemporadas() + "', '" + s.getAssistido() + "');";

        Conexao con = new Conexao();
        con.conectar();
        con.executarSQL(SQL);
        con.desconectar();
    }

    public static void Editar(int id, String nome, String genero, int temporadas, int assistido) {

        Serie s = new Serie(id, nome, genero, temporadas, assistido);

        String SQL = "UPDATE `serie` SET `nome` = '" + s.getNome() + "', `genero` = '" + s.getGenero() + "', `temporadas` = '" + s.getTemporadas() + "', `assistido` = '" + s.getAssistido() + "' WHERE `serie`.`id` = " + s.getId() + ";";

        Conexao con = new Conexao();
        con.conectar();
        con.executarSQL(SQL);
        con.desconectar();

    }

    public static String[][] Pesquisar() {
        ResultSet resultset;
        String SQL = ("SELECT * FROM `serie`");
        Conexao con = new Conexao();
        con.conectar();
        resultset = con.Pesquisar(SQL);

        try {
            resultset.last();
            int linhas = resultset.getRow();
            int colunas = resultset.getMetaData().getColumnCount();
            int linha = 0;
            String dados[][] = new String[linhas][colunas];
            resultset.first();
            resultset.previous();
            while (resultset.next()) {
                dados[linha][0] = resultset.getString("id");
                dados[linha][1] = resultset.getString("nome");
                dados[linha][2] = resultset.getString("genero");
                dados[linha][3] = resultset.getString("temporadas");
                dados[linha][4] = resultset.getString("assistido");
                linha++;
            }
            con.desconectar();
            return dados;
        } catch (SQLException ex) {
            Logger.getLogger(c_Serie.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static String[][] Pesquisar(String pesquisa) {
        ResultSet resultset;
        String SQL = ("SELECT * FROM `serie` WHERE `nome` LIKE '%" + pesquisa + "%';");
        Conexao con = new Conexao();
        con.conectar();
        resultset = con.Pesquisar(SQL);

        try {
            resultset.last();
            int linhas = resultset.getRow();
            int colunas = resultset.getMetaData().getColumnCount();
            int linha = 0;
            String dados[][] = new String[linhas][colunas];
            resultset.first();
            resultset.previous();
            while (resultset.next()) {
                dados[linha][0] = resultset.getString("id");
                dados[linha][1] = resultset.getString("nome");
                dados[linha][2] = resultset.getString("genero");
                dados[linha][3] = resultset.getString("temporadas");
                dados[linha][4] = resultset.getString("assistido");
                linha++;
            }
            con.desconectar();
            return dados;
        } catch (SQLException ex) {
            Logger.getLogger(c_Serie.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void Deletar(int id) {

        String SQL = "DELETE FROM `serie` WHERE `serie`.`id` = " + id;

        Conexao con = new Conexao();
        con.conectar();
        con.executarSQL(SQL);
        con.desconectar();
    }

    public static void Deletar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

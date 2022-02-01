package Controller;

import Model.Conexao;
import Model.Filme;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class c_Filme {

    private static ResultSet resultset;

    public static void Salvar(String nome, String genero, int ano, int assistido) {

        Filme f = new Filme(0, nome, genero, ano, assistido);

        String SQL = "INSERT INTO `filme` (`id`, `nome`, `genero`, `ano`, `assistido`) VALUES (null, '" + f.getNome() + "', '" + f.getGenero() + "', '" + f.getAno() + "', '" + f.getAssistido() + "');";

        Conexao con = new Conexao();
        con.conectar();
        con.executarSQL(SQL);
        con.desconectar();
    }

    public static void Editar(int id, String nome, String genero, int ano, int assistido) {

        Filme f = new Filme(id, nome, genero, ano, assistido);

        String SQL = "UPDATE `filme` SET `nome` = '" + f.getNome() + "', `genero` = '" + f.getGenero() + "', `ano` = '" + f.getAno() + "', `assistido` = '" + f.getAssistido() + "' WHERE `filme`.`id` = " + f.getId() + ";";

        Conexao con = new Conexao();
        con.conectar();
        con.executarSQL(SQL);
        con.desconectar();

    }

    public static String[][] Pesquisar() {
        ResultSet resultset;
        String SQL = ("SELECT * FROM `filme`");
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
                dados[linha][3] = resultset.getString("ano");
                dados[linha][4] = resultset.getString("assistido");
                linha++;
            }
            con.desconectar();
            return dados;
        } catch (SQLException ex) {
            Logger.getLogger(c_Filme.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static String[][] Pesquisar(String pesquisa) {
        ResultSet resultset;
        String SQL = ("SELECT * FROM `filme` WHERE `nome` LIKE '%" + pesquisa + "%';");
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
                dados[linha][3] = resultset.getString("ano");
                dados[linha][4] = resultset.getString("assistido");
                linha++;
            }
            con.desconectar();
            return dados;
        } catch (SQLException ex) {
            Logger.getLogger(c_Filme.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static void Deletar(int id) {

        String SQL = "DELETE FROM `filme` WHERE `filme`.`id` = " + id;

        Conexao con = new Conexao();
        con.conectar();
        con.executarSQL(SQL);
        con.desconectar();
    }

    public static void Deletar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

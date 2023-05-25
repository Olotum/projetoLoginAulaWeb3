package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ArtistaDAO {
    private static Connection conn;
    
    public ArtistaDAO() throws ClassNotFoundException, SQLException {
        conn = MyDatabase.getDatabase();
    }
    
    //****Métodos do CRUD****
    //INSERT (Create)
    public void insertArtista(Artista a) throws SQLException{
        //Criando a query para inserir o registro
        String query = "INSERT INTO artistas(nome, cod_genero, nacionalidade, solo)"
                + "VALUES(?,?,?,?)";
        
        //Preparar a query para ser executada no BD
        PreparedStatement prep = conn.prepareStatement(query);
        
        prep.setString(1, a.getArtista());
        prep.setInt(2, a.getGenero());
        prep.setString(3, a.getNacionalidade());
        prep.setInt(4, a.getSolo());
        
        //Executando a query pronta
        prep.execute();
        prep.close();
    }
    
    
    //SELECT
    public ArrayList<Artista> listAll() throws SQLException {
        //Criar lista vazia
        ArrayList<Artista> list = new ArrayList<>();
        
        //Criar query para pesquisa no BD
        String query = "SELECT * FROM artistas";
        
        //Preparar query para executar no BD
        PreparedStatement prep = conn.prepareStatement(query);
        
        //Pegar o resultado da pesquina no BD
        ResultSet res = prep.executeQuery();
        
        //Varrer "res" mapeando os registros do BD
        //Para objetos da classe "Artista"
        while(res.next()) {
            //Criar objeto Artista vazio
            Artista art = new Artista();
            
            //Inserir os valores nos atributos com
            //os dados vindos das colunas do BD
            art.setIdArtista(res.getInt("cod_artista"));
            art.setArtista(res.getString("nome"));
            art.setGenero(res.getInt("cod_genero"));
            art.setNacionalidade(res.getString("nacionalidade"));
            art.setSolo(res.getInt("solo"));
            
            //Inserir o objeto completo na lista
            list.add(art);
        }
        
        //Retornar lista cheia
        return list;
    }
    
    
    //SELECT
    public Artista listById(int i) throws SQLException {
        String query = "SELECT * FROM artistas "
                + "WHERE cod_artista = " + i;
        
        PreparedStatement prep = conn.prepareStatement(query);
        ResultSet res = prep.executeQuery();
        
        Artista art = new Artista();
        
        if(res.next()) {
            art.setIdArtista(res.getInt("cod_artista"));
            art.setArtista(res.getString("nome"));
            art.setGenero(res.getInt("cod_genero"));
            art.setNacionalidade(res.getString("nacionalidade"));
            art.setSolo(res.getInt("solo"));
        }
        
        return art;
    }
    
    
    //UPDATE
    public void updateArtista(Artista art) throws SQLException {
        String query = "UPDATE artistas SET nome = ?,"
                + "cod_genero = ?, nacionalidade = ?,"
                + "solo = ? WHERE cod_artista = ?";
        
        PreparedStatement prep = conn.prepareStatement(query);
        prep.setString(1, art.getArtista());
        prep.setInt(2, art.getGenero());
        prep.setString(3, art.getNacionalidade());
        prep.setInt(4, art.getSolo());
        prep.setInt(5, art.getIdArtista());
        
        prep.execute();
        prep.close();
    }
    
    
    public void deleteArtista(int id) throws SQLException {
        String query = "DELETE FROM artistas "
                + "WHERE cod_artista = " + id;
        
        PreparedStatement prep = conn.prepareStatement(query);
        prep.execute();
        prep.close();
    }
    
}//Fim da classe

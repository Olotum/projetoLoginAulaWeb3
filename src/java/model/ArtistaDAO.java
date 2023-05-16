package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ArtistaDAO {

    private static Connection conn;

    public ArtistaDAO() throws ClassNotFoundException, SQLException {
        conn = MyDatabase.getDatabase();
    }

    //****Métodos do CRUD****
    //INSERT (Create)
    public void insertArtista(Artista a) throws SQLException {
        //Criando a querypara inserir o registro
        String query = "INSERT INTO artistas(nome, cod_genero, nacionalidade, solo) VALUES (?,?,?,?)";

        // Preparar a query para ser executada no BD
        PreparedStatement prep = conn.prepareStatement(query);

        prep.setString(1, a.getArtista());
        prep.setInt(2, a.getGenero());
        prep.setString(3, a.getNacionalidade());
        prep.setInt(4, a.getSolo());
        //Executando a query pronta
        prep.execute();
        prep.close();
    }

}

package model;

public class Artista {
    private int idArtista;
    private String artista;
    private int genero;
    private String nacionalidade;
    private int solo;

    public Artista(String artista, int genero, String nacionalidade, int solo) {
        this.artista = artista;
        this.genero = genero;
        this.nacionalidade = nacionalidade;
        this.solo = solo;
    }
    
    public Artista(){}

    public int getIdArtista() {
        return idArtista;
    }

    public void setIdArtista(int idArtista) {
        this.idArtista = idArtista;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getSolo() {
        return solo;
    }

    public void setSolo(int solo) {
        this.solo = solo;
    }
    
    
}

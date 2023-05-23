/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author QI
 */
public class Artista {

    private String artista;
    private int genero;
    private String nacionalidade;
    private int solo;
    private int id_artista;

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

    public int getIdArtista() {
        return id_artista;
    }

    public void setIdArtista(int id_artista) {
        this.id_artista = id_artista;
    }

    public Artista(String artista, int genero, String nacionalidade, int solo) {
        this.artista = artista;
        this.genero = genero;
        this.nacionalidade = nacionalidade;
        this.solo = solo;
    }
    
    public Artista (){}

}

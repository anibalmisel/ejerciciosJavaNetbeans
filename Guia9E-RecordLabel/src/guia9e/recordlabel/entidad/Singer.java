/*
 Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y
tendrá como atributos el nombre y discoConMasVentas.
 */
package guia9e.recordlabel.entidad;

/**
 *
 * @author aniba
 */
public class Singer {
    //attributes
    private String name;
    private String bestSellingAlbums;
    //builders
    public Singer() {
    }
    public Singer(String name, String bestSellingAlbums) {
        this.name = name;
        this.bestSellingAlbums = bestSellingAlbums;
    }
    //getters & setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBestSellingAlbums() {
        return bestSellingAlbums;
    }
    public void setBestSellingAlbums(String bestSellingAlbums) {
        this.bestSellingAlbums = bestSellingAlbums;
    }
}

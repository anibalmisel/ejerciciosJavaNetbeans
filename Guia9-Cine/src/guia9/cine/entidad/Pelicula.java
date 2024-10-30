/*
 clase Pelicula con el título, director y duración de la película (en horas).
 */
package guia9.cine.entidad;

/**
 *
 * @author aniba
 */
public class Pelicula {
    //atributos
    private String title;
    private String director;
    private Integer duration;
    //constructores
    public Pelicula() {
    }

    public Pelicula(String title, String director, Integer duration) {
        this.title = title;
        this.director = director;
        this.duration = duration;
    }
    
    //getters & setters
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this. title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
    public Integer getDuration() {
        return duration;
    }
    
    public void setDuration(Integer duration) {
        this.duration = duration;
    }
    //toString

    @Override
    public String toString() {
        return "Pelicula{" + "title=" + title + ", director=" + director + ", duration=" + duration + '}';
    }
}
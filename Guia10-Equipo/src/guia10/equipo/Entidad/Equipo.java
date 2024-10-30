/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10.equipo.Entidad;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author aniba
 */
public class Equipo {
    //Atributos
    private String name;
    private Integer gamesPlayed;
    private Integer gamesWon;
    private Integer lostGames;
    private Integer tiedGames;
    private Integer championsShipsWon;
    private ArrayList<Jugador> players;
    //constructores
    public Equipo() {
        
    }

    public Equipo(String name, Integer gamesPlayed, Integer gamesWon, Integer lostGames, Integer tiedGames, Integer championsShipsWon, ArrayList<Jugador> players) {
        this.name = name;
        this.gamesPlayed = gamesPlayed;
        this.gamesWon = gamesWon;
        this.lostGames = lostGames;
        this.tiedGames = tiedGames;
        this.championsShipsWon = championsShipsWon;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGamesPlayed() {
        return gamesPlayed;
    }

    public void setGamesPlayed(Integer gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public Integer getGamesWon() {
        return gamesWon;
    }

    public void setGamesWon(Integer gamesWon) {
        this.gamesWon = gamesWon;
    }

    public Integer getLostGames() {
        return lostGames;
    }

    public void setLostGames(Integer lostGames) {
        this.lostGames = lostGames;
    }

    public Integer getTiedGames() {
        return tiedGames;
    }

    public void setTiedGames(Integer tiedGames) {
        this.tiedGames = tiedGames;
    }

    public Integer getChampionsShipsWon() {
        return championsShipsWon;
    }

    public void setChampionsShipsWon(Integer championsShipsWon) {
        this.championsShipsWon = championsShipsWon;
    }

    public ArrayList<Jugador> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Jugador> players) {
        this.players = players;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + Objects.hashCode(this.gamesPlayed);
        hash = 79 * hash + Objects.hashCode(this.gamesWon);
        hash = 79 * hash + Objects.hashCode(this.lostGames);
        hash = 79 * hash + Objects.hashCode(this.tiedGames);
        hash = 79 * hash + Objects.hashCode(this.championsShipsWon);
        hash = 79 * hash + Objects.hashCode(this.players);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Equipo other = (Equipo) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.gamesPlayed, other.gamesPlayed)) {
            return false;
        }
        if (!Objects.equals(this.gamesWon, other.gamesWon)) {
            return false;
        }
        if (!Objects.equals(this.lostGames, other.lostGames)) {
            return false;
        }
        if (!Objects.equals(this.tiedGames, other.tiedGames)) {
            return false;
        }
        if (!Objects.equals(this.championsShipsWon, other.championsShipsWon)) {
            return false;
        }
        if (!Objects.equals(this.players, other.players)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Equipo{" + ""
                + "\n name=" + name + ""
                + "\n gamesPlayed=" + gamesPlayed + ""
                + "\n gamesWon=" + gamesWon + ""
                + "\n lostGames=" + lostGames + ""
                + "\n tiedGames=" + tiedGames + ""
                + "\n championsShipsWon=" + championsShipsWon + ""
                + "\n players=" + players + '}';
    }
    
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia10.equipo.Servicios;

import guia10.equipo.Entidad.Equipo;
import guia10.equipo.Entidad.Jugador;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author aniba
 */
public class EquipoServicio {

    private Scanner sc;

    public EquipoServicio() {
        this.sc = new Scanner(System.in).useDelimiter("\n");
    }

    public void crearEquipo() {
        Equipo e1 = new Equipo();

        ArrayList<Jugador> players = new ArrayList();
        String exit = null;

        System.out.print("Enter name of the team:");
        String nameTeam = sc.nextLine();
        e1.setName(nameTeam);
        System.out.println("");
        System.out.print("Games Played:");
        Integer gamesPlayed = sc.nextInt();
        e1.setGamesPlayed(gamesPlayed);
        System.out.println("");
        System.out.print("Games Won:");
        Integer gamesWon = sc.nextInt();
        e1.setGamesWon(gamesWon);
        System.out.println("");
        System.out.print("Lost Games:");
        Integer lostGames = sc.nextInt();
        e1.setLostGames(lostGames);
        System.out.println("");
        System.out.print("Tied Games:");
        Integer tiedGames = sc.nextInt();
        e1.setTiedGames(tiedGames);
        System.out.println("");
        System.out.print("Champions Ships Won:");
        Integer championsShipsWon = sc.nextInt();
        e1.setChampionsShipsWon(championsShipsWon);
        System.out.println("");
        sc.nextLine();

        do {
            Jugador jg = new Jugador();
            System.out.print("List Players:");
            System.out.println("");
            System.out.print("Enter the name of players:");
            String namePlayers = sc.nextLine();
            jg.setName(namePlayers);
            System.out.print("Enter the lastname of players:");
            String lastNamePlayers = sc.nextLine();
            jg.setLastName(lastNamePlayers);
            System.out.print("Enter the number of players:");
            Integer numberOfPlayers = sc.nextInt();
            jg.setNumber(numberOfPlayers);
            sc.nextLine();
            System.out.print("Enter position of players:");
            String positionOfPlayers = sc.nextLine();
            jg.setPosition(positionOfPlayers);
            System.out.print("Enter average of players:");
            Double averageOfPlayers = sc.nextDouble();
            jg.setAverage(averageOfPlayers);
            sc.nextLine();
            System.out.println("");

            players.add(jg);
            System.out.println("Quiere introducir otro jugador? s/n");
            exit = sc.nextLine();
            System.out.println("");

        } while (exit.equalsIgnoreCase("s"));
        sc.close();
        e1.setPlayers(players);
        System.out.println("" + e1.toString());
        System.out.println("");
       
    }
}

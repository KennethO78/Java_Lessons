package com.Kenneth;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        //joe the name object has to match up with the .add... part to show up correctly
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(beckham);

        System.out.println(adelaideCrows.numPlayers());

        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Chicago Cubs");
        baseballPlayerTeam.addPlayer(pat);

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorm = new Team<>("Hawthorm");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorm.matchResults(fremantle, 1, 0);
        hawthorm.matchResults(adelaideCrows, 3, 8);

        adelaideCrows.matchResults(fremantle, 2, 1);
        //adelaideCrows.matchResults(baseballTeam, 1, 1);


        System.out.println("Rankings");
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthorm.getName() + ": " + hawthorm.ranking());

        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorm));
        System.out.println(hawthorm.compareTo(adelaideCrows));
        System.out.println(melbourne.compareTo(fremantle));

        ArrayList<Team> teams;
        //Collection.sort(teams);

    }
}

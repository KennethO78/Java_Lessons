package com.Kenneth;

public class Main {

    public static void main(String[] args) {

        League<Team<FootballPlayer>> footballleague = new League <>("AFL");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        Team<FootballPlayer> hawthorm = new Team<>("Hawthorm");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        Team<BaseballPlayer> baseballPlayerTeam = new Team<>("Chicago Cubs");

        hawthorm.matchResults(fremantle, 1, 0);
        hawthorm.matchResults(adelaideCrows, 3, 8);

        adelaideCrows.matchResults(fremantle, 2, 1);

        footballleague.add(adelaideCrows);
        footballleague.add(melbourne);
        footballleague.add(hawthorm);
        footballleague.add(fremantle);

//        footballleague.add(baseballPlayerTeam);

        footballleague.showLeagueTable();




    }
}

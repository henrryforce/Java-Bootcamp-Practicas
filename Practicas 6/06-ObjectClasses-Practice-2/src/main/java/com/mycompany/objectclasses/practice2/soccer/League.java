/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.objectclasses.practice2.soccer;

/**
 *
 * @author LuisEnrique
 */
public class League {
    public static void main(String[] args){
        Player player1 = new Player();
        player1.playerName="George Eliot";
        Player player2 = new Player();
        player2.playerName="Graham Green";
        Player player3 = new Player();
        player3.playerName="Geoffrey Chaucer";
        Player[] thePlayers = {player1,player2,player3};
        Team team1 = new Team();
        team1.teamName="The Greens";
        team1.arrayPlayer=thePlayers;
        Team team2 = new Team();
        team2.teamName="The Reds";
        team2.arrayPlayer = new Player[3];
        team2.arrayPlayer[0] = new Player();
        team2.arrayPlayer[0].playerName ="Robert Service";
        team2.arrayPlayer[1] = new Player();
        team2.arrayPlayer[1].playerName ="Robbie Burns";
        team2.arrayPlayer[2] = new Player();
        team2.arrayPlayer[2].playerName ="Rafael Sabatini";
        Game currGame = new Game();
        currGame.homeTeam = team1;
        currGame.awayTeam = team2;
        Goal goal1 = new Goal();
        goal1.thePlayer = currGame.homeTeam.arrayPlayer[2];
        goal1.theTeam=currGame.homeTeam;
        goal1.theTime=55;
        Goal[] theGoals = {goal1};
        currGame.goals = theGoals;
        System.out.println("Goal scored after " + currGame.goals[0].theTime +" mins by "+currGame.goals[0].thePlayer.playerName+" of "+currGame.goals[0].theTeam.teamName);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.methods.practice1;


/**
 *
 * @author LuisEnrique
 */
public class League {
    public static void main(String[] args){
        
        
        Team[] theTeams = createTeams();
        Game[] theGame = createGame(theTeams);
       Game currGame = theGame[0];
        Goal goal1 = new Goal();
        goal1.thePlayer = currGame.homeTeam.arrayPlayer[2];
        goal1.theTeam=currGame.homeTeam;
        goal1.theTime=55;
        Goal[] theGoals = {goal1};
        currGame.goals = theGoals;
        System.out.println("Goal scored after " + currGame.goals[0].theTime +" mins by "+currGame.goals[0].thePlayer.playerName+" of "+currGame.goals[0].theTeam.teamName);
       
        
        }
    public static Team[] createTeams(){
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
        Team[] theTeams = {team1,team2};
        return theTeams;
    }
    public static Game[] createGame(Team[] theTeams){
         Game currGame = new Game();
        currGame.homeTeam = theTeams[0];
        currGame.awayTeam = theTeams[1];
        Game[] theGame ={currGame};
        return theGame;
    }
}

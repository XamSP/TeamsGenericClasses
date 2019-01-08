package LeagueChampionship;

import java.util.ArrayList;

public abstract class Team<T extends Player> {
    private String name;
    private int played;
    private int won;
    private int lost;
    private int tied;
    private int totalPoints = (won * 2) - lost + tied;

    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
        this.played = 0;
        this.won = 0;
        this.lost = 0;
        this.tied = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public int getPlayed() {
        return played;
    }

    public void setPlayed(int played) {
        this.played = played;
    }

    public int getWon() {
        return won;
    }

    public void addWon() {
        this.won = this.won + 1;
    }

    public int getLost() {
        return lost;
    }

    public void addLost() {
        this.lost = this.lost + 1;
    }

    public int getTied() {
        return tied;
    }

    public void addTied() {
        this.tied = this.tied + 1;
    }

    public ArrayList getMembers() {
        return members;
    }

    public void addMember(T player) {
        int indexOfPlayer = findPlayer(player);
        if(indexOfPlayer >= 0){
            System.out.println(player.getName() + " is already added!");
        } else {
            members.add(player);
            System.out.println(player.getName() + " was added!");
        }
    }

    public void removePlayer(T player) {
        int indexOfPlayer = findPlayer(player);
        if(indexOfPlayer < 0){
            System.out.println(player.getName() + " is not in the team!");
        } else {
            members.remove(indexOfPlayer);
            System.out.println(player.getName() + " was removed from " + this.getName() + "!");
        }
    }

    public void printPlayers() {
        System.out.println("These are the players from " + this.getName() + ":");

        for (int i = 0; i < members.size(); i++) {
            System.out.println(i + ": " + members.get(i).getName());
        }
    }

    public int findPlayer(T player){
        return findPlayer(player.getName());
    }

    public int findPlayer(String playerName) {
        for (int i = 0; i < members.size(); i++) {
            String currentPlayer = members.get(i).getName();
            if (playerName.equals(currentPlayer)) {
                return i;
            }
        }
        return -1;
    }
}

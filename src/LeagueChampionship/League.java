package LeagueChampionship;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class League <T extends Team>{

    private String name;

    private ArrayList<T> teams = new ArrayList<>();

    private ArrayList<T> remainingTeams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<T> getTeams() {
        return teams;
    }

    public ArrayList<T> getRemainingTeams() {
        return remainingTeams;
    }

    public void addTeam(T team){
        int indexOfTeam = findTeam(team);

        if(indexOfTeam >= 0){
            System.out.println(team.getName() + " is already registered in " + this.getName());
        } else {
            teams.add(team);
            System.out.println(team.getName() + " was added to the " + this.getName());
        }
    }

    public void removeTeam(T team) {
        int indexOfTeam = findTeam(team);

        if(indexOfTeam < 0){
            System.out.println(team.getName() + " not found in " + this.getName());
        } else {
            teams.remove(indexOfTeam);
            System.out.println(team.getName() + " was removed from the " + this.getName());
        }
    }

    public int findTeam(T team) {
        return findTeam(team.getName());
    }

    public int findTeam(String nameTeam) {
        for(int i = 0; i < teams.size(); i++) {
            String currentTeamName = teams.get(i).getName();
            if(nameTeam.equals(currentTeamName)){
                return i;
            }
        }
        return -1;
    }

    public void printTeams() {
        System.out.println("Here are the teams for the " + this.getName());

        for(int i = 0; i < teams.size(); i++) {
            System.out.println(i + ": " + teams.get(i).getName());
        }
    }

    public class SortByTotalPoints implements Comparator<T>
    {
        // Used for sorting in ascending order of totalPoints of each team
        public int compare(T a, T b)
        {
            System.out.println(a.getName() + " " + a.getTotalPoints() + " | " + b.getName() + " " + b.getTotalPoints());
            return a.getWon() + b.getWon();
        }
    }

    public void sortTeamsByPoints() {
        Collections.sort(teams, new SortByTotalPoints());
    }

}

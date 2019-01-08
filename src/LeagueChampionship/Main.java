package LeagueChampionship;

public class Main {

    public static void main(String[] args) {

        League<Team> superLeague = new League<>("Super League");

        EnglandTeam chelsea = new EnglandTeam("Chelsea");

        EnglandTeam arsenal = new EnglandTeam("Arsenal");

        EnglandTeam liverPool = new EnglandTeam("Liver Pool");

        EnglandTeam manchesterUnited = new EnglandTeam("Manchester United");

        FootballPlayer mike = new FootballPlayer("Mike", "Striker");

        FootballPlayer bike = new FootballPlayer("Bike", "Striker");

        FootballPlayer ike = new FootballPlayer("Ike", "Striker");

        FootballPlayer mycen = new FootballPlayer("Mycen", "Striker");

        chelsea.addMember(mike); arsenal.addMember(bike);

        liverPool.addMember(ike); manchesterUnited.addMember(mycen);

        superLeague.addTeam(liverPool); superLeague.addTeam(manchesterUnited);

        superLeague.addTeam(arsenal); superLeague.addTeam(chelsea);

        liverPool.addLost(); manchesterUnited.addWon();

        chelsea.addWon(); arsenal.addLost();

        liverPool.addLost(); arsenal.addWon();

        chelsea.addWon(); manchesterUnited.addLost();

        manchesterUnited.addLost(); arsenal.addWon();

        chelsea.addWon(); arsenal.addLost();

        superLeague.printTeams();

        superLeague.sortTeamsByPoints();

        superLeague.printTeams();
    }
}
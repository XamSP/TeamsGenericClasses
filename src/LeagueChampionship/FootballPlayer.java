package LeagueChampionship;

public class FootballPlayer extends Player{

    private String position;

    public FootballPlayer(String name, String position) {
        super(name);
        this.position = position;
    }

    public String getPosition() {
        return this.position;
    }

}

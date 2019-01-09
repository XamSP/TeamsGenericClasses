package LeagueChampionship;

public class BaseballPlayer extends Player{

    private String position;

    public BaseballPlayer(String name, String position) {
        super(name);
        this.position = position;
    }

    public String getPosition() {
        return this.position;
    }

}

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team<? extends Player>> {
    private String name;
    private ArrayList<T> leagueTeams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(T team) {
        if (this.leagueTeams.contains(team)) {
            return false;
        } 
        this.leagueTeams.add(team);
        return true;
    }

    public boolean showTable() {
        Collections.sort(leagueTeams);
        System.out.println(" \n" + this.name + " Table show" );
        for (T team : leagueTeams) {
            System.out.printf("%-8s", team.getName() );
            System.out.println(" : " + team.getPoint());
        }
        return true;
    }
}

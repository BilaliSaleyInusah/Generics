import java.util.ArrayList;
import java.util.Collections;
public class League<T extends Team >{
    private String name;
    ArrayList<T> teams;
    // ArrayList<Team> rankedTeams;

    public League(String name){
        this.name = name;
        this.teams = new ArrayList<T>();
        // this.rankedTeams = new ArrayList<Team>();
    }

    public String getName() {
        return name;
    }

    // public ArrayList<Team> getTeams() {
    //     return teams;
    // }

    public boolean add(T team){
        if (teams.contains(team)) {
            System.out.println("dublicate");
            return false;
        }
        this.teams.add(team);
        return true;
    }

    public boolean rank(){
       
        return true;
    }

    public void printTable(){
        Collections.sort(teams);
        for (T t : teams) {
            System.out.println(t.getName() + " : " + t.getPoint());
        }
    }
    

    
}

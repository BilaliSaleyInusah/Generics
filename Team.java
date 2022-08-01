import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team> {
    private String name;
    private int played;
    private int won;
    private int lost;
    private int tied;
    ArrayList<Player> players = new ArrayList<Player>();

    public Team(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean add(T player){
        if (players.contains(player)) {
            System.out.println(player + " is already in the team, " + this.getName());
            return false;
        }else{
            players.add(player);
            System.out.println(player.getName() + " is picked for team " + this.getName());
            return true;
        }
    }

    public int numPlayers(){
        int num = players.size();
        return num;
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        if (opponent != null) {
            System.out.println(getName() + " : " + ourScore + " | " + theirScore + " : " + opponent.getName());
        }
        if (ourScore > theirScore) {
            if (opponent != null) {
                System.out.println(getName() + " won");
            }
            this.won++;
            // opponent.lose++;
        }else if (ourScore < theirScore) {
            if (opponent != null) {
                System.err.println(opponent.getName() + " won");
            }
            this.lost++;
            // opponent.win++;
        }else{
            if (opponent != null) {
                System.out.println("draw match");
            }
            this.tied++;
            // opponent.tied++;
        }
        this.played++;
        if (opponent != null) {
            opponent.matchResult(null, theirScore, ourScore);
        }
    }

    public int ranking(){
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team team) {
        if (ranking() > team.ranking()) {
            return 1;
        } else if (ranking() < team.ranking()) {
            return -1;
        } else {
            return 0;
        }
    }


}

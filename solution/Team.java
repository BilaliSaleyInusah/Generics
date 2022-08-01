import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;                                           
    private int played;
    private int won;
    private int lost;
    private int tied;
    private int point;
    ArrayList<Player> players = new ArrayList<Player>();

    public Team(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPoint() {
        return point;
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
            // System.out.println(getName() + " : " + ourScore + " | " + theirScore + " : " + opponent.getName());
            System.out.printf("%-8S", getName());
            System.out.print(" : "  + ourScore + " | " + theirScore + " :  ");
            System.out.printf("%s%n", opponent.getName());
        }
        if (ourScore > theirScore) {
            // if (opponent != null) {
            //     System.out.println(getName() + " won");
            // }
            this.won++;
            this.point = this.point + 3;
            // opponent.lost++;
        }else if (ourScore < theirScore) {
            // if (opponent != null) {
            //     System.err.println(opponent.getName() + " won");
            // }
            this.lost++;
            // opponent.point = opponent.point + 3;
            // opponent.won++;
        }else{
            // if (opponent != null) {
            //     System.out.println("draw match");
            // }
            this.tied++;
            this.point++;
            // opponent.tied++;
            // opponent.point++;
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
    // public int compareTo(Team<T> team) {
    //     if (ranking() > team.ranking()) {
    //         return -1;
    //     } else if (ranking() < team.ranking()) {
    //         return 1;
    //     } else {
    //         return 0;
    //     }
    // }
    public int compareTo(Team<T> team) {
        if (this.point > team.point) {
            return -1;
        } else if (point < team.point) {
            return 1;
        } else {
            return 0;
        }
    }


}

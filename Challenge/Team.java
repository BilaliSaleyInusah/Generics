public abstract class Team implements Comparable<Team> {
    private String name;
    private int played;
    private int won;
    private int lost;
    private int tied;
    private int point = 0;
    private int rank;

    
    public Team(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getLost() {
        return lost;
    }
    public int getPlayed() {
        return played;
    }
    public int getTied() {
        return tied;
    }
    public int getWon() {
        return won;
    }
    public int getRank() {
        return rank;
    }
    public int getPoint() {
        return point;
    }
    
    public boolean getResult(Team team , int ourScore , int theirScore ){

        if (team == null) {
            return false;
        }
          
        if (ourScore > theirScore) {
            System.out.println(getName() + " won " + team.getName() );
            this.won++;
            team.lost++;
            this.point = this.point + 3;
        } else if (theirScore > ourScore) {
            System.out.println(getName() + " lost " + team.getName() );
            this.lost++;
            team.won++;
            team.point = team.point + 3;
        } else {
            System.out.println(getName() + " draw " + team.getName() );
            this.tied++;
            this.point++;
            team.tied++;
            team.point++;
        }
        return true;
    }

    @Override
    public int compareTo(Team team) {
        if (this.getPoint() > team.getPoint()) {
            return 1;
        } else if (this.getPoint() < team.getPoint()) {
            return -1;
        } else {
            return 0;
        }
    }

}

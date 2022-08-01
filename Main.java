public class Main {

    public static void main(String[] args) {
        Football bil = new Football("Bilali");
        SoccerBall sal = new SoccerBall("Saley");
        Baseball inu = new Baseball("Inusah");

        Team<Football> family = new Team<>("Family Team");
        family.add(bil);
        // family.add(sal);
        // family.add(inu);
        Team rawTeam = new Team<>("name");

        System.out.println(family.numPlayers());
        family.matchResult(new Team<>("zoo"), 5, 3);

        Team<Baseball> baseFamily = new Team<>("BaseBall family team");
        baseFamily.matchResult(new Team<>("bill"), 8, 7);
        baseFamily.add(inu);
        System.out.println(baseFamily.numPlayers());

        System.out.println(family.compareTo(baseFamily));

        
    }
}
public class Main {
    
    public static void main(String[] args) {
      
        Team<Football> Real = new Team<>("Real");
        Team<Football> ManU = new Team<>("ManU");
        Team<Football> ManC = new Team<>("Manc");
        Team<Football> Blues = new Team<>("Blues");
        Team<Football> Arsenal = new Team<>("Arsenal");
        Team<Baseball> sal = new Team<>("saley");

        Real.matchResult(Blues, 5, 3);
        ManU.matchResult(Arsenal, 0, 3);
        ManC.matchResult(Real, 8, 4);
        Blues.matchResult(ManU, 5, 3);
        Arsenal.matchResult(ManC, 1, 3);

        League<Team<Football>> league1 = new League<>("league1");
        league1.addTeam(Real);
        league1.addTeam(ManU);
        league1.addTeam(ManC);
        league1.addTeam(Blues);
        league1.addTeam(Arsenal);
         
        league1.showTable();
        

    }
}

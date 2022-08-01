public class Main {
    
    public static void main(String[] args) {
        League<Baseball> league1 = new League<>("League1");
        Baseball b1 = new Baseball("b1");
        Baseball b2 = new Baseball("b2");
        Baseball b3 = new Baseball("b3");
        Baseball b4 = new Baseball("b4");
        Baseball b5 = new Baseball("b5");
        Baseball b6 = new Baseball("b6");
        Baseball b7 = new Baseball("b7");

        league1.add(b1);
        league1.add(b2);
        league1.add(b3);
        league1.add(b4);
        league1.add(b5);
        league1.add(b6);
        league1.add(b6);

        b1.getResult(b2, 2, 0);
        b2.getResult(b1, 2, 3);
        b3.getResult(b5, 1, 0);
        b4.getResult(b6, 5, 2);
        b5.getResult(b7, 0, 2);
        b6.getResult(b3, 2, 7);
        b7.getResult(b4, 1, 2);

        


        // league1.rank();
        league1.printTable();
    }
}
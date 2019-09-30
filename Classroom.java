

public class Classroom{



    public static void main(String[] args) {
        
        Wilder Laurent = new Wilder ("Laurent",true);
        Wilder Camille = new Wilder("Camille",false);

        System.out.println(Camille.whoAmI());
        System.out.println(Laurent.whoAmI());
        Camille.isAware(true);
        Laurent.setFirstName("Lolo");
        System.out.println(Camille.whoAmI());
        System.out.println(Laurent.whoAmI());

    }
}
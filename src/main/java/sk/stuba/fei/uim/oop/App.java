package sk.stuba.fei.uim.oop;

public class App {
    public static void main(String[] args) {
        int celeCislo = 5;
        long celeVacsieCislo = 5L;
        float desatinneCislo = 5.5f;
        double dlhsieDesatinneCislo = 5.5;
        char znak = 'A';
        String retazec = "retazec";
        boolean bool = false;

        int podiel =2/3;
        System.out.println(podiel);

        int zvysok = 2%3;   //mod
        System.out.println(zvysok);

        float podielFloat = 2/3.0f;   //mod
        System.out.println(podielFloat);
        
        int cislo=2;
        switch (cislo) {
            case 1:
                System.out.println("cislo je jedna");
                break;
            case 2:
                System.out.println("cislo je dva");
                break;
            default:
                System.out.println("cislo je ine");
        }

    }
}


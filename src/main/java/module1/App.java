package module1;

public class App {
    public static void main(String[] args) {
    Calcul1 calcul1= new Calcul1();
    calcul1.getRezultatSuma(29.5,67.8);
    calcul1.getRezultatInmultire(13.3,12.7);
    calcul1.getRezultatPutere(2.9,4.8);
        System.out.println("Rezultatul adunarii este: "+calcul1.rezultatSuma);
        System.out.println("Rezultatul inmultirii este: "+calcul1.rezultatInmultire);
        System.out.println("Rezultatul ridicarii la putere este: "+ calcul1.rezultatPutere);
    }
}

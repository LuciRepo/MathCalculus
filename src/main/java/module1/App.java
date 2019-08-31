package module1;

public class App {
    public static void main(String[] args) {
    Calcul1 calcul1= new Calcul1();
    calcul1.getRezultatSuma(34.4,67.7);
        System.out.println("Rezultatul adunarii numerelor rationale este: "+calcul1.rezultatSuma);
    calcul1.getRezultatSuma(34,56);
        System.out.println("Rezultatul adunarii numerelor intregi este: "+calcul1.rezultatSuma);
    calcul1.getRezultatInmultire(13.3,12.7);
        System.out.println("Rezultatul inmultirii numerelor rationale este: "+calcul1.rezultatInmultire);
        calcul1.getRezultatInmultire(45,65);
        System.out.println("Rezultatul inmultirii numerelor intregi este: "+calcul1.rezultatInmultire);
    calcul1.getRezultatImpartire(23.8,7);
        System.out.println("Rezultatul impartirii numerelor rationale este: "+calcul1.rezultatImpartire);
    calcul1.getRezultatImpartire(45.0,8.0);
        System.out.println("Rezultatul impartirii numerelor intregi este: "+calcul1.rezultatImpartire);
    calcul1.getRezultatPutere(2.9,4.8);
        System.out.println("Rezultatul ridicarii la putere este: "+ calcul1.rezultatPutere);
     calcul1.getRezultatPutere(9.0,7) ;
        System.out.println("Rezultatul ridicarii la putere este: "+ calcul1.rezultatPutere);
    }
}

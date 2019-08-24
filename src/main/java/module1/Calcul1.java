package module1;

public class Calcul1 {
    double x;
    double y;
    double rezultatSuma;
    double rezultatInmultire;
    double rezultatPutere;


    public double getRezultatSuma(double x, double y) {
        this.x = x;
        this.y = y;
        //System.out.println(x+y);
        return rezultatSuma = x + y;
    }

    public double getRezultatInmultire(double x, double y) {
        this.x = x;
        this.y = y;
        return rezultatInmultire = x * y;
    }

    public double getRezultatPutere(double x, double y) {
        this.x = x;
        this.y = y;
        return rezultatPutere = Math.pow(x, y);

    }
}

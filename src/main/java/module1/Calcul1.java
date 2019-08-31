package module1;

public class Calcul1 {
    double x;
    double y;
    int a;
    int b;
    double rezultatSuma;
    double rezultatInmultire;
    double rezultatImpartire;
    double rezultatPutere;


    public double getRezultatSuma(double x, double y) {
        this.x = x;
        this.y = y;
        //System.out.println(x+y);
        return rezultatSuma = x + y;
    }

    public double getRezultatSuma(int a, int b) {
        this.a = a;
        this.b = b;
        return rezultatSuma = a + b;
    }

    public double getRezultatInmultire(double x, double y) {
        this.x = x;
        this.y = y;
        return rezultatInmultire = x * y;
    }

    public double getRezultatInmultire(int a, int b) {
        this.a = a;
        this.b = b;
        return rezultatInmultire = a * b;
    }

    public double getRezultatImpartire(double x, double y) {
        this.x = x;
        this.y = y;
        return rezultatImpartire = x / y;
    }

    public double getRezultatImpartire(int a, int b) {
        this.a = a;
        this.b = b;
        return rezultatImpartire = a / b;
    }

    public double getRezultatPutere(double x, double y) {
        this.x = x;
        this.y = y;
        return rezultatPutere = Math.pow(x, y);
    }
    public double getRezultatPutere(int a, int b){
        this.a=a;
        this.b=b;
        return rezultatPutere=Math.pow(a,b);
    }
}

package Zadanie1;

import java.util.Scanner;

/**
 *
 * @author Kamil Zemczak
 */
public class RownKwadratoweLogika {
    private double a;
    private double b;
    private double c;
    private double delta;

    public RownKwadratoweLogika(double a, double b, double c) {
        if(a == 0)
            throw new IllegalArgumentException("To nie jest równanie kwadratowe.");
        this.a = a;
        this.b = b;
        this.c = c;
        
        delta = b*b-4*a*c;
    }

    public int lbPierwiastkow() {
        if(delta > 0){
            return 2;
        }
        else if(delta == 0){
            return 1;
        }
        else
            return 0;
    }
    
    public double[] getPierwiastki() {
        if(lbPierwiastkow() == 2)
            return new double[]{(-b-Math.sqrt(delta))/(2*a), (-b+Math.sqrt(delta))/(2*a)};
        else if(lbPierwiastkow() == 1)
            return new double[]{(-b)/(2*a)};
        else
            return null;
    }
    
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Program liczący pierwiastki równania kwadratowego.");
        System.out.println("Podaj a: ");
        double a = scan.nextDouble();
        System.out.println("Podaj b: ");
        double b = scan.nextDouble();
        System.out.println("Podaj c: ");
        double c = scan.nextDouble();
        
        RownKwadratoweLogika rk = new RownKwadratoweLogika(a, b, c);
        System.out.println("Liczba pierwiastków: " + rk.lbPierwiastkow() + ".");
        
        if(rk.lbPierwiastkow() == 2)
            System.out.println("Pierwiastki: x1: " + rk.getPierwiastki()[0] + " oraz x2: " + rk.getPierwiastki()[1]);
        else if(rk.lbPierwiastkow() == 1)
            System.out.println("Pierwiastek: " + rk.getPierwiastki()[0]);
        else
            System.out.println("Brak pierwiastków rzeczywistych.");
    }
}
    
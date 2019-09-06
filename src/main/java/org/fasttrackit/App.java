package org.fasttrackit;

public class App {
    public static void main(String[] args) {
        Sum sum = new Sum();
        sum.CalculationSum(8, 7);

        System.out.println(" Suma numerelor este: " + sum.CalculationSum(8, 7));

        Reduction reduction = new Reduction();
        reduction.CalculationR(8, 7);

        System.out.println(" Rezultatul scaderii numerelor este: " + reduction.CalculationR(8, 7));

        Multiplication multiplication = new Multiplication();
        multiplication.CalculationM(8, 7);

        System.out.println(" Rezultatul inmultirii numerelor este: " + multiplication.CalculationM(8, 7));

        Division division = new Division();
        division.CalculationD(8, 7);

        System.out.println(" Rezultatul impartirii numerelor este: " + division.CalculationD(8, 7));

        Modulo modulo = new Modulo();
        modulo.CalculationM(8, 7);

        System.out.println(" Restul impartirii numerelor: " + modulo.CalculationM(8, 7));

    }
}

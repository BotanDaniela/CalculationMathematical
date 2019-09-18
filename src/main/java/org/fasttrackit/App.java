package org.fasttrackit;

public class App {
    public static void main(String[] args) {
        Sum sum = new Sum();
        sum.CalculationSum(8, 7);
        sum.CalculationSum(8);

        System.out.println(" Suma numerelor este: " + sum.CalculationSum(8, 7) + " si " + sum.CalculationSum(8));

        Reduction reduction = new Reduction();
        reduction.CalculationR(8, 7);
        reduction.CalculationR(8);

        System.out.println(" Rezultatul scaderii numerelor este: " + reduction.CalculationR(8, 7) + " si " + reduction.CalculationR(8));

        Multiplication multiplication = new Multiplication();
        multiplication.CalculationM(8, 7);
        multiplication.CalculationM(8);

        System.out.println(" Rezultatul inmultirii numerelor este: " + multiplication.CalculationM(8, 7) + " si " + multiplication.CalculationM(8));

        Division division = new Division();
        division.CalculationD(8, 7);
        division.CalculationD(8);

        System.out.println(" Rezultatul impartirii numerelor este: " + division.CalculationD(8, 7) + " si " + division.CalculationD(8));

        Modulo modulo = new Modulo();
        modulo.CalculationM(8, 7);
        modulo.CalculationM(8);

        System.out.println(" Restul impartirii numerelor: " + modulo.CalculationM(8, 7) + " si " + modulo.CalculationM(8));

    }
}

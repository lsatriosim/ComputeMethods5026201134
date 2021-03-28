import java.util.Scanner;

public class TestClass5026201134 {

    public static void main(String[] args){
        //Thermal Converter
        Scanner sc = new Scanner(System.in);
        System.out.print("Input degree in Farenheit: ");
        double degreeF = sc.nextDouble();
        ComputeMethods5026201134 cm = new ComputeMethods5026201134();
        double degreeC = cm.fToC(degreeF);
        System.out.println("Temp in celsius is " + degreeC);
        System.out.println();

        //hypotenuse machine
        System.out.print("input side lengths of a triangle: ");
        int a = sc.nextInt();
        System.out.print("input another side lenghts: ");
        int b = sc.nextInt();
        double hypo = cm.hypotenuse(a, b);
        System.out.println("Hypotenuse is "+ hypo);
        System.out.println();

        //Sum of dice
        int sum = cm.roll();
        System.out.println("The sum of the dice values is "+ sum);


    }

}

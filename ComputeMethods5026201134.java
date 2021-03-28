import java.util.Random;
public class ComputeMethods5026201134 {

    public double fToC (double degreeF){
        double degreeC = 5.0/9*(degreeF-32);
        return degreeC;
    }

    public double hypotenuse(int a, int b){
        double hypo = Math.sqrt(Math.pow(a, 2) + Math.pow(b,2));
        return hypo;
    }

    public int roll(){
        Random rn = new Random();
        int dice = rn.nextInt(11) + 2;
        return dice;
    }
}

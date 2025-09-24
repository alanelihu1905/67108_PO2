import java.util.Random; 

public class MonteCarlo {

    public static void main(String[] args) {
        int totalSamples = 1_000_000;
        long insideCircle = 0;
        Random rand = new Random();

        for (int i = 0; i < totalSamples; i++) {
            double x = rand.nextDouble();
            double y = rand.nextDouble();
            if (x * x + y * y <= 1.0) {
                insideCircle++;
            }
        }

        double piApprox = (4.0 * insideCircle) / totalSamples;
        System.out.println("Número total de puntos: " + totalSamples);
        System.out.println("Puntos dentro del círculo: " + insideCircle);
        System.out.println("Aproximación de π: " + piApprox);
        System.out.println("Error: " + Math.abs(piApprox - Math.PI));
    }
}

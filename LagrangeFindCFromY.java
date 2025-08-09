import java.util.Scanner;

public class LagrangeFindCFromY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] x = new double[3];
        double[] y = new double[3];

    
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter x" + (i + 1) + ": ");
            x[i] = sc.nextDouble();
        }

        
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter y" + (i + 1) + " from JSM output: ");
            y[i] = sc.nextDouble();
        }

    
        double cValue = 0;
        for (int i = 0; i < 3; i++) {
            double term = y[i];
            for (int j = 0; j < 3; j++) {
                if (j != i) {
                    term *= (0 - x[j]) / (x[i] - x[j]);
                }
            }
            cValue += term;
        }

        System.out.println("Constant c value: " + cValue);
        sc.close();
    }
}
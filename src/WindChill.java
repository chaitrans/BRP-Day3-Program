import java.util.Scanner;
public class WindChill {
    public static void main(String[] args) {
        System.out.println("");
        Scanner s = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double t = s.nextDouble();
        System.out.print("Enter a wind speed (in miles per hr): ");
        double v = s.nextDouble();

        double windChill = 35.74 + (0.6215 * t) + ((0.4275 * t - 35.75) * (Math.pow(v, 0.16)));

        System.out.printf("Wind Chill is: %.2f", windChill);
    }
}
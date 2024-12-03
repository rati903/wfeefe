import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("wyfgegywgeffyg", "hbadifbaibf", 2023, "Rati");
        Car car2 = new Car("hqebibdh", "iendo", 2024, "bbeqibdbe");
        car1.printInfo();
        car2.printInfo();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a, b, and k: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int k = scanner.nextInt();
        Methods methods = new Methods();
        System.out.println("Sum of multiples of " + k + " in [" + a + ", " + b + "] is: " + methods.sumOfMultiples(a,b,k));
        System.out.print("Enter n: ");
        int n = scanner.nextInt();
        System.out.println("Sum of natural numbers from 1 to " + n + " is: " + methods.sumOfNaturalNumbers(n));
        System.out.println(a + "^" + n + " = " + methods.power(a,n));;
        System.out.print("Enter x: ");
        int x = scanner.nextInt();
        System.out.println(methods.countZeros(x));
        methods.checkZeroParity(x);

    }
}
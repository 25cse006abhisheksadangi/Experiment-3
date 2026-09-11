import java.util.Scanner;

class calculator {

    static public void powerInt(int num1, int num2) {

        System.out.println(
            "Power = " + Math.pow(num1, num2)
        );
    }

    static public void powerDouble(double num1, int num2) {

        System.out.println(
            "Power = " + Math.pow(num1, num2)
        );
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter x and y");

        int x, y;

        x = sc.nextInt();
        y = sc.nextInt();

        powerInt(x, y);

        System.out.println("Enter x1 and y1");

        double x1;
        int y1;

        x1 = sc.nextDouble();
        y1 = sc.nextInt();

        powerDouble(x1, y1);

        sc.close();
    }
}
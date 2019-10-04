import java.util.Scanner;

class Punkt {
    private double x;
    private double y;

    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punkt() {
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


    public void translate(double x2, double y2) {
        this.x = this.x + x2;
        this.y = this.y + y2;
    }

    public void show() {
        System.out.println(getX() + " " + getY());
    }

    public void scale(double x2) {
        this.x *= x2;
        this.y *= x2;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();
        String[] podzielone = x.split(" ", 2);
        Punkt p1 = new Punkt(Double.parseDouble(podzielone[0]), Double.parseDouble(podzielone[1]));


        double liczba = scanner.nextDouble();
        operacje(liczba, p1);


    }


    public static Punkt operacje(double liczba, Punkt p1) {
        Scanner scanner = new Scanner(System.in);
        if (liczba <= 4 && liczba >= 0) {
            if (liczba == 0) {
                scanner.nextLine();
                String x2 = scanner.nextLine();
                String[] podzielone2 = x2.split(" ", 2);
                p1.translate(Double.parseDouble(podzielone2[0]), Double.parseDouble(podzielone2[1]));
                p1.show();
                return p1;
            }

            if (liczba == 1) {
                double liczba2 = scanner.nextDouble();
                p1.scale(liczba2);
                p1.show();
                return p1;
            }
            if (liczba == 2) {

                scanner.nextLine();
                String x2 = scanner.nextLine();
                String[] podzielone2 = x2.split(" ", 2);
                p1.translate(Double.parseDouble(podzielone2[0]), Double.parseDouble(podzielone2[1]));
                double liczba2 = scanner.nextDouble();
                p1.scale(liczba2);
                p1.show();
                return p1;

            }
            if (liczba == 3) {
                scanner.nextLine();


                double liczba2 = scanner.nextDouble();
                scanner.nextLine();
                String x3 = scanner.nextLine();
                p1.scale(liczba2);


                String[] podzielone3 = x3.split(" ", 2);
                p1.translate(Double.parseDouble(podzielone3[0]), Double.parseDouble(podzielone3[1]));
                p1.show();
            }
            if (liczba == 4) {
                p1.show();
                return p1;
            }


        }

        return p1;
    }


}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();

        Scanner in = new Scanner(System.in);

        System.out.println("Для расчета площади треугольника, необходимо ввести длины всех сторон");
        System.out.print("Введите значение для стороны А: ");
        triangle.setSideA(in.nextDouble());

        System.out.print("Введите значение для стороны B: ");
        triangle.setSideB(in.nextDouble());

        System.out.print("Введите значение для стороны C: ");
        triangle.setSideC(in.nextDouble());

        System.out.println(triangle.areaTrianle());
 ///////////////////////////////////////////////////////////
        triangle.setSideA(5);
        triangle.setSideB(5);
        triangle.setSideC(5);
        System.out.println("площадь треугольника вычисленная через сетеры");
        System.out.println(triangle.areaTrianle());
////////////////////////////////////////////////////////////
        System.out.println("Как вычислить площадь треугольника используя конструктор?:");
        System.out.println("   public Triangle (double sideA, double sideB, double sideC){\n" +
                "        this.sideA=sideA;\n" +
                "        this.sideB=sideB;\n" +
                "        this.sideC=sideC;");










    }


}

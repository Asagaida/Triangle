/**
 Описать класс «Triangle». В качестве свойств возьмите длинны сторон
 треугольника. Реализуйте метод который будет возвращать площадь этого
 треугольника. Создайте несколько объектов этого класса и протестируйте их.
 */
public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;


    public Triangle(){
        super();
    }

    public Triangle (double sideA, double sideB, double sideC){
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
    }

     public double areaTrianle (){
        double geronP = (getSideA() + getSideB() + getSideC())/2;
        double areaTriangle = Math.sqrt(geronP*(geronP-getSideA())*(geronP-getSideB())*(geronP-getSideC()));
        return areaTriangle;


    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

  public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }



}

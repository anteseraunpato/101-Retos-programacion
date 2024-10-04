public class areaPoligono {

private double areaTriangulo(double lado1, double lado2) {
    double areaT = (lado1*lado2)/2;
    return areaT;
}

    private double areaRectangulo(double lado1, double lado2) {
        double areaR = lado1*lado2;
        return areaR;
    }

public double areaCuadrado(double lado1) {
        double areaC = lado1*lado1;
        return areaC;
    }

    // Usando las funciones

    public static void main(String[] args) {
    areaPoligono triangulo = new areaPoligono();
    double areaT = triangulo.areaTriangulo(5,5);

    areaPoligono rectangulo = new areaPoligono();
    double areaR = rectangulo.areaRectangulo(5,2);

    areaPoligono cuadrado = new areaPoligono();
    double areaC = cuadrado.areaCuadrado(5);

        System.out.println(areaT);
        System.out.println(areaC);
        System.out.println(areaR);
    }
}
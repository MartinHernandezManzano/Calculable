public class CalculadoraBasica implements Calculable {
    @Override
    public double calcular(double a, double b, String operacion) {
        switch (operacion.toLowerCase()){
            case "suma":
                return a + b;
            case "resta":
                return a - b;
            case "multiplicacion":
                return a * b;
            case "division":
                if (b != 0) {
                    return a / b;
                } else {
                    throw new ArithmeticException("No se puede dividir entre cero");
                }
            default:
                throw new UnsupportedOperationException("Operación no soportada en calculadora básica");
        }
    }
}

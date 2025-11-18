public class CalculadoraCientifica implements Calculable {

    //volvemos a sobrescribir el metodo calcular y ponemos un switch para las dos operaciones cientificas
    @Override
    public double calcular(double a, double b, String operacion) {
        switch (operacion.toLowerCase()) {
            case "potencia":
                return Math.pow(a, b);
            case "raiz":
                if (a >= 0) {
                    return Math.sqrt(a);
                } else {
                    throw new ArithmeticException("No se puede calcular la raíz cuadrada de un número negativo");
                }
            default:
                throw new UnsupportedOperationException("Operación no soportada en calculadora científica");
        }
    }
}

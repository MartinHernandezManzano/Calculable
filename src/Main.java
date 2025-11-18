public class Main {
    public static void main(String[] args) {

        //creamos un objeto de cada tipo
        Calculable basica = new CalculadoraBasica();
        Calculable cientifica = new CalculadoraCientifica();

        // Operaciones básicas
        System.out.println("Suma: " + basica.calcular(10, 5, "suma"));
        System.out.println("Resta: " + basica.calcular(10, 5, "resta"));
        System.out.println("Multiplicación: " + basica.calcular(10, 5, "multiplicacion"));
        System.out.println("División: " + basica.calcular(10, 5, "division"));

        // Operaciones científicas
        System.out.println("Potencia: " + cientifica.calcular(2, 3, "potencia"));
        System.out.println("Raíz cuadrada: " + cientifica.calcular(16, 0, "raiz"));
    }
}

